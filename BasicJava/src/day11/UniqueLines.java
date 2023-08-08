package day11;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;

public class UniqueLines {

	public static void main(String[] args) throws IOException {
		HashSet hs1 = new HashSet<String>();
		HashSet hs2 = new HashSet<String>();
		File file1 = new File("/home/developer/java_programs/BasicJava/nameslist1.txt");
		File file2 = new File("/home/developer/java_programs/BasicJava/nameslist1.txt");
		FileReader f1 = new FileReader(file1);
		FileReader f2 = new FileReader(file2);

		BufferedReader br = new BufferedReader(f1);
		while (true) {
			String name = br.readLine();
			if (name == null)
				break;
			hs1.add(name);
		}
		br = new BufferedReader(f2);
		while (true) {
			String name = br.readLine();
			if (name == null)
				break;
			hs2.add(name);
		}

		hs1.addAll(hs2);
		System.out.println(hs1);
	}

}
