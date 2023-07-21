package test1;

import java.time.LocalDate;

public class Traveller {
	private String name;
	private String mobile;
	private String flightId;
	private LocalDate date;
	public Traveller(String name, String mobile, String flightId, LocalDate date) {
		super();
		this.name = name;
		this.mobile = mobile;
		this.flightId = flightId;
		this.date = date;
	}
	public String getName() {
		return name;
	}
	public String getMobile() {
		return mobile;
	}
	public String getFlightId() {
		return flightId;
	}
	public LocalDate getDate() {
		return date;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public void setFlightId(String flightId) {
		this.flightId = flightId;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	
	
}
