package com.spring.Autowired;

public class Addr {
	private String landmark;
	private String city;

	public String getLandmark() {
		return landmark;
	}

	public void setLandmark(String landmark) {
		this.landmark = landmark;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Addr() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Addr [landmark=" + landmark + ", city=" + city + "]";
	}

}
