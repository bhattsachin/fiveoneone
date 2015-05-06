package me.bhattsachin.fiveoneone.traffic.util;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;


public class CityNodeUtil {
	
	/**
	 * May 5, I find each city is represented by more than one node
	 * so this map has to be kind of list for a given city String. 
	 */
	private static Map<String, String> cityMap = new HashMap<String, String>();
	
	public static void add(String node, String city){
		if(city==null || "Unincorporated".equalsIgnoreCase(city)){
			/**
			 * Do not add Unincorporated stuff
			 */
			return;
		}
		if(!cityMap.containsKey(node)){
			System.out.println("adding node" + node + " ,  " + city);
			cityMap.put(node, city);
			
		}
		
	}
	
	public static String getCity(String node){
		return cityMap.get(node);
	}
	
	public static Set<String> getNode(String city){
		Set<String> nodes = new HashSet<String>();
		for(Map.Entry<String, String> cityNode : cityMap.entrySet()){
			if(cityNode.getValue().equals(city)){
				nodes.add(cityNode.getKey());
			}
		}
		return nodes;
	}
	
	
	
	public static Set<String> allNodes(){
		return cityMap.keySet();
	}

}
