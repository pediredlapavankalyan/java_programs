package javalib;

import java.util.*;

public class Words {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER A STRING");
		String s = sc.nextLine();
		String sa[] = s.split(" ");
		for (String word : sa) {
			System.out.println(word);
		}

	}

}
