package check;

public class ArraysTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s ="savcdshcs";
		System.out.println();
		System.out.println(length(s));
		
	}
	public static int length(String s) {
		for(int i=0;true;i++)
		{
			try {
				s.charAt(i);
			}
			catch(Exception e) {
				return i;
			}
		}
	}

}
