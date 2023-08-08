package pubs;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ListPublisher {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("mssqlserver_pubs");
		EntityManager em = emf.createEntityManager();
		var pub = em.createQuery("from pubs.Publisher", Publisher.class).getResultList();
		for (var publisher : pub) {
			System.out.println(publisher.getPub_name());
			int i = 0;
			for (var title : publisher.getTitle()) {
				System.out.println(++i + " : " + title.getTitle());
			}
			System.out.println("total count : " + i);
		}
		em.close();
		emf.close();
	}
}
