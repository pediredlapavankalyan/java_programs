package assMap;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ListPayment {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("mssqlserver_msdb");
		EntityManager em = emf.createEntityManager();
		var payment = em.createQuery("from assMap.Payment", Payment.class).getResultList();
		for (var d : payment) {
			System.out.printf("Student id = %3d name = %-20s amount=%3d\n ",d.getStudent().getStudent_id(),d.getStudent().getStudent_name(),d.getAmount());
		}
		em.close();
		emf.close();
	}

}
