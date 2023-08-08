package exercise;

public class PalendromeInRange {

	public static void main(String[] args) {
		for (int i = 1000; i <= 2000; i++) {
			int n = i, rev = 0;
			while (n != 0) {
				rev = rev * 10 + n % 10;
				n = n / 10;
			}
			if (rev == i)
				System.out.println(i);
		}

	}

}
