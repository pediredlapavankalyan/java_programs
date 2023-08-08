package day6;

import java.util.Arrays;
import java.util.Scanner;

public class SortingWords {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string");
		String s = sc.nextLine();
		String sa[] = s.split(" ");
		Arrays.sort(sa);
		for (String temp : sa)
			System.out.println(temp);
	}
}
