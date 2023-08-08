package fileTopic;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Program1 {

	public static void main(String[] args) throws IOException {
		File file = new File("./sample.txt");
		if(!file.exists())
			System.out.println( file.createNewFile());
		FileInputStream fis = new FileInputStream(file);
		//read() only read one character 
		System.out.println((char)fis.read());//t asci 116 output
		int ascicode;
		while((ascicode=fis.read())!=-1)//EOF
		{
			System.out.print((char)ascicode);
		}
		 fis.close();
	}

}
