package day2;

public class Wishes {
	public static void wish(String wish,String ...name)
	{
		for(String s :name)
		System.out.println(wish+s);
	}
	public static void main(String[] args) {
		wish("Hi Good Morning ","Pavan","harsha","bharat","kumar");

	}

}
