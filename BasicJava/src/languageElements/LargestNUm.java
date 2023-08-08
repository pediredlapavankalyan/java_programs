package languageElements;

import java.util.Scanner;

public class LargestNUm {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a[]= new int[10];
		int large=a[0];
		for(int i=0;i<10;i++)
		{
			System.out.println("ENter the value for index "+i);
			a[i]=sc.nextInt();
			if(a[i]>large)
			{
				large=a[i];
			}
		}
		System.out.println(large+" is the large");

	}

}
