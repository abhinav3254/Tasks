package test1;

import java.util.ArrayList;

public class Airport {
	
	private ArrayList<Address> addresses;
	private ArrayList<Flight> flights;
	private ArrayList<Traveller> travellers;
	
	private int flightIndex = 0;
	public Airport(ArrayList<Address> address, ArrayList<Flight> flights, ArrayList<Traveller> travellers) {
		this.addresses = addresses;
		this.flights = flights;
		this.travellers = travellers;
	}
	public ArrayList<Address> getAddress() {
		return addresses;
	}
	public ArrayList<Flight> getFlights() {
		return flights;
	}
	public ArrayList<Traveller> getTravellers() {
		return travellers;
	}
	public void setAddress(ArrayList<Address> address) {
		this.addresses = address;
	}
	public void setFlights(ArrayList<Flight> flights) {
		this.flights = flights;
	}
	public void setTravellers(ArrayList<Traveller> travellers) {
		this.travellers = travellers;
	}
	
	
	// add Flight
	public boolean addFlight(Flight flight) {
		flights.add(flight);
		System.out.println("Added");
		return true;
	}
	
	
	// search flight
	public ArrayList<Flight> searchFlightsBySourceAndDestination (String source,String destination) {
		ArrayList<Flight> arr = new ArrayList<Flight>();
		for (int i = 0;i<flights.size();i++) {
//			"compare each flight src and destination"
			if ((flights.get(i).getSource()).equals(source) && (flights.get(i).getDestiantion()).equals(destination)) {
				System.out.println("Found");
				arr.add(flights.get(i));
			}
			
		}
		return arr;
	}
	
	// book ticket
	public void bookTicket (String flightId,Traveller traveller) {
		
		for (int i = 0;i<flights.size();i++) {
			if ((flights.get(i).getId()).equals(flightId)) {
				if (flights.get(i).getTotalSeats()>0) {
					travellers.add(traveller);
					System.out.println("Booked");
					flights.get(i).setTotalSeats(flights.get(i).getTotalSeats()-1);
					System.out.println("Total Seats remain :- "+flights.get(i).getTotalSeats());
					return;
				} else {
					System.out.println("No seats");
				}
			}
		}
		
		System.out.println("Failed to book");
	}
	
	public void getAllFlights() {
		for (int i =0;i<flights.size();i++) {
			System.out.println("*****************************************");
			System.out.println("Flight Number :- "+flights.get(i).getId());
			System.out.println("Source :- "+flights.get(i).getSource());
			System.out.println("Destiantion :- "+flights.get(i).getDestiantion());
			System.out.println("Left Seats :- "+flights.get(i).getAvailableSeats());
			System.out.println("Total Seats :- "+flights.get(i).getTotalSeats());
		}
	}
	
}
