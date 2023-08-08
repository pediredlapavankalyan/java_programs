package day6;

public class RandomNUmbers {
	public static void main(String[] args) {
		long a[] = new long[10];
		for (int i = 0; i < a.length; i++) {
			a[i] = Math.round(Math.random() * 100);
		}
		for (long i : a) {
			if (i < 50)
				System.out.println(i);
		}
		for (long i : a) {
			if (i > 50)
				System.out.println(i);
		}
	}
}
