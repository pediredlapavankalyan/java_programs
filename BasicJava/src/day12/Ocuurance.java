package day12;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Ocuurance {
	private static final Object String = null;
	private static final Object Integer = null;

	public static void main(String[] args) throws IOException {
		var data = Files.readAllLines(Path.of("/home/developer/filejava/names.txt"));
		var names = new LinkedHashMap<String, Integer>();
		for (var key : data) {
			if (names.containsKey(key)) {
				names.replace(key, names.get(key) + 1);
			} else {
				names.put(key, 1);
			}
		}
		for (Map.Entry<String, Integer> name : names.entrySet()) {
			System.out.println(name.getKey() + " occurance is : " + name.getValue());
		}
	}
}
