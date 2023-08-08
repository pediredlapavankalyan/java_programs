package javalib;

import java.util.Scanner;
import java.util.StringJoiner;

public class Separator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("ENter string");
		String s = sc.nextLine();
		int index = s.indexOf("END", 0);
		s = s.substring(0, index);
		System.out.println();
		StringJoiner sj = new StringJoiner("-");
		String sa[] = s.split(" ");
		for (String temp : sa) {
			sj.add(temp);
		}
		System.out.println(sj);
	}
}
