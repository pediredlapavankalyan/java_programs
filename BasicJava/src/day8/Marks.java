package day8;

import java.util.Scanner;

public class Marks {

	public static void main(String[] args) {
		int sum=0,count=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter marks of each subject by separating them  with , ");
		String s = sc.nextLine();
		String ar[]=s.split(",");
		for(int i=0;i<ar.length;i++)
		{
			try
			{
			int marks = Integer.parseInt(ar[i]);
			sum+=marks;
			count++;
			}
			catch(NumberFormatException e)
			{}
		}
		try {
			System.out.println("total: "+sum+" avg is "+(sum/count));
		} catch (ArithmeticException e) {
System.err.println("enter valid data");
		}
	}

}
