package jpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ListCar {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("mssqlserver_msdb_1");// argument--name of the
		// persistence unit
		EntityManager em = emf.createEntityManager();
		// Create an instance of TypedQuery
		var query = em.createQuery("from Car", Car.class);
		var list = query.getResultList();
		for (var car : list) {
			System.out.println(car);
		}

	}

}
