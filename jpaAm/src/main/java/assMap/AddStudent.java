package assMap;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class AddStudent {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("mssqlserver_msdb");
		EntityManager em = emf.createEntityManager();
		Student s = new Student();
		Payment p = new Payment();
		s.setStudent_name("pavan");
		p.setAmount(10000);
		p.setDate("12-08-2022");
		p.setStudent(s);
		
		em.getTransaction().begin();
		em.persist(s);
		em.getTransaction().commit();
		em.close();
		emf.close();
	}

}
