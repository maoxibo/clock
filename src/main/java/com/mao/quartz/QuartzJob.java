package com.mao.quartz;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.quartz.Job;
import org.quartz.JobDataMap;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

/**
 * 任务执行类
 * <br>----------------------------------------------------变更记录--------------------------------------------------
 * <br> 序号      |           时间                        	|   作者      |                          描述                                                         
 * <br> 0     | 2017年10月25日 下午8:34:04  	|  王军    | 创建
 */
public class QuartzJob implements Job {

    /**
     * 任务要执行的代码
     * @param arg0
     * @throws JobExecutionException
     * @see Job#execute(JobExecutionContext)
     * <br>----------------------------------------------------变更记录--------------------------------------------------
     * <br> 序号      |           时间                        	|   作者      |                          描述                                                         
     * <br> 0     | 2017年10月25日 下午8:52:09  	|  王军    | 创建
     */
	@Override
	public void execute(JobExecutionContext arg0) throws JobExecutionException {
        System.out.println(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date())+"是我了");

		JobDataMap dataMap = arg0.getMergedJobDataMap();
		System.out.println(dataMap.getString("msg "));
	}
}