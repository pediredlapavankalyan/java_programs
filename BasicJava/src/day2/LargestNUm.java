package day2;

public class LargestNUm {

	public static void main(String[] args) {
		int l = args.length;
		if (l == 0)
			System.out.println("Numbers are missing");
		else {
			int large = Integer.parseInt(args[0]);
			for (String n : args) {
				int num = Integer.parseInt(n);
				if (num > large)
					large = num;
			}
			System.out.println("largest number is " + large);
		}
	}
}
