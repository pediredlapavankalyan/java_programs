package day7;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Scanner;

public class SortedDates {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	LocalDate ar[] = new LocalDate[2];
	DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-uuuu");
	System.out.println("Enter Date in format \'DD-MM-YYYY\'");
	for(int i=0;i<ar.length;i++)
	{
		System.out.print((i+1)+". ");
		LocalDate d1 = LocalDate.parse(sc.next(),DateTimeFormatter.ofPattern("dd-MM-uuuu"));
		ar[i]=d1;
	}
	Arrays.sort(ar);
	for(LocalDate d:ar)
	{
		System.out.println(d.format(format));
	}
	sc.close();
}
}
