package exercise;

import java.util.Scanner;

public class ReverseNUmber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = sc.nextInt();
		while (num != 0) {
			System.out.print(num % 10);
			num /= 10;
		}

	}

}
