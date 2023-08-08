package day8;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Arrays;
import java.util.Scanner;

public class SortingDates {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		LocalDate ar[] = new LocalDate[5];
		System.out.println("Enter Date in DD-MM-YYYY ");
		DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-uuuu");
		for (int j = 1, i = 0; i < ar.length; i++) {
			System.out.println(j++ + ". ");
			String date = sc.nextLine();
			try {
				ar[i] = LocalDate.parse(date, format);
			} catch (DateTimeParseException e) {
				i--;
			}
		}
		Arrays.sort(ar);
		for (LocalDate date : ar) {
			System.out.println(date.format(format));
		}

	}

}
