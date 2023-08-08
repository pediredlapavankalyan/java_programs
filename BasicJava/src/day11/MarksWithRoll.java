package day11;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class MarksWithRoll {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the roll no of Student");
		String roll = sc.next();
		FileReader fr = new FileReader("/home/developer/java_programs/BasicJava/markswithroll.txt");
		BufferedReader br = new BufferedReader(fr);
		while (true) {
			String line = br.readLine();
			if (line == null)
				break;
			String ar[] = line.split(",");
			if (ar[0].equals(roll)) {
				System.out.println(roll + " got " + ar[1] + " marks");
				break;
			}
		}
	}
}