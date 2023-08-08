package day4;

public class ConsultantEmp extends Employee {
	private int hours;
	private double rate;
	public ConsultantEmp(String name,String job,int hours,double rate)
	{
		super(name,job);
		this.hours=hours;
		this.rate=rate;
	}
	int getHours()
	{
		return this.hours;
	}
	double getRate()
	{
		return this.rate;
	}
	void setHours(int hours)
	{
		this.hours=hours;
	}
	void setRate(double rate)
	{
		this.rate=rate;
	}
	@Override
	public void print()
	{
		super.print();
		System.out.println(this.hours);
		System.out.println(this.rate);
	}
}
