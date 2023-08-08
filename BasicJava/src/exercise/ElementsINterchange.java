package exercise;

import java.util.Scanner;

public class ElementsINterchange {
	public static void print(int a[])
	{
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a[] = new int[10];
		for(int i=0;i<a.length;i++)
		{
			System.out.println("ENter the value for index "+i);
			a[i]=sc.nextInt();
		}
		System.out.println("Before swaping");
		print(a);
		int index=a.length/2;
		for(int i=0;i<a.length/2;i++)
		{
			int temp=a[i];
			a[i]=a[index];
			a[index++]=temp;
		}
		System.out.println("After swaping");
		print(a);

	}

}
