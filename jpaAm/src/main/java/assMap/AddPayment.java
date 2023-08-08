package assMap;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class AddPayment {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("mssqlserver_msdb");
		EntityManager em = emf.createEntityManager();
		Payment p1 = new Payment();
		Student s1= new Student();
		s1.setStudent_name("bharat");
		p1.setAmount(28000);
		p1.setDate("28-02-2022");
		p1.setStudent(s1);

		em.getTransaction().begin();
		em.persist(p1);
		em.getTransaction().commit();
		em.close();
		emf.close();

	}

}
