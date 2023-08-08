package inheritance;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class AddShapes {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("mssqlserver_msdb_1");
		EntityManager em = emf.createEntityManager();
		Circle c = new Circle();
		c.setRadius(12);
		c.setX_cor(123);
		c.setY_cor(345);
		Rectangle r = new Rectangle();
		r.setLength(10);
		r.setBreadth(11);
		Square sqr = new Square();
		sqr.setSide(10);
		em.getTransaction().begin();
		em.persist(c);
		em.persist(r);
		em.persist(sqr);
		em.getTransaction().commit();
		em.close();
		emf.close();
	}

}
