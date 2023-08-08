package day11;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Scanner;

public class Marks {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		File file = new File("./marks.dat");
		RandomAccessFile raf = new RandomAccessFile(file, "rw");
		for (int i = 1; i < 21; i++) {
			raf.writeInt((int) Math.round(Math.random() * 100));
		}
		
	}

}
