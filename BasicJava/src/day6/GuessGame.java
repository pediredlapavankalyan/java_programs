package day6;

import java.util.Scanner;

public class GuessGame {
	public static void main(String[] args) {
		long num = Math.round(Math.random() * 20);
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number between 1 to 20");
		int chances = 3;
		for (int i = chances; i > 0; i--) {
			System.out.println(i + " chance left");
			int n = sc.nextInt();
			if (n == num) {
				System.out.println("You won");
				return;
			} else {
				System.out.println("you guess is wrong ");

			}
		}
		System.out.println("you lost");
	}
}
