package studentCourse;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ListCourses {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("mssqlserver_msdb");
		EntityManager em = emf.createEntityManager();
		var courselist = em.createQuery("from sc.Course",Course.class).getResultList();
		var studentlist = em.createQuery("from sc.Student",Student.class).getResultList();
		//displaying course name and student name who took that course
		for(var c:courselist)
		{
			if(c.getStudents().size()==0)//if course not taken by any student
				continue;
			System.out.println("Course name :"+c.getCourse_name());
			int i=0;
			for(var s:c.getStudents())
			{
				System.out.println(++i+" : "+s.getName());
			}
		}
		System.out.println("========================");
		//displaying students name and courses taken by them
		for(var s:studentlist)
		{
			if(s.getCourses().size()==0)//if student not taken any course
				continue;
			System.out.println("Student name :"+s.getName());
			int i=0;
			for(var c:s.getCourses())
			{
				System.out.println(++i+" : "+c.getCourse_name());
			}
		}

	}

}
