package check;

import java.util.Arrays;
import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String numbers = sc.nextLine();
		String[] arr = numbers.split(" ");
		int[] a = new int[arr.length];
		for (int i = 0; i < a.length; i++) {
			try {
				a[i] = Integer.parseInt(arr[i]);
			} catch (Exception e) {
				continue;
			}
		}
		int max = 0;
		int[] b = null;
		for (int i = 0; i < a.length; i++) {
			int sum = 0;
				for (int k = i; k < a.length; k++) {
					sum += a[k];
					if (sum > max) {
						int index = i;
						int c[] = new int[k - i + 1];
						for (int p = 0; p < c.length; p++) {
							c[p] = a[index++];
						}
						b = c;
						max = sum;
					}
			}

		}
		System.out.println(Arrays.toString(b));
		System.out.println(max);
	}
}
