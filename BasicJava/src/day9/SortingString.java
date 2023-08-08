package day9;

import java.util.Arrays;
import java.util.Comparator;

class Slength implements Comparator<String> {
	@Override
	public int compare(String s1, String s2) {

		return s1.length() - s2.length();
	}
}

public class SortingString {

	public static void main(String[] args) {
		String s[] = { "kumar", "kalyan", "sriharsha", "pavan", "bharatkumar" };
		Arrays.sort(s, new Slength());
		;
		for (var name : s)
			System.out.println(name);
		

	}

}
