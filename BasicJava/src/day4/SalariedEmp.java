package day4;

public class SalariedEmp extends Employee
{
	protected int salary;
	public SalariedEmp(String name,String job,int salary) {
	super(name,job);
	this.salary=salary;
	}
	@Override
	public void print()
	{
		super.print();
		System.out.println(this.salary);
	}
	int getSalary()
	{
		return this.salary;
	}
	void setSalary(int salary)
	{
		this.salary=salary;
	}
	public static void main(String[] args) {
		Employee e1 = new SalariedEmp("pk", "devep",112312);
		e1.print();
		e1.eat();
	}
	
}
