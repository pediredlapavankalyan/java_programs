package arraysAndFunc;

import java.util.Arrays;
import java.util.Scanner;

public class RevArr {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the size");
	int size = sc.nextInt();
	int a[]= new int[size];
	for(int i=0;i<size;i++)
	{
		System.out.println("ENter the value for index "+i);
		a[i]=sc.nextInt();
	}
	double d=Arrays.stream(a).average().getAsDouble();
	System.out.println("Average of the array elements : "+d);
	System.out.println("After reversing the array");
	for(int i=a.length-1;i>=0;i--)
		System.out.print(a[i]+" ");
}
}
