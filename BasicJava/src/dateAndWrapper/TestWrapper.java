package dateAndWrapper;

public class TestWrapper {
	public static void main(String[] args) {
		int a=10,b=20;
		System.out.println(a);
		//boxing
		Integer i3=new Integer(a);//depriciated
		Integer i=Integer.valueOf(a);
		//auto-boxing
		Integer i1 =b;
		//unboxing
		int c=i.intValue();
		//auto-unboxing
		int d=i;
		//upcasting
		Object obj=i;
		//downcasting
		Integer i2=(Integer)obj;
		
		
	}
}
