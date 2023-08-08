package day13;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneNum {

	public static void main(String[] args) throws IOException {
		File target = new File("/home/developer/filejava/validphone.txt");
		var list = Files.readAllLines(Path.of("/home/developer/filejava/phonenum.txt"));
		FileWriter fw = new FileWriter(target);
		Pattern pattern = Pattern.compile("[0-9]{10}");
		var validnum = new ArrayList<Integer>();
		for (var num : list) {
			Matcher matcher = pattern.matcher(num);
			while (matcher.find()) {
				validnum.add(Integer.parseInt(matcher.group()));
			}
		}
		validnum = (ArrayList<Integer>) validnum.stream().sorted().toList();
		for (var write : validnum) {
			fw.write(write);
		}
		fw.close();
	}

}
