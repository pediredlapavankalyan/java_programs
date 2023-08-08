package languageElements;

import java.util.Scanner;

public class Gcd {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number");
		int num1 = sc.nextInt();
		System.out.println("Enter Second number");
		int num2 = sc.nextInt();
		int gcd=1;
		for(int i=min(num1,num2);i>1;i--)
		{
			if(num1%i==0&&num2%i==0)
			{
				gcd=i;
				break;
			}
		}
		System.out.println(" Gcd is :"+gcd);
	}
	public static int min(int n1,int n2)
	{
		return n1<n2?n1:n2;
	}
}
