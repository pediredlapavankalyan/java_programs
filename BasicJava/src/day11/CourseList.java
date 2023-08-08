
package day11;

import java.util.HashSet;

public class CourseList {

	private String title;
	private int price;

	public CourseList(String title,int price)
		{
			this.title= title;
			this.price = price;
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet set = new HashSet<CourseList>();
		CourseList c[] = { new CourseList("java", 12000), new CourseList("python", 8000), new CourseList("c++", 9000),
				new CourseList("java", 12000) };
		for (var course : c) {
			set.add(course.title + " costs " + course.price);
		}
		System.out.println(set);

	}

}
