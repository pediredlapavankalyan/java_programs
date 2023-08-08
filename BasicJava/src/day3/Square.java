package day3;

public class Square {
	private int side;

	public Square(int side) {
		this.side = side;
	}

	int getArea() {
		return side * side;
	}

	int getSide() {
		return side;
	}

	int getCircum() {
		return 4 * side;
	}
}
