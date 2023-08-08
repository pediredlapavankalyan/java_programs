package Inbuilt;

import java.util.Arrays;

public class MethodsInArray {
	public int hashCode() {
		
		return 	100;
	}
	public String toString()
	{
		return "array refrence";
	}
	public static void main(String [] args)
	{
		int a[] = new int[10];
		System.out.println(Arrays.toString(a));
		System.out.println(a.toString());
		MethodsInArray rv = new MethodsInArray();
		System.out.println(rv);
		System.out.println(rv.hashCode());
	}
}
