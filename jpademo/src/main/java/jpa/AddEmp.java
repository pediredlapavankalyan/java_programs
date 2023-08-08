package jpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class AddEmp {

	public static void main(String[] args) {
		EntityManagerFactory emp = Persistence.createEntityManagerFactory("mssqlserver_msdb");
		EntityManager em = emp.createEntityManager();
		Employee e = new Employee();
		e.setName("harsha");
		
		Employee e1=em.find(Employee.class, 8);
		if(e1==null)
			System.out.println("Sorry!");
		else
			System.out.println("Hello");
//		em.getTransaction().begin();
//		em.persist(e);

//		em.getTransaction().commit();
//		em.close();

	}

}
