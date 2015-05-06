package me.bhattsachin.fiveoneone.traffic.model;

import java.text.SimpleDateFormat;
import java.util.Date;

import me.bhattsachin.fiveoneone.traffic.model.path.Paths;


/**
 * Data will be written to disk from this model
 * @author root
 *
 */
public class TravelTime {
	private String from;
	private String to;
	
	/**
	 * there can be more than one path
	 */
	private Paths path;
	/**
	 * date and time this data was taken
	 */
	private Date time;
	@Override
	public int hashCode() {
		StringBuilder sb = new StringBuilder();
		sb.append(from);
		sb.append(to);
		sb.append(path);
		return Integer.valueOf(sb.toString());
	}
	
	
	
	public TravelTime(String from, String to, Paths paths, Date time) {
		super();
		this.from = from;
		this.to = to;
		this.path = paths;
		this.time = time;
	}
	
	public String compressedValue(){
		StringBuffer sb = new StringBuffer();
		sb.append(this.from);
		sb.append("|");
		sb.append(this.to);
		sb.append("|");
		sb.append(this.path.getPath().get(0).compressedVal());
		sb.append("|");
		sb.append(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.S").format(time));
		
		return sb.toString();
	}

	


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(this.from);
		sb.append(this.to);
		sb.append(this.path);
		return "";
	}



	public String getFrom() {
		return from;
	}
	public void setFrom(String from) {
		this.from = from;
	}
	public String getTo() {
		return to;
	}
	public void setTo(String to) {
		this.to = to;
	}
	
	public Date getTime() {
		return time;
	}
	public void setTime(Date time) {
		this.time = time;
	}
	
	
	
	
	
	

}
