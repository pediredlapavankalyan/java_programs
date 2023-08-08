package day10;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;
import java.util.Scanner;

public class Non_BlankLine {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter file location");
		String loc = sc.nextLine();
		FileReader fr;
		try {
			fr = new FileReader(loc);
			BufferedReader br = new BufferedReader(fr);
			LineNumberReader lnr= new LineNumberReader(fr);
			while (true) {
				String line;
				try {
					line = br.readLine();
					if (line == null)
						break;
					if(line.isBlank())
						continue;
					System.out.println(lnr.getLineNumber()+" "+line);
					
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				
			}
		} catch (FileNotFoundException e) {
			System.out.println("Enter valid location of file");

		}
	}
}
