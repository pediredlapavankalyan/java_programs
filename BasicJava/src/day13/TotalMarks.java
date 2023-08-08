package day13;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TotalMarks {

	public static void main(String[] args) throws NumberFormatException, IOException {
		Pattern p = Pattern.compile("\\d+");
		FileReader fr = new FileReader("/home/developer/filejava/namemarks.txt");
		BufferedReader br = new BufferedReader(fr);
		String line;
		int sum = 0;
		while ((line = br.readLine()) != null) {
			Matcher matcher = p.matcher(line);
			while (matcher.find()) {
				sum += Integer.parseInt(matcher.group());
			}
		}
		System.out.println("Total is " + sum);
		br.close();
		fr.close();
	}

}
