package languageElements;

import java.util.Scanner;

public class NumOfDays {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter year and month");
		int year = sc.nextInt();
		int month = sc.nextInt();
		if (month != 2) {
			if (month < 8 && month % 2 != 0)
				System.out.println("31 days");
			else if (month % 2 == 0 && month >= 8)
				System.out.println("31 days");
			else
				System.out.println("30 days");
		} else {
			if ((year % 400 == 0 )||( year % 4 == 0) && year % 100 != 0) {
				System.out.println("29 days");
			}
			else
				System.out.println("28days");
		}
	}

}
