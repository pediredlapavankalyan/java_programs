package oops;
class Intrest
{
	private double amount;
	private double intrestRate;
	public Intrest(double amount, int intrestRate) {
		this.amount = amount;
		this.intrestRate = intrestRate;
	}
	public Intrest(double amount) {
		this(amount,10);
	}
	double getAmount()
	{
		return amount;
	}
	void setAmount(double amount)
	{
		this.amount=amount;
	}
	double getIntrestRate()
	{
		return intrestRate;
	}
	void setIntrestRate(int intrestRate)
	{
		this.intrestRate=intrestRate;
	}
	double getIntrest()
	{
		return amount*intrestRate/100;
	}
	public String toString()
	{
		return this.intrestRate+"";
	}
	
}
public class TestIntrest {

	public static void main(String[] args) {
		Intrest i1 = new Intrest(10000);
		System.out.println("Intrest is "+i1.getIntrest());
		System.out.println(i1);

	}

}
