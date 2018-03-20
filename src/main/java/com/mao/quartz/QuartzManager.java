package com.mao.quartz;

import org.quartz.CronTrigger;
import org.quartz.JobDetail;
import org.quartz.Scheduler;
import org.quartz.SchedulerFactory;
import org.quartz.impl.StdSchedulerFactory;

/**
 * @Description: 定时任务管理类
 */
public class QuartzManager {

//    private static SchedulerFactory schedulerFactory = new StdSchedulerFactory();
//
//    /**
//     * @Description: 添加一个定时任务
//     * @param jobName 任务名
//     * @param jobGroupName 任务组名
//     * @param triggerName  触发器名
//     * @param triggerGroupName   触发器组名
//     * @param jobClass 任务
//     * @param time  时间设置，参考quartz说明文档
//     */
//    public static void addJob(String jobName, String jobGroupName, String triggerName, String triggerGroupName, Class jobClass, String time) {
//        try {
//            Scheduler sched = schedulerFactory.getScheduler();
//            JobDetail jobDetail = new JobDetail(jobName, jobGroupName, jobClass);// 任务名，任务组，任务执行类
//            // 触发器
//            CronTrigger trigger = new CronTrigger(triggerName, triggerGroupName);// 触发器名,触发器组
//            trigger.setCronExpression(time);// 触发器时间设定
//            sched.scheduleJob(jobDetail, trigger);
//            sched.start();
//        } catch (Exception e) {
//            throw new RuntimeException(e);
//        }
//    }
//
//    /**
//     * @Description: 修改一个任务的触发时间
//     * @param triggerName
//     * @param triggerGroupName
//     * @param time
//     */
//    public static void modifyJobTime(String triggerName, String triggerGroupName, String time) {
//        try {
//            Scheduler sched = schedulerFactory.getScheduler();
//            CronTrigger trigger = (CronTrigger) sched.getTrigger(triggerName, triggerGroupName);
//            if (trigger == null) {
//                return;
//            }
//            String oldTime = trigger.getCronExpression();
//            if (!oldTime.equalsIgnoreCase(time)) {
//                CronTrigger ct = (CronTrigger) trigger;
//                // 修改时间
//                ct.setCronExpression(time);
//                // 重启触发器
//                sched.rescheduleJob(triggerName, triggerGroupName, trigger);
//            }
//        } catch (Exception e) {
//            throw new RuntimeException(e);
//        }
//    }
//
//    /**
//     * @Description: 移除一个任务
//     * @param jobName
//     * @param jobGroupName
//     * @param triggerName
//     * @param triggerGroupName
//     */
//    public static void removeJob(String jobName, String jobGroupName, String triggerName, String triggerGroupName) {
//        try {
//            Scheduler sched = schedulerFactory.getScheduler();
//            sched.pauseTrigger(triggerName, triggerGroupName);// 停止触发器
//            sched.unscheduleJob(triggerName, triggerGroupName);// 移除触发器
//            sched.deleteJob(jobName, jobGroupName);// 删除任务
//        } catch (Exception e) {
//            throw new RuntimeException(e);
//        }
//    }
//
//    /**
//     * @Description:启动所有定时任务
//     */
//    public static void startJobs() {
//        try {
//            Scheduler sched = schedulerFactory.getScheduler();
//            sched.start();
//        } catch (Exception e) {
//            throw new RuntimeException(e);
//        }
//    }
//
//    /**
//     * @Description:关闭所有定时任务
//     */
//    public static void shutdownJobs() {
//        try {
//            Scheduler sched = schedulerFactory.getScheduler();
//            if (!sched.isShutdown()) {
//                sched.shutdown();
//            }
//        } catch (Exception e) {
//            throw new RuntimeException(e);
//        }
//    }
}