package day9;

import java.util.Arrays;

public class StringWithNUm {

	public static void main(String[] args) {
		String s[] = { "AB123", "XY3", "PQ286", "DE12", "EF12", "EW0", "ER0" };
		int ar[] = new int[s.length];
		for (int i = 0; i < s.length; i++) {
			ar[i] = Integer.parseInt(s[i].substring(2));
		}
		Arrays.sort(ar);
		for (int i = 0; i < s.length; i++) {
			for (int j = 0; j < s.length; j++) {
				if (Integer.toString(ar[i]).equals(s[j].substring(2))) {
					System.out.println(s[j]);
					s[j] = "00O";
					break;
				}
			}
		}

	}

}
