package exercise;

import java.util.Scanner;

public class Gcd {
	public static int min(int n1, int n2) {
		if (n1 > n2) {
			return n2;
		} else {
			return n1;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n1 ");
		int num1 = sc.nextInt();
		System.out.println("Enter n2 ");
		int num2 = sc.nextInt();
		int gcd = 1;
		for (int i = min(num1, num2); i > 1; i--) {
			if (num1 % i == 0 && num2 % i == 0) {
				{
					gcd = i;
					break;
				}

			}
		}
		System.out.println(gcd + " is the gcd of " + num1 + " and " + num2);

	}

}
