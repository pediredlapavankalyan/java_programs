package check;

import java.util.Arrays;

public class StreamToList2 {
	public static void main(String[] args) {
		String [] values = { "Abc","Xyz", "Pqr", "Def" };
		
		var s = Arrays.stream(values);
		System.out.println(values);
		var l = s.toList();
		      
        System.out.println(l);
	}
}