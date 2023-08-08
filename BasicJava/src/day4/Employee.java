package day4;

public class Employee {
	protected String name,job;

	public Employee(String name, String job) {
		super();
		this.name = name;
		this.job = job;
	}
	public void print()
	{
		System.out.println(this.name);
		System.out.println(this.job);
	}
	public void eat()
	{
		System.out.println("eat");
	}
	
}
