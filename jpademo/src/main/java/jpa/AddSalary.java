package jpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class AddSalary {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("mssqlserver_msdb");
		EntityManager em = emf.createEntityManager();
		// for version 1

		// Salaries salaries= new Salaries();
		// SalaryKey key = new SalaryKey();
		// key.setId(1);
		// key.setMonth(6);
		// salaries.setSalary(60000);
		// salaries.setSalaryKey(key);

		// for version 2
		SalaryVer2 s = new SalaryVer2(1, 8, 6600);
		em.getTransaction().begin();
		em.persist(s);
		em.getTransaction().commit();
		em.close();

	}

}
