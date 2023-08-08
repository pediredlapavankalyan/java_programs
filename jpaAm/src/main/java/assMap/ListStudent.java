package assMap;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ListStudent {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("mssqlserver_msdb");
		EntityManager em = emf.createEntityManager();
		var student = em.createQuery("from assMap.Student", Student.class).getResultList();
		for (var d : student) {
			System.out.printf("Student id = %3d name = %-20s amount=%3d\n ", d.getStudent_id(), d.getStudent_name(),
					d.getPayment().getAmount());
		}
		em.close();
		emf.close();

	}

}
