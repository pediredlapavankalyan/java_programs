package record;

record Circle(int x, int y, int radius) {
	public double getArea() {
		return Math.PI * Math.pow(radius, 2);
	}
}

public class Test {

	public static void main(String[] args) {
		var a = new Circle(1, 1, 2);
		System.out.println(a);
		System.out.println(a.getArea());
		System.out.println(a.y());
		System.out.println(a.hashCode());
	}
}
