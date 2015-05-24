package me.bhattsachin.fiveoneone.traffic.util;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import me.bhattsachin.fiveoneone.traffic.model.CityPair;

public class DeadNodeUtil {
	
	static List<CityPair> deadNodes = new ArrayList<CityPair>();
	static boolean isRead = false;
	
	
	/**
	 * Return true or false if the nodes are available
	 * @param source
	 * @param destination
	 * @return
	 */
	public static boolean isDead(String source, String destination){
		if(!isRead){
			try{
				readFile("resources/output/NO_PATH.txt");
				isRead = true;
			}catch(Exception ex){
				System.out.println(ex.getMessage());
			}
		}
		
		if(deadNodes.contains(CityPair.getInstance(source, destination))){
			return true;
		}
		
		return false;
	}
	
	
	/**
	 * 
	 * @param file
	 * @throws IOException
	 */
	private static void readFile(String file) throws IOException {
		File fin = new File(file);
		FileInputStream fis = new FileInputStream(fin);
	 
		//Construct BufferedReader from InputStreamReader
		BufferedReader br = new BufferedReader(new InputStreamReader(fis));
	 
		String line = null;
		CityPair pair;
		String[] tokens;
		while ((line = br.readLine()) != null) {
			tokens = line.split(",");
			if(tokens.length>2){
				pair = CityPair.getInstance(tokens[0], tokens[1]);
				deadNodes.add(pair);
			}
			System.out.println(line);
		}
	 
		br.close();
	}
	
	public static void main(String args[]) throws IOException{
		
		System.out.println(isDead("1257", "763"));
		System.out.println(isDead("1404","70"));
	}
	
	
	
	
	

}


