package day12;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Customer {

	public static void main(String[] args) throws IOException {
		var data = Files.readAllLines(Path.of("/home/developer/filejava/customerData.txt"));
		var map = new TreeMap<String, String>();
		for (var v : data) {
			String ar[] = v.split(",");
			map.put(ar[0], ar[1]);
		}
		for (var customer : map.entrySet()) {
			System.out.println(customer);
		}
	}
}
