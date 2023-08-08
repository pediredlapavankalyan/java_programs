package exceptionHandling;

class InsufficientQuantityException extends Exception {
}

class InvalidQuantityException extends Exception {
}

public class Product {
	private String name;
	private int price;
	private int qoh;

	public Product(String name, int price, int qoh) {
		this.name = name;
		this.price = price;
		this.qoh = qoh;
	}

	void print() {
		System.out.println("product name :" + this.name);
		System.out.println("Price : " + this.price);
		System.out.println("Quantity in hands " + this.qoh);
	}

	int getNetPrice() {
		return price * qoh;
	}

	void setPrice(int price) {
		this.price = price;
	}

	void sale(int units) throws InsufficientQuantityException {
		if (units <= this.qoh) {
			qoh -= units;
			System.out.println("units sold " + units);
		}

		else
			throw new InsufficientQuantityException();
	}

	void purchase(int units) throws InvalidQuantityException {
		if (units < 0) {
			throw new InvalidQuantityException();
		} else {
			qoh += units;
			System.out.println(units + " units purchased");
			System.out.println("Total Quantity in hand : " + qoh);
		}
	}
}