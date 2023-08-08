package pubs;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ListTtile {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("mssqlserver_pubs");
		EntityManager em = emf.createEntityManager();
		var list = em.createQuery("from pubs.Title", Title.class).getResultList();
		for (var t : list) {
//			System.out.printf("%-6s %-20s %4s %-10s \n ", t.getTitle_id(), t.getTitle(), t.getPrice(),
//				t.getPublisher().getPub_name());
		}
		em.close();
		emf.close();
	}
}
