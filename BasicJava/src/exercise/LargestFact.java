package exercise;

import java.util.Scanner;

public class LargestFact {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("ENter a number");
		int num = sc.nextInt();
		for (int i = num / 2; i > 0; i--) {
			if (num % i == 0) {
				System.out.println("Largest factor is " + i);
				break;
			}
		}
		sc.close();
	}

}
