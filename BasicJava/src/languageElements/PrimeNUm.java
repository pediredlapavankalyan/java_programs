package languageElements;

import java.util.Scanner;

public class PrimeNUm {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("ENter a number");
		int num = sc.nextInt();
		boolean status = true;
		for (int i = 2; i <= num / 2; i++) {
			if (num % i == 0)
				status = false;
		}
		if (status == true)
			System.out.println("its a prime");
		else
			System.out.println("its not a prime");
	}
}
