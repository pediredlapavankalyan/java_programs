package day9;

import java.util.Arrays;
import java.util.Comparator;

public class UsingLamda {
	public static void main(String[] args) {
		String s[] = { "kumar", "kalyan", "sriharsha", "pavan", "bharatkumar" };
		// using lambda expression
		Arrays.sort(s, (s1, s2) -> s1.length() - s2.length());
		// using anonymous inner class
		Arrays.sort(s, new Comparator<String>() {
			public int compare(String s1, String s2) {
				return s1.length() - s2.length();
			}
		});

		for (var string : s)
			System.out.println(string);
	}
}
