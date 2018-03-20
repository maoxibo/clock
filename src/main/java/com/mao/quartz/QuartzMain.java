package com.mao.quartz;

import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Date;
  
/** 
 * Main测试方法
 */  
public class QuartzMain {

    /**
     * 现在时间已经超过了配置的时间，配置触发时间永远都不会触发
     * @param args
     * @exception org.quartz.SchedulerException: Based on configured schedule, the given trigger will never fire.
     * <br>----------------------------------------------------变更记录--------------------------------------------------
     * <br> 序号      |           时间                        	|   作者      |                          描述                                                         
     * <br> 0     | 2017年10月25日 下午8:48:11  	|  王军    | 创建
     */
    public static void main(String[] args) {
        try {  



//            Date now = new Date();
//            System.out.println("一秒执行一次。。。");
//            QuartzManager1.addJob("jobName", "jobGroupName", "triggerName", "triggerGroupName", QuartzJob.class,"0/2 * * * * ? ");
//            Thread.sleep(5000);

            //QuartzManager1.addJob("jobName1", "jobGroupName1", "triggerName1", "triggerGroupName1", QuartzJob.class, "0/2 * * * * ? ");

//            System.out.println("修改成五秒执行一次。。。");
//            QuartzManager.modifyJobTime("triggerName", "triggerGroupName", CronUtils.getCron(now));
//            Thread.sleep(20000);
            
//            System.out.println("停止定时任务。。。");
//            QuartzManager.removeJob("jobName", "jobGroupName", "triggerName", "triggerGroupName");
//            QuartzManager.removeJob("jobName1", "jobGroupName1", "triggerName1", "triggerGroupName1");
              
        } catch (Exception e) {  
            e.printStackTrace();  
        }  
    }




}