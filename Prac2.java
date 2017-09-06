//Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of two numbers

import java.util.Scanner;

public class Prac2{

	public static void main(String [] args){

		Scanner s = new Scanner(System.in);

		System.out.print("Input first number : ");//Enter first number
		int first_num = s.nextInt();//input

		System.out.print("Input second number : "); //Enter second number
		int second_num = s.nextInt(); //Input

		int sum = first_num + second_num;
		int dif = first_num - second_num;
		int product = first_num * second_num;
		int divide = first_num / second_num;
		int mod = first_num % second_num;

		System.out.println(first_num + " + " + second_num + " = " + sum);
		System.out.println(first_num + " - " + second_num + " = " + dif);
		System.out.println(first_num + " x " + second_num + " = "   + product);
		System.out.println(first_num  + " / "  + second_num + " = "   + divide);
		System.out.println(first_num + " mod "  + second_num + " = " + mod);

	


	}
}