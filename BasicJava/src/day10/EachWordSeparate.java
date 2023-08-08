package day10;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class EachWordSeparate {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		System.out.println("ENter the file  location");
		String fileName = sc.nextLine();
		try {
			
			FileReader fr = new FileReader(fileName);
			BufferedReader br = new BufferedReader(fr);

			while (true) {
				String name;
				name = br.readLine();//returns null at end of the file
				if (name == null)
					break;
				else {
					String s[] = name.split(" ");
					for (var word : s)
						System.out.println(word);
				}

			}
			;
		} catch (FileNotFoundException e) {
			System.out.println("Invalid file name");
		}

	}
}
