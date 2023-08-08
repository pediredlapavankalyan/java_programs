package exercise;

public class Avg {
	public static double avg(int...num)
	{
		int sum=0;
		for(int n:num)
		{
			sum+=n;
		}
		return sum/num.length;
	}
	public static void main(String[] args) {
		System.out.println(avg(12,15));
	}
}
