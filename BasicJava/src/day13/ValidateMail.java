package day13;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateMail {

	public static void main(String[] args) throws IOException {
		Pattern pattern = Pattern.compile("^[\\w+@\\w+.\\w+]$");
		FileReader fr = new FileReader("/home/developer/filejava/mails.txt");
		BufferedReader br = new BufferedReader(fr);
		String line;
		while ((line = br.readLine()) != null) {
			Matcher matcher = pattern.matcher(line);
			while (matcher.find()) {
				System.out.println(line);
			}
		}
		fr.close();
		br.close();
	}

}
