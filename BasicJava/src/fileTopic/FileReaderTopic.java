package fileTopic;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderTopic {

	public static void main(String[] args) throws IOException {
	File file = new File("./sample.txt");
	FileReader fr = new FileReader(file);
	int asci;
	while((asci=fr.read())!=-1)
	{
		System.out.print((char)asci);
	}
	fr.close();
	}
	
}
