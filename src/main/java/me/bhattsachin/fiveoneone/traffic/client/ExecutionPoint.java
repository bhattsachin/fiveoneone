package me.bhattsachin.fiveoneone.traffic.client;

import java.io.IOException;

import me.bhattsachin.fiveoneone.traffic.model.City;
import me.bhattsachin.fiveoneone.traffic.model.origin.Origins;
import me.bhattsachin.fiveoneone.traffic.model.path.Paths;
import me.bhattsachin.fiveoneone.traffic.util.CityNodeUtil;
import me.bhattsachin.fiveoneone.traffic.util.JobCityUtil;

import org.apache.http.client.ClientProtocolException;

public class ExecutionPoint extends WebClient{
	
	
	
	public static void main(String[] args) throws ClientProtocolException, IOException { 
		
		ExecutionPoint thread = new ExecutionPoint();
		
		/**
		 * 1. find all origin nodes and cities
		 */
		Origins origins = thread.fetchOrigin();
		populateCity(origins);
		
		/**
		 * 2. find nodes for all job cities
		 */
		populateJobCityNodes();
		printJobCityNodes();
		printCityStats();
		
		/**
		 * 3. find path from all cities to job and job locations to all cities
		 * This is a bidirectional graph so we need to count them both ways. 
		 */
		thread.populateAllPaths();
		
		
		

	}
	
	private static void populateCity(Origins origins){
		for(Origins.Origin origin : origins.getDestination()){
			CityNodeUtil.add(String.valueOf(origin.getNode()), origin.getCity());
		}
	}
	
	private void populateAllPaths(){
		Paths paths = null;
		for(String homecode : CityNodeUtil.allNodes()){
			for(City city : JobCityUtil.getCities()){
				try{
					paths = fetchPath(homecode, city.getNode());
					System.out.println(paths);
				}catch(Exception ex){
					ex.printStackTrace();
					
				}
			}
		}
		
		
		/**
		 * Path for returning home from office
		 */
		for(City city : JobCityUtil.getCities()){
			
		}
	}
	
	private static void populateJobCityNodes(){
		String node;
		for(City city : JobCityUtil.getCities()){
			node = CityNodeUtil.getNode(city.getCity());
			city.setNode(node);
		}
	}
	
	private static void printJobCityNodes(){
		for(City city : JobCityUtil.getCities()){
			System.out.println(city);
		}
	}
	
	private static void printCityStats(){
		System.out.println("Total cities:" + CityNodeUtil.allCities().size());
	}
	

}
