package jpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class AddProject {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("mssqlserver_msdb_1");
		EntityManager em = emf.createEntityManager();
		Client client = new Client();
		client.setName("byjus");
		client.setLocation("Banglore");
		Project project = new Project();
		project.setTitle("eduapp");
		project.setClient(client);
		em.getTransaction().begin();
		em.persist(project);
		em.getTransaction().commit();
		em.close();
	}

}
