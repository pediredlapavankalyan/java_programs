package day6;

import java.util.Scanner;

public class GuessGameWIthHints {
	static long num = Math.round(Math.random() * 20);

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number between 1 to 20");
		int n = sc.nextInt(), chances = 3, ir = chances;
		for (int i = 1; i <= ir; i++) {
			if (n == num) {
				System.out.println("You won");
				break;
			} else
				n = print(--chances, n);
		}
	}

	public static int print(int chances, int n) {
		if (chances == 0) {
			System.out.println("Better luck next time");
			return 0;
		}
		if (n < num) {
			System.out.println("Hint:number is bigger then you entered");
		} else
			System.out.println("Hint:number is smaller then you entered");
		Scanner sc = new Scanner(System.in);
		System.out.println("you guess is wrong enter again");
		System.out.println(chances + " chances left");
		int num = sc.nextInt();
		return num;
	}

}
