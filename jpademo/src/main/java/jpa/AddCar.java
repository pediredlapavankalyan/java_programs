package jpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class AddCar {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("mssqlserver_msdb_1");
		EntityManager em = emf.createEntityManager();
		Car c = new Car();
		c.setBrand("AUDI");
		c.setModel("A8SERIES");
		c.getAccessories().add("Floor mats");
		c.getAccessories().add("Cargo liners");
		c.getAccessories().add("Car covers");
		c.getAccessories().add("Seat covers");
		em.getTransaction().begin();
		em.persist(c);
		em.getTransaction().commit();
		em.close();
	}

}
