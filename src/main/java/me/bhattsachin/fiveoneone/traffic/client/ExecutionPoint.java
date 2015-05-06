package me.bhattsachin.fiveoneone.traffic.client;

import java.io.IOException;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import me.bhattsachin.fiveoneone.traffic.model.City;
import me.bhattsachin.fiveoneone.traffic.model.TravelTime;
import me.bhattsachin.fiveoneone.traffic.model.origin.Origins;
import me.bhattsachin.fiveoneone.traffic.model.path.Paths;
import me.bhattsachin.fiveoneone.traffic.util.CitiesOfInterest;
import me.bhattsachin.fiveoneone.traffic.util.CityNodeUtil;
import me.bhattsachin.fiveoneone.traffic.util.JobCityUtil;

import org.apache.http.client.ClientProtocolException;

public class ExecutionPoint extends WebClient {

	public static void main(String[] args) throws ClientProtocolException,
			IOException {

		long start = System.currentTimeMillis();
		execute();
		System.out.println("total time:" + ((System.currentTimeMillis()-start))/1000 + " seconds");

	}



	private static void execute() throws ClientProtocolException, IOException {
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
	
	

	private static void populateCity(Origins origins) {
		for (Origins.Origin origin : origins.getDestination()) {
			CityNodeUtil
					.add(String.valueOf(origin.getNode()), origin.getCity());
		}
	}

	/**
	 * In first iteration we will never be able to make use of information
	 * stored in disconnected cities util, hopefully this will come in handy and
	 * save us later
	 */
	private void populateAllPaths() {
		Paths paths = null;
		TravelTime traveltime = null;
		String homeCity = null;
		Set<String> coveredCity = new HashSet<String>();
		for (String homecode : CityNodeUtil.allNodes()) {
			
			homeCity = CityNodeUtil.getCity(homecode);
			//!CitiesOfInterest.cities.contains(homeCity)
			if(coveredCity.contains(homeCity)){
				continue;
			}
			
			coveredCity.add(homeCity);
			
			System.out.println("homecity" + homeCity);
			
			for (City city : JobCityUtil.getCities()) {
				for (String jobCityNode : city.getNode()) {
					try {
						/**
						 * Don't look for path for same city
						 */

						if (homecode.equals(jobCityNode)) {
							continue;
						}

						Thread.sleep((long) (50 + Math.random() * 20));

						paths = fetchPath(homecode, jobCityNode);

						if (paths != null && paths.getPath() != null
								&& !paths.getPath().isEmpty()
								&& paths.getPath().size() > 0) {
							
							traveltime = new TravelTime(homecode, jobCityNode, paths, new Date());

							System.out.println(traveltime.compressedValue());
						} else {
							System.out.println(CityNodeUtil.getCity(homecode)
									+ "->" + city.getCity() + " no path found"
									+ paths);
							System.out.println(homecode + "," + jobCityNode);
							continue;
						}
						
						/**
						 * running this only one time: one city can have multiple nodes
						 */
						
						break;
						
						 //System.out.println(paths);
					} catch (Exception ex) {
						// ex.printStackTrace();
						// we also black list them here
						ex.printStackTrace();
					}

					

				}

			}
		}

		/**
		 * Path for returning home from office
		 */
		for (City city : JobCityUtil.getCities()) {

		}
	}

	private static void populateJobCityNodes() {
		Set<String> node;
		for (City city : JobCityUtil.getCities()) {
			node = CityNodeUtil.getNode(city.getCity());
			city.setNode(node);
		}
	}

	private static void printJobCityNodes() {
		for (City city : JobCityUtil.getCities()) {
			System.out.println(city);
		}
	}

	private static void printCityStats() {
		System.out.println("Total cities:" + CityNodeUtil.allNodes().size());
	}

}
