package javalib;

import java.util.Arrays;
import java.util.Scanner;

public class SortedStr {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s[] = new String[3];
		for (int i = 0; i < s.length; i++) {
			System.out.println("Enter string " + i);
			s[i] = sc.next();
		}
		Arrays.sort(s);
		for (String temp : s)
			System.out.println(temp);
	}

}
