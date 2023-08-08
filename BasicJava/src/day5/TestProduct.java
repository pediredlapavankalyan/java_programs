package day5;

abstract class Product {
	protected String name;
	protected int price;
	protected int quantity;

	public Product(String name, int price, int quantity) {
		super();
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}

	int getPrice() {
		return this.price;
	}

	int getQuantity() {
		return this.price;
	}

	void setPrice(int price) {
		this.price = price;
	}

	void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	void print() {
		System.out.println(this.name);
		System.out.println(this.price);
		System.out.println(this.quantity);
	}

	abstract double getNetPrice();
}

class ProductWithTax extends Product {
	protected static double taxRate;

	public ProductWithTax(String name, int price, int quantity, double taxRate) {
		super(name, price, quantity);
		this.taxRate = taxRate;
	}

	static double getTaxRate() {
		return taxRate;
	}

	static void setTaxRate(int taxRate) {
		taxRate = taxRate;
	}

	@Override
	void print() {
		super.print();
		System.out.println(this.taxRate);
	}

	@Override
	double getNetPrice() {
		return price * quantity + price * quantity * taxRate / 100;

	}
}

class ProductWithDiscount extends Product {
	protected double discount;

	public ProductWithDiscount(String name, int price, int quantity, double discount) {
		super(name, price, quantity);
		this.discount = discount;
	}

	double getDiscount() {
		return discount;
	}

	void setDiscount(int discount) {
		this.discount = discount;
	}

	void print() {
		super.print();
		System.out.println(this.discount);
	}

	@Override
	double getNetPrice() {
		return price * quantity - price * quantity * (discount / 100);

	}

}

class ImportedProduct extends ProductWithTax {
	protected double importTax;
	private double effectiveTax;

	public ImportedProduct(String name, int price, int quantity, double taxRate, double importTax) {
		super(name, price, quantity, taxRate);
		this.importTax = importTax;
		effectiveTax = importTax + taxRate + (importTax * taxRate / 100);
	}

	double getImportTax() {
		return this.importTax;
	}

	void setImportTax(int importTax) {
		this.importTax = importTax;
	}

	@Override
	double getNetPrice() {
		return price * quantity + price * quantity * effectiveTax / 100;
	}

	void print() {
		super.print();
		System.out.println(this.importTax);
	}
	double getEffectiveTax()
	{
		return this.effectiveTax;
	}
}

public class TestProduct {

	public static void main(String[] args) {
		ImportedProduct i1 = new ImportedProduct("Watch", 2000, 5, 5, 10);
		i1.print();
		System.out.println(i1.getNetPrice());
		Product p = new ProductWithTax("gonemad", 20, 3, 2);
		System.out.println(p.getNetPrice());

		Product p1 = new ProductWithDiscount("gonemad", 20, 3, 2);
		System.out.println(p1.getNetPrice());

		Product p2 = new ImportedProduct("gonemad", 20, 3, 2, 6);
		System.out.println(p2.getNetPrice());
		ImportedProduct i2 = new ImportedProduct("cap", 12343, 12, 3, 6);
		System.out.println("the effective tax% for this imported product is"+i2.getEffectiveTax());
	}

}
