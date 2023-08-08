package day11;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class SortNames {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		FileWriter fw = new FileWriter("./names.txt");
		System.out.println("Enter names and give end to stop");
		ArrayList<String> names = new ArrayList<String>();
		while (true) {
			String str = sc.next();
			if (str.equals("end"))
				break;
			names.add(str);
		}
		names.sort(null);
		for (String s : names) {
			fw.write(s + "\n");
		}
		fw.close();
	}
}