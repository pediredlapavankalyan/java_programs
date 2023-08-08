package Inbuilt;

public class MethodsInString {
	public static void main(String[] args) {
		String s = "SgDsf";
		String s1 = "SgsDf";
		int a=10;
		System.out.println(s.charAt(2));
		System.out.println(s.codePointAt(0));
		System.out.println(s.codePointBefore(1));
		System.out.println(s.codePointCount(0, 4));
		System.out.println(s.compareTo(s1));
		System.out.println(s.compareToIgnoreCase(s));
		System.out.println(s.concat("hi"));
		System.out.println(s.contains(s));
		System.out.println(s.contentEquals(s));
		System.out.println(s.valueOf(a));
		
	}
}
