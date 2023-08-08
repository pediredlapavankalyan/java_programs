package languageElements;

import java.util.Scanner;

public class DivByFive {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two numbers ;");
		int n1 = sc.nextInt();
		int n2= sc .nextInt();
		if(n1%5==0)
		{
			if(n2%5==0)
			{
				System.out.println("Both numbers are divisible by 5");
			}
			else
			{
				System.out.println(n1+" is divisible by 5");
			}
		}
		else if(n2%5==0)
		{
			System.out.println(n2+" is divisible by 5");
		}
		else
		{
			System.out.println("both numbers are not divisble by 5");
		}
		
	}
}
