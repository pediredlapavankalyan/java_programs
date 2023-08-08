package day3;

public class SaleTrans {
	private double quantity;
	private double price;

	public SaleTrans(double price) {
		this.price = price;
		this.quantity = 1;
	}

	public SaleTrans(double price, double quantity) {
		this.price = price;
		this.quantity = quantity;
	}

	void setPrice(double price) {
		this.price = price;
	}

	double getPrice() {
		return price;
	}

	void setQuantity(double quantity) {
		this.quantity = quantity;
	}

	double getQuantity() {
		return quantity;
	}

	double getAmount() {
		double total = price * quantity;
		return total + (total * 0.12);
	}
}
