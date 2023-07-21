package test1;

import java.time.LocalDate;
import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		ArrayList<Flight> flights = new ArrayList<Flight>();
		flights.add(new Flight("1", "HYD", "DBR", 5000, 180, 150, "15:30", "13:15", "AIR INDIA"));
		flights.add(new Flight("2", "HYD", "PUNE", 15000, 80, 50, "12:30", "18:15", "JET AIRWAYS"));
		
		ArrayList<Address> addresses = new ArrayList<Address>();
		addresses.add(new Address("SECTOR - 1", "HYD", "TS"));
		
		ArrayList<Traveller> travellers = new ArrayList<Traveller>();
		travellers.add(new Traveller("Abhinav", "123456789", "1",LocalDate.now()));
		travellers.add(new Traveller("Kishan", "9087652319", "2",LocalDate.now()));
		
		Airport airport = new Airport(addresses, flights, travellers);
		
		
		System.out.println(airport.addFlight(new Flight("3", "HYD", "CCU", 44000, 89, 15, "09:30", "22:22", "VISTARA")));
		System.out.println(airport.addFlight(new Flight("4", "HYD", "DBR", 6666, 99, 3, "23:00", "18:07", "Indigo")));
//		
		airport.searchFlightsBySourceAndDestination("HYD","DBR");
		
		airport.bookTicket("1", travellers.get(0));
		airport.bookTicket("2", travellers.get(0));
		
		
		ArrayList<Flight> searchRes = airport.searchFlightsBySourceAndDestination("HYD", "DBR");
		System.out.println("#################################################");
		System.out.println("Total "+searchRes.size()+" flights found");
		for (int i=0;i<searchRes.size();i++) {
			System.out.println("Flight Id :- "+searchRes.get(i).getId());
			System.out.println("Flight Arival Tiem :- "+searchRes.get(i).getArrivalTime());
			System.out.println("Flight total seats :- "+searchRes.get(i).getTotalSeats());
			System.out.println("Flight remain seats :- "+searchRes.get(i).getAvailableSeats());
			System.out.println("Flight Detsianation :- "+searchRes.get(i).getDestiantion());
			
			System.out.println("#################################################");
			System.out.println();
			System.out.println();
		}
		
		airport.getAllFlights();
		
	}
}
