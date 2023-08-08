package exercise;

public class FibonacciNUm {
	public static void main(String[] args) {
		int a = 0, b = 1, c;
		for (int i = 1; i < 11; i++) {
			System.out.println(a);
			c = a + b;
			a = b;
			b = c;

		}
	}
}
