package jpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class AddCustomer {

	public static void main(String[] args) {
		//argument--name of the persistence unit
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("mssqlserver_msdb");//argument--name of the persistence unit
		EntityManager em = emf.createEntityManager();
		Customer c = new Customer();
		c.setName("Pavan");
		c.setEmail("pavan@gmail.com");
		c.setMobile("9110793168");
		//transaction begin from next line
		em.getTransaction().begin();
		em.persist(c);//instance managed and persistent.
		em.getTransaction().commit();//writing any unflushed changes to the database
		em.clear();
		emf.close();

	}

}
