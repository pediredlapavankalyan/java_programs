package files;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class CreateFIle {

	public static void main(String[] args) {
		File f = new File("/home/developer/imagRushi/FirstDay.txt");
		try {
			if(f.createNewFile())
				System.out.println(f.getName());
			else
				System.out.println("File already created");
			FileWriter fw = new FileWriter(f,true);//true is for not to override the existing file
			fw.write("01-08-2023 is first day in this campus  /n");
			fw.flush();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
}
