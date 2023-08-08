package inheritance;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity(name = "inheritance.Square")
@DiscriminatorValue("2")
public class Square extends Shape {
	protected int side;

	public int getSide() {
		return side;
	}

	public void setSide(int side) {
		this.side = side;
	}

	public double getArea() {
		return this.side * this.side;
	}

	public double getPerimeter() {
		return 4 * this.side;
	}
}
