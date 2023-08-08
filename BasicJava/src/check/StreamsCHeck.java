package check;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsCHeck {

	public static void main(String[] args) {
		int a[]= {1,3,4,5,5,6,7,8,9};
		int b[]= {1,2,3,4,5,6,7};
		int c[]= {3,4,5,6,7};
		int secondSmallest = secondSmallest(a); 
		System.out.println("Second Smallest Element is : "+secondSmallest);
		System.out.println("==================COMMON ELEMENTS===============================");
		commonElements(a, b,c);
		System.out.println("==================Length of largest String==============================");
		String s[]= {"ufsa","fsdfq","sdsadsad"};
		System.out.println("Length of largest string is "+getLength(s));
	}
	//To Find Second Smallest element 
	static int secondSmallest(int a[]) {
		return Arrays.stream(a).distinct().sorted().skip(1)
				.findFirst()
				.orElseThrow(()->new IllegalArgumentException("Second Smallest Element Not found"));
	}
	//To Get Common Elements Between Three integer arrays
	static void commonElements(int a[],int b[],int c[])
	{
		List<Integer> ce = Arrays.stream(a).distinct().filter(num-> Arrays.stream(b).distinct().anyMatch(num2->num==num2)&& Arrays.stream(c).distinct().anyMatch(num3->num==num3)).boxed().collect(Collectors.toList());
		for(var result:ce)
			System.out.print(result+" ");
	}
	//To get the length of largest string of a given String array
	static int getLength(String []s)
	{
		return Arrays.stream(s).mapToInt(s1->s1.length()).max().getAsInt();
	}
	
}
