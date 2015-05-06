package me.bhattsachin.fiveoneone.traffic.util;

import java.util.HashSet;
import java.util.Set;

import me.bhattsachin.fiveoneone.traffic.model.CityPair;

/**
 * We found some cities for which there is no route exist,
 * probably no one commutes between them via freeways or internal roads make more sense in those cases
 * By using this util set we will try to minimize our http calls for those locations
 * @author root
 *
 */
public class DisconnectedCitiesUtil {
	private static Set<CityPair> islands = new HashSet<CityPair>();
	
	public static boolean exists(String origin, String destination){
		return islands.contains(CityPair.getInstance(origin, destination));
	}
	
	public static void add(String origin, String destination){
		if(!exists(origin, destination)){
			islands.add(CityPair.getInstance(origin, destination));
		}
	}
	
}
