package ioStreamCollec;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

//Remove all blank lines from a file. Make sure you display the original file eventually.
public class RemoveBlank {

	public static void main(String[] args) throws IOException {
		File file = new File("/home/developer/filejava/sample.txt");
		FileReader fr = new FileReader(file);
		BufferedReader br = new BufferedReader(fr);
		String originalcontent="";
		String line ;
		while(true)
		{
			line=br.readLine();
			if(line==null)
					break;
			if(!line.isBlank())
			 originalcontent=originalcontent+line;
		}
		FileWriter fw = new FileWriter(file);
		fw.write(originalcontent);
		fw.close();
		br.close();
	}

}
