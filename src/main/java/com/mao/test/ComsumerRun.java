package com.mao.test;

/**
 * Created by x on 2018/2/28.
 */
public class ComsumerRun implements Runnable {

    private Resource resource;

    public ComsumerRun(Resource resource){
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
            resource.remove();
        }
    }
}
