package basics;

import java.util.Scanner;

public class ConditionalBase {
	public static void main(String[] args) {
		// creating a scanner object
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int num = sc.nextInt();// accessing number from user
		if (num % 3 == 0 && num % 5 == 0) {
			System.out.println(1);
		} else if (num % 3 == 0) {
			System.out.println(2);
		} else if (num % 5 == 0) {
			System.out.println(3);
		} else {
			System.out.println(4);
		}
		sc.close();
	}

}
