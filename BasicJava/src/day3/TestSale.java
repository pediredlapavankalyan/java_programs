package day3;

public class TestSale {
public static void main(String[] args) {
	SaleTrans rv = new SaleTrans(100,5);
	System.out.println(rv.getAmount());
	rv.setQuantity(10);
	System.out.println(rv.getAmount());
}
}
