package day2;

import java.util.Scanner;

public class WageCal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter day in numbers starting with monday as 1 and end with sunday as 7: ");
		int day = sc.nextInt();
		System.out.println("Enter number of working hrs : ");
		int hrs = sc.nextInt();
		int wage = switch (day) {
		case 1, 2, 3 -> 100;
		case 4, 5 -> 125;
		case 6 -> 150;
		case 7 -> 200;
		default -> 0;
		};
		double total = wage * hrs;
		if (total > 1000)
			total += total * 0.1;
		System.out.println("Total amount to pay is " + total);
		sc.close();
	}
}
