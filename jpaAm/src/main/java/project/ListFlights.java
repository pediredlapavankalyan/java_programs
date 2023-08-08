package project;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ListFlights {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("mssqlserver_flight_info");
		EntityManager em = emf.createEntityManager();
//		 var flightslist =em.createQuery("from Flight ",Flight.class).getResultList();
//		 var listcity =em.createQuery("from City ",City.class).getResultList();
////		 //city list
//		 System.out.println("----------CIties list--------------");
//		 for(var city:listcity)
//			 System.out.println(city.getName());
//		 System.out.println("---------------flights list-----------");
////		 //flight list
//		 for(var flight:flightslist)
//			 System.out.println(flight);
//		 System.out.println("---------------flights from and to city -----------");
//		 //3rd question
//		 List<Flight> listflight= em.createQuery("from Flight where fromCity='DEL' AND toCity='BOM'",Flight.class).getResultList();
//		 for(var flight:listflight)
//			 System.out.println(flight.getFlightNo());
//		 //4th question
//		 List<FlightHistory> flightHistory = em.createQuery("from FlightHistory where flightNo=101",FlightHistory.class).getResultList();
//		 for(var flight:flightHistory)
//			 System.out.println(flight);
		
		
	}

}
