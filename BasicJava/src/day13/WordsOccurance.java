package day13;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WordsOccurance {

	public static void main(String[] args) throws Exception {
		var data = Files.readAllLines(Path.of("/home/developer/filejava/Test.txt"));
		Pattern pattern = Pattern.compile("\\w+");
		var map = new TreeMap<String, Integer>();
		String word;
		for (var line : data) {
			Matcher matcher = pattern.matcher(line);
			while (matcher.find()) {
				word = matcher.group();
				if (map.containsKey(word)) {
					map.replace(word, map.get(word) + 1);
				} else {
					map.put(word, 1);
				}
			}
		}

		for (var list : map.entrySet()) {
			System.out.println(list.getKey() + " : " + list.getValue());
		}

	}

}
