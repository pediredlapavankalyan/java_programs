package day4;

class Person {
	protected String name, email;

	public Person(String name, String email) {
		this.name = name;
		this.email = email;
	}

	public void print() {
		System.out.println(this.name);
		System.out.println(this.email);
	}

	void setMail(String email) {
		this.email = email;
	}

}

class Teacher extends Person {
	protected String subject;

	public Teacher(String name, String email, String subject) {
		super(name, email);
		this.subject = subject;
	}

	void setSubject(String subject) {
		this.subject = subject;
	}

	@Override
	public void print() {
		super.print();
		System.out.println(this.subject);
	}

}

class Student extends Person {
	protected String course;

	public Student(String name, String email, String course) {
		super(name, email);
		this.course = course;
	}

	void setCourse(String course) {
		this.course = course;
	}

	@Override
	public void print() {
		super.print();
		System.out.println(this.course);
	}
}

public class TestPerson {

	public static void main(String[] args) {
		Teacher teacher = new Teacher("Pavan", "school@gmail", "java");
		Student student = new Student("Kalyan", "mpc@gmail.com", "Mpc");
		System.out.println(teacher.email);
		System.out.println(student.course);
	}
}
