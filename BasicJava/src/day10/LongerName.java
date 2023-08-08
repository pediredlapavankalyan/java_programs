package day10;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class LongerName {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		String fileName = sc.nextLine();
		try {
			FileReader fr = new FileReader(fileName);
			BufferedReader br = new BufferedReader(fr);
			String name ;
			while (true) {
				name = br.readLine();
				if (name == null)
					break;
				else if (name.length() > 10)
					System.out.println(name);
			}
			;
		} catch (FileNotFoundException e) {
			System.out.println("Invalid file name");
		}

	}
}
