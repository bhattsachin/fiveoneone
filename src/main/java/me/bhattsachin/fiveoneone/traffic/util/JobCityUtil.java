package me.bhattsachin.fiveoneone.traffic.util;

import java.util.ArrayList;
import java.util.List;

import me.bhattsachin.fiveoneone.traffic.model.City;

/**
 * cities with job
 * @author root
 *
 */
public class JobCityUtil {
	static List<City> cities = new ArrayList<City>();
	
	
//	San Francisco, CA (5194)
//	San Jose, CA (2535)
//	Palo Alto, CA (1355)
//	Santa Clara, CA (1337)
//	Mountain View, CA (1310)
//	Sunnyvale, CA (1308)
//	Santa Clara Valley, CA (681)
//	Redwood City, CA (672)
//	San Mateo, CA (563)
//	Menlo Park, CA (363)
//	San Bruno, CA (353)
//	Fremont, CA (309)
//	Pleasanton, CA (308)
//	Milpitas, CA (256)
//	Foster City, CA (256)
	
	static{
		cities.add(new City("San Francisco", 5194));
		cities.add(new City("San Jose", 2535));
		cities.add(new City("Palo Alto", 1355));
		cities.add(new City("Santa Clara", 1337));
		cities.add(new City("Mountain View", 1310));
		cities.add(new City("Sunnyvale", 1308));
		cities.add(new City("Redwood City", 672));
		cities.add(new City("San Mateo", 563));
		cities.add(new City("Menlo Park", 363));
		cities.add(new City("San Bruno", 353));
		cities.add(new City("Fremont", 309));
		cities.add(new City("Pleasanton", 308));
		cities.add(new City("Milpitas", 256));
		cities.add(new City("Foster City", 256));
	}

	
	
	
	
	public static List<City> getCities() {
		return cities;
	}





	public static void setCities(List<City> cities) {
		JobCityUtil.cities = cities;
	}





	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	
	

}


