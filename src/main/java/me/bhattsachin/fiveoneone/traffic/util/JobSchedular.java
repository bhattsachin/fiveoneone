package me.bhattsachin.fiveoneone.traffic.util;

import me.bhattsachin.fiveoneone.traffic.client.ExecutionPoint;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;


public class JobSchedular implements Job{
	
	
	public void execute(JobExecutionContext context)
			throws JobExecutionException {
		 
		
				try{
					
					ExecutionPoint.execute();
					
				}catch(Exception ex){
					TrafficFileWriter.append(TrafficFileWriter.FILE_TYPES.JOB_EXCEPTION.name(), ex.getMessage());
				}
				
				System.out.println(++ExecutionPoint.jobCount + " job completed. " + TrafficFileWriter.TIMESTAMP + " created.");
				
		 
			}
}
