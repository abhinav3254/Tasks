package test1;

public class Address {
	private String area;
	private String city;
	private String state;
	public Address(String area, String city, String state) {
		super();
		this.area = area;
		this.city = city;
		this.state = state;
	}
	public String getArea() {
		return area;
	}
	public String getCity() {
		return city;
	}
	public String getState() {
		return state;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public void setState(String state) {
		this.state = state;
	}
	
}
