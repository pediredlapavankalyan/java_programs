package languageElements;

import java.util.Scanner;

public class SmallestFact {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("ENter a number");
		int num=sc.nextInt();
		for(int i=2;i<=num;i++)
		{
			if(num%i==0)
			{
				System.out.println("the smallest factor is "+i);
				break;
			}
		}

	}

}
