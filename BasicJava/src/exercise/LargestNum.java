package exercise;

import java.util.Scanner;

public class LargestNum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a[] = new int[10];
		int large=0;
		for(int i=0;i<a.length;i++)
		{
			System.out.println("ENter the "+i+" value");
			a[i]=sc.nextInt();
			if(a[i]>large)
				large=a[i];
		}
		System.out.println(large+" is the largest value among "+a.length+" values");

	}

}
