package day12;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;

public class MarksList {
	public static void main(String[] args) throws IOException {
		ArrayList<Integer> markslist = new ArrayList<Integer>();
		RandomAccessFile raf = new RandomAccessFile("/home/developer/java_programs/BasicJava/marks.dat", "r");
		raf.seek(0);
		int count = (int) raf.length() / 4;
		for (int i = 0; i < count; i++) {
			markslist.add(raf.readInt());
		}
		raf.close();
		System.out.println(markslist);
	}
}
