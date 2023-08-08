package dateAndWrapper;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class NumberOfDays {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter date 1");
		DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-uuuu");
		LocalDate date1 = LocalDate.parse(sc.nextLine(), DateTimeFormatter.ofPattern("dd-MM-uuuu"));
		System.out.println("Enter date 2");
		LocalDate date2 = LocalDate.parse(sc.nextLine(), DateTimeFormatter.ofPattern("dd-MM-uuuu"));
		System.out.println(ChronoUnit.DAYS.between(date1, date2) + " days");

	}
}
