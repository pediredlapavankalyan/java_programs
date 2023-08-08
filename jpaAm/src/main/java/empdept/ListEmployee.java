package empdept;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import assMap.Payment;

public class ListEmployee {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("mssqlserver_msdb");
		EntityManager em = emf.createEntityManager();
		var emps = em.createQuery("from empdept.Employee", Employee.class).getResultList();
		for (var d : emps) {
			System.out.printf("%2d %-10s %4d %-10s \n",d.getEmpid(),d.getName(),d.getSalary(),d.getDepartment().getDeptname());
		}
		em.close();
		emf.close();
	}
	}
