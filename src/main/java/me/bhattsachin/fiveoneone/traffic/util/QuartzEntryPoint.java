package me.bhattsachin.fiveoneone.traffic.util;

import org.quartz.JobBuilder;
import org.quartz.JobDetail;
import org.quartz.Scheduler;
import org.quartz.SchedulerException;
import org.quartz.SimpleScheduleBuilder;
import org.quartz.Trigger;
import org.quartz.TriggerBuilder;
import org.quartz.impl.StdSchedulerFactory;



public class QuartzEntryPoint {

	
	public static void main(String args[]) throws SchedulerException{
		
		Trigger trigger = TriggerBuilder
				.newTrigger()
				.withIdentity("dummyTriggerName", "group1")
				.withSchedule(
				    SimpleScheduleBuilder.simpleSchedule()
					.withIntervalInSeconds(5).repeatForever())
				.build();
		
		
		JobDetail job = JobBuilder.newJob(JobSchedular.class)
				.withIdentity("dummyJobName", "group1").build();
		
		
		Scheduler scheduler = new StdSchedulerFactory().getScheduler();
    	scheduler.start();
    	scheduler.scheduleJob(job, trigger);
		
	}
}
