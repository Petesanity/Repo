//Write a Java program that takes three numbers as input to calculate and print the average of the numbers

import java.util.Scanner;

public class prac4{

	public static void main(String[] args){

		Scanner s = new Scanner(System.in);

		System.out.println(" Enter 3 numbers : ");
		int first = s.nextInt();
		int second = s.nextInt();
		int third = s.nextInt();

		int average = (first + second + third) / (3);
		System.out.println(" The average is " + average);
	}
}