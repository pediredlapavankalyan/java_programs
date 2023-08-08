package day13;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RemoveSpaces {

	public static void main(String[] args) throws IOException {
		FileReader fr = new FileReader("/home/developer/filejava/Spaces.txt");
		BufferedReader br = new BufferedReader(fr);
		Pattern pattern = Pattern.compile(" +");
		String line;
		while ((line = br.readLine()) != null) {
			System.out.println(line);
			Matcher matcher = pattern.matcher(line);
			line = matcher.replaceAll(" ");
			System.out.println(line);

		}
		fr.close();
		br.close();
	}

}
