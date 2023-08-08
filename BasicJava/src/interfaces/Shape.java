package interfaces;

public interface Shape {
	double area();

	double circumference();
}

class Square implements Shape {
	private int side;

	public Square(int side) {
		super();
		this.side = side;
	}

	public int getSide() {
		return side;
	}

	public void setSide(int side) {
		this.side = side;
	}

	@Override
	public double area() {
		return Math.pow(side, 2);
	}

	@Override
	public double circumference() {

		return 4 * side;
	}
	public boolean equals(Object o)
	{
		Square s=(Square)o;
		return this.side==s.side;
	}
	@Override
	public String toString()
	{
		return this.area()+"";
	}
	@Override
	public int hashCode()
	{
		return (int) this.side;
	}
}

class Circle implements Shape {
	private double radius;

	public Circle(double radius) {
		super();
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	@Override
	public double area() {
		return Math.PI*Math.pow(radius, 2);
	}

	@Override
	public double circumference() { 
		return Math.PI*2*this.radius;
	}
	@Override
	public boolean equals(Object o)
	{
		Circle c=(Circle)o;
		return this.radius==c.radius;
	}
	@Override
	public String toString()
	{
		return this.area()+"";
	}
	@Override
	public int hashCode()
	{
		return (int) this.radius;
	}
}
