package check;

import java.util.Arrays;

public class SelectPrime {
	
	static boolean isPrime(int v) {
		boolean status = true;
		for(int i=2;i<=v/2;i++)
		{
			if(v%i==0)
				status=false;
		}
		return status;
	}

	public static void main(String[] args) {
		int[] a = { 11, 22, 43, 50, 1, 89};
		
		Arrays.stream(a)
		      .sorted()
	          .filter(SelectPrime::isPrime)
		      .forEach(System.out::println);

	}

}