package inheritance;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
@Entity(name = "inheritance.Rectangle")
@DiscriminatorValue("3")
public class Rectangle extends Shape {
	protected int length;
	protected int breadth;
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public int getBreadth() {
		return breadth;
	}
	public void setBreadth(int breadth) {
		this.breadth = breadth;
	}
	public double getArea() {
		return this.length * this.breadth;
	}

	public double getPerimeter() {
		return 2*(this.length+this.breadth);
	}
	
}
