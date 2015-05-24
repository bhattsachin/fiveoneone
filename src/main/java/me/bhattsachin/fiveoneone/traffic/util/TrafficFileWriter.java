package me.bhattsachin.fiveoneone.traffic.util;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class TrafficFileWriter {
	
	public static final String TXT = ".txt";
	public static final String RESOURCES_OUTPUT = "resources/output/";
	public static String TIMESTAMP = "default/";
	
	public static enum FILE_TYPES{
		
		NO_PATH, PATH, JOBS, CITY, EXCEPTION, URL, JOB_EXCEPTION, JOB_DETAILS
	}

	public static void append(String fileName, String text){
		String folderName = RESOURCES_OUTPUT + TIMESTAMP;
		
		File folder = new File(folderName);
		
		if(!folder.exists()){
			folder.mkdir();
		}
		
		String pathname = folderName + fileName +TXT;
		File file =new File(pathname);
		 
		//if file doesnt exists, then create it
		if(!file.exists()){
			try{
				file.createNewFile();
			}catch(Exception ex){
				ex.printStackTrace();
				return;
			}
			
		}

		//true = append file
		try{
		FileWriter fileWritter = new FileWriter(pathname,true);
        PrintWriter writer = new PrintWriter(new BufferedWriter(fileWritter));
        writer.println(text);
        writer.close();
		}catch(Exception ex){
			ex.printStackTrace();
			return;
		}
	       
	        

	}
	
	public static void write(String fileName, String text) throws FileNotFoundException, UnsupportedEncodingException{
		PrintWriter writer = new PrintWriter(RESOURCES_OUTPUT + TIMESTAMP + fileName + TXT, "UTF-8");
		writer.println(text);
		writer.close();
	}
	
	public static void main(String args[]) throws IOException{
		
		TrafficFileWriter.write("main", "amigo was here");
		TrafficFileWriter.append("jilo", "amigo was here again");
		TrafficFileWriter.append("jilo", "amigo was here so many times");
	}

}
