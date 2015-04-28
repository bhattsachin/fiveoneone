package me.bhattsachin.fiveoneone.traffic.model;

import java.util.Date;

import me.bhattsachin.fiveoneone.traffic.model.path.Paths;


/**
 * Data will be written to disk from this model
 * @author root
 *
 */
public class TravelTime {
	private City from;
	private City to;
	/**
	 * there can be more than one path
	 */
	private Paths paths;
	/**
	 * date and time this data was taken
	 */
	private Date time;
	@Override
	public int hashCode() {
		StringBuilder sb = new StringBuilder();
		sb.append(from);
		sb.append(to);
		sb.append(time.hashCode());
		return Integer.valueOf(sb.toString());
	}
	public City getFrom() {
		return from;
	}
	public void setFrom(City from) {
		this.from = from;
	}
	public City getTo() {
		return to;
	}
	public void setTo(City to) {
		this.to = to;
	}
	public Paths getPaths() {
		return paths;
	}
	public void setPaths(Paths paths) {
		this.paths = paths;
	}
	public Date getTime() {
		return time;
	}
	public void setTime(Date time) {
		this.time = time;
	}
	
	
	
	
	
	

}
