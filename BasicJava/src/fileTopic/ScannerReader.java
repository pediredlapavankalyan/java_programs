package fileTopic;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class ScannerReader {

	public static void main(String[] args) throws FileNotFoundException {
		//creating a file or creating a file instance
		File file = new File("./sample.txt");
		//useing scanner reader to read the text file
		Scanner scanner = new Scanner(file);
		while(scanner.hasNext())
		{
			System.out.println(scanner.nextLine());
		}
		scanner.close();
		
	}

}
