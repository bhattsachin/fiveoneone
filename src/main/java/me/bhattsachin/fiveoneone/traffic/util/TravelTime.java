package me.bhattsachin.fiveoneone.traffic.util;

import java.io.File;
import java.io.IOException;
import java.io.StringWriter;
import java.nio.file.Files;
import java.nio.file.Paths;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import me.bhattsachin.fiveoneone.traffic.model.destination.Destinations;
import me.bhattsachin.fiveoneone.traffic.model.destination.Destinations.Destination;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;


public class TravelTime {
	
	public static final String baseUrl="http://services.my511.org/traffic/getoriginlist.aspx?token=33f74986-ede3-4e51-9755-05eb1486e4f7";
	

	public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException, JAXBException {
		XmlMapper mapper = new XmlMapper();
		String content = new String(Files.readAllBytes(Paths.get("/home/bhatt/git/fiveoneone/resources/getdestinationlist.aspx.xml")));
		
		
		final JAXBContext context = JAXBContext.newInstance(Destinations.class);

		Unmarshaller unmarshaller = context.createUnmarshaller();

		//marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

		StringWriter writer = new StringWriter();

		Destinations origins = (Destinations)unmarshaller.unmarshal(new File("/home/bhatt/git/fiveoneone/resources/getdestinationlist.aspx.xml"));

		//Destinations origins = mapper.readValue(content, Destinations.class);
		
		for(Destination destination : origins.getDestination()){
			System.out.println(destination);
		}
		
	}

}
