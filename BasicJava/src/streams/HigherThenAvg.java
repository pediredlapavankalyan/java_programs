package streams;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.Stream;

public class HigherThenAvg {

	public static void main(String[] args) throws IOException {
		Stream<String> marks= Files.lines(Path.of("/home/developer/filejava/marks.txt"));
			var avg = marks.mapToInt(s->Integer.parseInt(s))
					.average()
					.getAsDouble();
			 marks= Files.lines(Path.of("/home/developer/filejava/marks.txt"));
			marks.mapToInt(s->Integer.parseInt(s))
			.filter(v-> v>avg)
			.forEach( System.out::println );
	}
}
