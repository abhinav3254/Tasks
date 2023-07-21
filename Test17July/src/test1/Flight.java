package test1;

public class Flight {
	private String id;
	private String source;
	private String destiantion;
	private double fare;
	private int totalSeats;
	private int availableSeats;
	private String arrivalTime;
	private String departureTime;
	private String company;
	
	public Flight(String id, String source, String destiantion, double fare, int totalSeats, int availableSeats,
			String arrivalTime, String departureTime, String company) {
		this.id = id;
		this.source = source;
		this.destiantion = destiantion;
		this.fare = fare;
		this.totalSeats = totalSeats;
		this.availableSeats = availableSeats;
		this.arrivalTime = arrivalTime;
		this.departureTime = departureTime;
		this.company = company;
	}
	public String getId() {
		return id;
	}
	public String getSource() {
		return source;
	}
	public String getDestiantion() {
		return destiantion;
	}
	public double getFare() {
		return fare;
	}
	public int getTotalSeats() {
		return totalSeats;
	}
	public int getAvailableSeats() {
		return availableSeats;
	}
	public String getArrivalTime() {
		return arrivalTime;
	}
	public String getDepartureTime() {
		return departureTime;
	}
	public String getCompany() {
		return company;
	}
	public void setId(String id) {
		this.id = id;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public void setDestiantion(String destiantion) {
		this.destiantion = destiantion;
	}
	public void setFare(double fare) {
		this.fare = fare;
	}
	public void setTotalSeats(int totalSeats) {
		this.totalSeats = totalSeats;
	}
	public void setAvailableSeats(int availableSeats) {
		this.availableSeats = availableSeats;
	}
	public void setArrivalTime(String arrivalTime) {
		this.arrivalTime = arrivalTime;
	}
	public void setDepartureTime(String departureTime) {
		this.departureTime = departureTime;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	
	
}
