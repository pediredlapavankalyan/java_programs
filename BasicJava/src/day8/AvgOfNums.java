package day8;

import java.util.InputMismatchException;
import java.util.Scanner;

public class AvgOfNums {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter numbers to get average");
		int num, i = 0, sum = 0;
		while (true) {
			try {
				System.out.println(++i + ". ");
				num = sc.nextInt();
				sum += num;
				if (num == 0)
					break;
			} catch (InputMismatchException e) {
				sc.nextLine();
			}
		}
		System.out.println("avg is " + (double) sum / (i-1));
	}
}
