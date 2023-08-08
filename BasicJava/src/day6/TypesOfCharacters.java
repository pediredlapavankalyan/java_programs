package day6;

import java.util.Scanner;

public class TypesOfCharacters {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		int digit = 0, uc = 0, lc = 0;
		for (int i = 0; i < s.length(); i++) {
			if (Character.isDigit(s.charAt(i))) {
				digit++;
				continue;
			} else if (Character.isUpperCase(s.charAt(i))) {
				uc++;
				continue;
			} else if (Character.isLowerCase(s.charAt(i))) {
				lc++;
			}
		}
		System.out.println("uppercase character count is " + uc);
		System.out.println("lowercase character count is " + lc);
		System.out.println("digit character count is " + digit);
	}
}
