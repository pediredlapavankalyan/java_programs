package day13;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.Stream;

public class TopFIveMarks {

	public static void main(String[] args) throws IOException {
		var marks = Files.readAllLines(Path.of("/home/developer/filejava/marks.txt"));
		long count = marks.stream().mapToInt(s -> Integer.parseInt(s)).count();
		count -= 5;
		int ar[] = marks.stream().mapToInt(s -> Integer.parseInt(s)).sorted().skip(count).toArray();
		for (int i = ar.length - 1; i >= 0; i--)
			System.out.println(ar[i]);

	}

}
