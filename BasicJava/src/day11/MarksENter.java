package day11;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class MarksENter {

	public static void main(String[] args) throws IOException {
		File file = new File("./markswithroll.txt");
		FileWriter fw = new FileWriter(file);
		for (int i = 1; i < 21; i++) {
			String s = (int) Math.round(Math.random() * 100) + "";
			fw.write(i + "," + s + "\n");
		}
		fw.close();
	}

}
