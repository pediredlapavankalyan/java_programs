package basics;
import java.util.Scanner;
public class FactorsOfNUmber 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number to get its factors : ");
		int num = sc.nextInt();
		System.out.println("Following are the factors for the given number "+num);
		for(int i=1;i<=num;i++)
		{
			if(num%i==0)
			{
				System.out.print(i+" ");
			}
		}
		sc.close();
	}
}
