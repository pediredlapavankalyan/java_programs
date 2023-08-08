package day3;

import java.util.Scanner;

public class TestSquare {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Square square[] = new Square[5];
		for (int i = 0; i < square.length; i++) {
			System.out.print("Enter side for " + (i + 1) + " square : ");
			int side = sc.nextInt();
			square[i] = new Square(side);
			System.out.println(square[i].getArea() + " is the area of square");
		}
		sc.close();
	}

}
