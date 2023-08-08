package jpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ListCustomers {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("mssqlserver_msdb");// argument--name of the
																								// persistence unit
		EntityManager em = emf.createEntityManager();
		// Create an instance of TypedQuery
		var query = em.createQuery("from customer", Customer.class);
		var list = query.getResultList();
		for (var customer : list) {
			System.out.println(customer);
		}

	}

}
