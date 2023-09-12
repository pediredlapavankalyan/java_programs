package check;

public class Strings {

	public static void main(String[] args) {
		String s ="Pavan Kalyan";
		System.out.println(s.charAt(2));//v
		System.out.println(s.codePointAt(3));//97 for a
		System.out.println(s.codePointBefore(3));//118 for v which is before a
		System.out.println(s.codePointCount(0, 10));
	}
}
