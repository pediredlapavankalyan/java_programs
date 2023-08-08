package day9;

import java.util.Arrays;
import java.util.Comparator;

public class StringNumSort {
	public static void main(String[] args) {
		String s[] = { "AB123", "XY3", "PQ286", "DE12", "EF12", "EW0", "ER0" };
		Arrays.sort(s, (s1, s2) -> Integer.parseInt(s1.substring(2)) - Integer.parseInt(s2.substring(2)));
		for (var string : s)
			System.out.println(string);
	}
}
