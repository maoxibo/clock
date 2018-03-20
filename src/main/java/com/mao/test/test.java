package com.mao.test;

import com.mao.controller.Annotation;
import org.springframework.stereotype.Controller;

import java.util.Scanner;

/**
 * Created by x on 2018/2/28.
 */
@Controller
public class test {

    public static void main(String[] arg){

        //1.生产者消费者模式，一目了然


//        Resource resource = new Resource();
//                 //生产者线程
//        ProducerRun p1 = new ProducerRun(resource);
//        ProducerRun p2 = new ProducerRun(resource);
//        ProducerRun p3 = new ProducerRun(resource);
//                 //消费者线程
//        ComsumerRun c1 = new ComsumerRun(resource);
//
//        Thread t1 = new Thread(p1);
//        Thread t2 = new Thread(p2);
//        Thread t3 = new Thread(p3);
//        t1.start();
//        t2.start();
//        t3.start();
//
//        Thread cc1 = new Thread(c1);
//        cc1.start();



        //2.递归测试
//        Scanner scan=new Scanner(System.in);
//        int n=scan.nextInt();
//        StringBuilder sb=new StringBuilder();
//        chooseMagic(n,sb);
//        System.out.println(sb.reverse().toString());

        //相反数的和
        System.out.print(sum(12));

    }

    static void chooseMagic(int n,StringBuilder sb){
        //递归的终止条件
        if(n==1){
            sb.append("1");
            return;
        }
        if(n==2){
            sb.append("2");
            return;
        }
        if(n%2==0){
            sb.append("2");
            chooseMagic((n-2)/2,sb);
        }else{
            sb.append("1");
            chooseMagic((n-1)/2,sb);
        }
    }

    public static int sum(int n){
        String a="";
        char[] c=Integer.toString(n).toCharArray();
        for(int i=c.length-1;i>=0;i--){
            //System.out.print(c[i]+"  ");
                a+=c[i];
        }

        return n+Integer.parseInt(a);
    }

    public int sum1(int n){
        String a="";
        char[] c=Integer.toString(n).toCharArray();
        for(int i=c.length-1;i>=0;i--){
            //System.out.print(c[i]+"  ");
            a+=c[i];
        }
        int a1 =n+Integer.parseInt(a);
        return a1;
    }


}
