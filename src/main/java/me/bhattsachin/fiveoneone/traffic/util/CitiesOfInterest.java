package me.bhattsachin.fiveoneone.traffic.util;

import java.util.HashSet;
import java.util.Set;

/**
 * If we run this through all possible cities 
 * that comes around ~138+x * 10 possible combinations one way
 * 
 * This is taking way too long and 511.org might restrict our IP from further access. So let's run this on a smaller number 
 * as listed in here
 * @author root
 *
 */
public class CitiesOfInterest {

	public static Set<String> cities = new HashSet<String>();
	
	static{
		cities.add("San Jose");
		cities.add("San carlos");
		cities.add("Dublin");
	}
	
}
