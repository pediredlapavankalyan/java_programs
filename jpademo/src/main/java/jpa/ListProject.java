package jpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ListProject {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("mssqlserver_msdb_1");// argument--name of the
		// persistence unit
		EntityManager em = emf.createEntityManager();
		// Create an instance of TypedQuery
		var query = em.createQuery("from jpa.Project", Project.class);
		var list = query.getResultList();
		for (var project : list) {
			System.out.println(project);
		}

	}

}
