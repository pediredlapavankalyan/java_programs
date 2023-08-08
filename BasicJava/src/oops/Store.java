package oops;

public class Store {
	private String name;
	private int price;
	private int qoh;
	
	public Store(String name, int price, int qoh) {
		this.name = name;
		this.price = price;
		this.qoh = qoh;
	}
	void print()
	{
		System.out.println("product name :"+this.name);
		System.out.println("Price : "+this.price);
		System.out.println("Quantity in hands "+this.qoh);
	}
	int getNetPrice()
	{
		return price*qoh;
	}
	void setPrice(int price)
	{
		this.price=price;
	}
	void sale(int units)
	{
		if(units<=this.qoh)
		{
			qoh-=units;
			System.out.println("units sold "+units);
		}
	
		else
			System.out.println("Insufficient  quantity of Stock");
	}
	void purchase(int units)
	{
		qoh+=units;
		System.out.println(units+" units purchased");
		System.out.println("Total Quantity in hand : "+qoh);
	}
	public static void main(String[] args) {
		Store p1 = new Store("Dall",150,50);
		p1.print();
		System.out.println("Net Price : "+p1.getNetPrice());
		p1.setPrice(100);
		p1.sale(50);
		System.out.println(p1.qoh);
		p1.purchase(100);
		System.out.println(p1.qoh);
		p1.print();
	}
}
