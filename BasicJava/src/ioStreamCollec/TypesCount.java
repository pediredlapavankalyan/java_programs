package ioStreamCollec;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class TypesCount {

	public static void main(String[] args) throws IOException {
		File file = new File("/home/developer/filejava/sample.txt");
		FileReader fr = new FileReader(file);
		int asci, digit = 0, uc = 0, lc = 0;
		while ((asci = fr.read()) != -1) {
			if (Character.isDigit(asci)) {
				digit++;
			} else if (Character.isUpperCase(asci)) {
				uc++;
			} else if (Character.isLowerCase(asci)) {
				lc++;
			}

		}
		System.out.println("total uppercase characters is " + uc);
		System.out.println("total lowercase characters is " + lc);
		System.out.println("total digit characters is " + digit);

	}

}
