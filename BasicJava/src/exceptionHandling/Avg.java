package exceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Avg {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter numbers to get average");
		int num, i = 0, sum = 0, count = 0;
		while (true) {
			try {
				count++;
				System.out.println(++i + ". ");
				num = sc.nextInt();
				sum += num;
				if (count == 10)
					break;
			} catch (InputMismatchException e) {
				sc.nextLine();
				count--;
			}
		}
		System.out.println("avg is " + (double) sum / (i - 1));
	}
}
