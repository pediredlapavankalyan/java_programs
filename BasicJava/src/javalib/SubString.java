package javalib;

import java.util.Scanner;
import java.lang.*;

public class SubString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string");
		String s = sc.nextLine();
		System.out.println("Enter the sub string");
		String sub = sc.nextLine();
		for (int i = 0; i < s.length(); i++) {
			int index = s.indexOf(sub, i);
			if (index != -1) {
				System.out.println(index);
				i = index;
			}
		}

	}

}
