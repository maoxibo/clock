package com.mao.test;

import com.mao.controller.Annotation;

/**
 * Created by x on 2018/2/28.
 */
public class ProducerRun implements Runnable{
    private Resource resource;

    public ProducerRun(Resource resource){
        this.resource = resource;
    }

    @Override
    public void run() {
        while(true){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            resource.add();
        }
    }
}
