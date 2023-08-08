package check;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Stack;

public class Test  {
	
	public static void main(String[] args) {
		//arraylist
		System.out.println("array list");
		ArrayList a = new ArrayList<>();
		System.out.println("                        ".length());
		a.add(12);
		a.add(12);
		a.add("hi");
		a.add(12.34);
		a.add(true);
		a.add(null);
		a.add(3, 234);
		
		System.out.println(a);
		System.out.println(a.size());
		a.removeIf(obj->(obj==null));
		System.out.println(a);
		System.out.println(a.contains(12));//true
		
		
		
		ArrayList b = new ArrayList<>();
		b.addAll(a);//to add a complete collection
		System.out.println(b);

		System.out.println(a.indexOf(12));//0
		System.out.println(a.set(0, 123));
		System.out.println(a);
		
		a.clear();//delete all elements in collection
		System.out.println(a);
		
		System.out.println("linked list");
		LinkedList c = new LinkedList<>();
		c.add(1);
		c.add(2);
		c.add(3);
		System.out.println(c);
		
		System.out.println("stack");
		Stack s = new Stack<>();
		s.add(12);
		s.add(13);
		s.add(14);
		System.out.println(s);
		System.out.println(s.pop());
		System.out.println(s);
		
		
		
		
		
		System.out.println("linked hashmap");
		LinkedHashMap<Integer, String> list = new LinkedHashMap<>();
		list.put(6, "pavan");
		list.put(2, "kalyan");
		list.put(3, "pavan");
		list.put(4, "kalyan");
		list.put(5, "pavan");
		list.put(1, "kalyan");
		System.out.println(list.get(1));
		System.out.println( list.containsKey(1));//true
		System.out.println(list.containsValue("pavan"));//true
		System.out.println(list);
	}
}
