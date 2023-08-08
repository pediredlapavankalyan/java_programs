package jpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class LIstProducts {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("mssqlserver_msdb");
		EntityManager em = emf.createEntityManager();
		// Create an instance of TypedQuery
		var query = em.createQuery("from Products", Product.class);
		var list = query.getResultList();
		for (var s : list) {
			System.out.println(s);
		}
	}

}
