package inheritance;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity(name="inheritance.Circle")
@DiscriminatorValue("1")
public class Circle extends Shape{
	protected int radius;

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}
	public double getArea() {
		return Math.PI*Math.pow(radius,2);
	}
	public double getPerimeter()
	{
		return Math.PI*this.radius*this.radius;
	}
}
