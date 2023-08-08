package oops;

public class Account {
	private int acnum;
	private String ahName;
	private double bal;

	public Account(int acnum, String name) {
		this.acnum = acnum;
		this.ahName = name;
	}

	public Account(int acnum, String name, double bal) {
		this(acnum, name);
		this.bal = bal;
	}
	void deposit(double amt)
	{
		bal+=amt;
	}
	double getBal()
	{
		return bal;
	}
	
}
