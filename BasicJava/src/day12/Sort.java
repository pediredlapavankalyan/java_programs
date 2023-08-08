package day12;

import java.util.Comparator;
import java.util.TreeSet;
import java.util.Scanner;

public class Sort {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		TreeSet<String> strings = new TreeSet<>(new Comparator<String>() {

			@Override
			public int compare(String s1, String s2) {
				if (s1.length() == s2.length())
					return 1;
				else
					return s1.length() - s2.length();
			}

		});
		System.out.println("Enter Strings");
		int i = 1;
		String value;
		while (true) {
			System.out.print(i++ + ": ");
			value = sc.next();
			if (value.equalsIgnoreCase("end"))
				break;
			strings.add(value);
		}
		System.out.println(strings);

	}

}
