package jpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ListPublisher {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("mssqlserver_pubs");// argument--name of the
																								// persistence unit
		EntityManager em = emf.createEntityManager();
		// Create an instance of TypedQuery
		var query = em.createQuery("from publishers", Publisher.class);
		var list = query.getResultList();
		for (var publisher : list)
			System.out.println(publisher);
		em.close();
		emf.close();
	}

}
