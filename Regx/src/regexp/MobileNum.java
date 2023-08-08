package regexp;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MobileNum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your phone number");
		String mobile = sc.next();
		System.out.println("Enter Pan number");
		String pan = sc.next();
		Pattern p = Pattern.compile("^\\d{10}$");
		Matcher m = p.matcher(mobile);
		if(m.find())
			System.out.println("Yes its 10 digits mobile number");
		else
			System.out.println("Not a mobile number");
		p=Pattern.compile("^[A-Z]{5}[0-9]{4}[A-Z]{1}$");
		m=p.matcher(pan);
		if(m.find())
			System.out.println("Yes its Valid pan number");
		else
			System.out.println("Invalid PAN Number");
		
	}
}
