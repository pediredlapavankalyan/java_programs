package day2;

import java.util.Scanner;

public class GreaterThenAvg {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a[] = new int[3];
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			System.out.println("Enter value for index " + i + ":");
			a[i] = sc.nextInt();
			sum += a[i];
		}
		sum = sum / a.length;
		for (int n = 0; n < a.length; n++) {
			if (a[n] > sum) {
				System.out.println(a[n]);
			}
		}
		sc.close();
	}
}
