package day10;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class NamesToFile {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		String name;
		FileWriter fw = new FileWriter("/home/developer/java_programs/BasicJava/namesok",true);
		int i = 0;
		System.out.println("Enter names and enter End to Stop");
		while (true) {
			System.out.println((i++ + 1) + ". ");
			name = sc.nextLine();
			if (name.equalsIgnoreCase("end"))
				break;
			else {
				fw.write(name.toUpperCase() + "\n");

			}
		}
		fw.close();

	}



	
}
