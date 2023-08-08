package interfaces;

public class TestShape {
	public static void main(String[] args) {
		Circle c1 = new Circle(12);
		Circle c2 = new Circle(12);
		Circle c3 = new Circle(12);
		System.out.println(c1.area());
		System.out.println(c1.circumference());
		Square square1 = new Square(4);
		Square square2 = new Square(6);
		Square square3 = new Square(4);
		System.out.println(square1.area());
	
		// equals method Override
		System.out.println(c1.equals(c3));
		System.out.println(square1.equals(square3));
		
		// toString method Overriden
		System.out.println(c1);
		System.out.println(square1);
		
		// hashcode
		System.out.println(c1.hashCode());
		System.out.println(c2.hashCode());
		System.out.println(square1.hashCode());
		System.out.println(square3.hashCode());

	}
}
