package javalib;

import java.util.Scanner;

public class StringRev {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string");
		String s = sc.nextLine();
		StringBuffer sb = new StringBuffer(s);
		sb.reverse();
		System.out.println(sb);
	}

}
