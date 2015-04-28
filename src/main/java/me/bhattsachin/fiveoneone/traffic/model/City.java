package me.bhattsachin.fiveoneone.traffic.model;

public class City{
	String city;
	Integer jobs;
	String node;
	
	public City(String city, Integer jobs) {
		super();
		this.city = city;
		this.jobs = jobs;
		// TODO Auto-generated constructor stub
	}
	
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public Integer getJobs() {
		return jobs;
	}
	public void setJobs(Integer jobs) {
		this.jobs = jobs;
	}

	public String getNode() {
		return node;
	}

	public void setNode(String node) {
		this.node = node;
	}

	@Override
	public String toString() {
		return "City [city=" + city + ", jobs=" + jobs + ", node=" + node + "]";
	}
	
	
	
	
}

