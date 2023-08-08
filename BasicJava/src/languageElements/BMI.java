package languageElements;

import java.util.Scanner;

public class BMI {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter your weight in kg");
	double weight = sc.nextInt();
	System.out.println("Enter your height");
	double height=sc.nextInt()/100;
	System.out.println(height);
	double bmi=weight/(height*height);
	System.out.println("Your BODY MASS INDEX is : "+bmi);
	if(bmi<18.5)
		System.out.println("Underweight");
	else if(bmi<24.9)
		System.out.println("Normal weight");
	else if(bmi<29.9)
		System.out.println("Over weight");
	else
		System.out.println("Obesity");
}
}
