package day7;

import java.util.Scanner;

public class LargestString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = "";
		while (true) {
			System.out.println("Enter string");
			String s1 = sc.nextLine();
			if (s1.equals("")) {
				break;
			} else if (s1.compareToIgnoreCase(s) >= 0) {
				s = s1;
			}
		}
		System.out.println(s + "is the largest string");
	}

}
