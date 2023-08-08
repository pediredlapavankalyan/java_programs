package project;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ListScheduleFLight {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("mssqlserver_flight_info");
		EntityManager em = emf.createEntityManager();
		List<ScheduledFlight> list = em.createQuery("from ScheduledFlight",ScheduledFlight.class).getResultList();
		for(var sf:list)
			System.out.println(sf);
	}

}
