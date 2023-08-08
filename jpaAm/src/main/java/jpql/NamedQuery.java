package jpql;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class NamedQuery {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("mssqlserver_msdb");
		EntityManager em = emf.createEntityManager();
		
		var query =   em.createNamedQuery("ProductDetails");
		var products = query.getResultList();
		
		for(var p:products)
		{
			System.out.println(p);
		}
		 
		em.close();
		emf.close();

	}

}
