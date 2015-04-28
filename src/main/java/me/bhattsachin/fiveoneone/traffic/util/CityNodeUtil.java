package me.bhattsachin.fiveoneone.traffic.util;

import java.util.Set;

import com.google.common.collect.BiMap;
import com.google.common.collect.HashBiMap;

public class CityNodeUtil {
	
	private static BiMap<String, String> cityMap = HashBiMap.create();
	
	public static void add(String node, String city){
		if(!cityMap.containsKey(node) && !cityMap.containsValue(city)){
			System.out.println("adding node" + node + " ,  " + city);
			cityMap.put(node, city);
		}
		
	}
	
	public static String getCity(String node){
		return cityMap.get(node);
	}
	
	public static String getNode(String city){
		return cityMap.inverse().get(city);
	}
	
	public static Set<String> allCities(){
		return cityMap.values();
	}
	
	public static Set<String> allNodes(){
		return cityMap.keySet();
	}

}
