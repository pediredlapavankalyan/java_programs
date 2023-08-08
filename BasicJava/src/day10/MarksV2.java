package day10;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class MarksV2 {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter file location");
		String loc = sc.nextLine();
		FileReader fr;
		try {
			fr = new FileReader(loc);
			BufferedReader br = new BufferedReader(fr);
			while (true) {
				String line = br.readLine();
				if (line == null)
					break;
				String s[] = line.split(",");
				int sum = 0;
				for (int i = 1; i < s.length; i++) {
					try {
						sum += Integer.parseInt(s[i]);
					} catch (NumberFormatException e) {
						
					}
				}
				System.out.println(s[0] + " " + sum);
			}
		} catch (FileNotFoundException e) {
			System.out.println("Enter valid location of file");

		}

	}
}
