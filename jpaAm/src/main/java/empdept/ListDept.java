package empdept;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ListDept {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("mssqlserver_msdb");
		EntityManager em = emf.createEntityManager();
		var depts = em.createQuery("from empdept.Department", Department.class).getResultList();
		System.out.println("Here  department with respective employees salary list");
		for (var d : depts) {
			System.out.println(d.getDeptname());
			int total=0;
			for(Employee e :d.getEmployees())
			{
				System.out.printf("%-20s : %5d\n",e.getName(),e.getSalary());
				total+=e.getSalary();
			}
			System.out.printf("total salary is :  %5d\n",total);
		}
		em.close();
		emf.close();
	}

}
