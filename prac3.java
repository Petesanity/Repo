//Write a Java program that takes a number as input and prints its multiplication table up to 10
import java.util.Scanner;

public class prac3{

	public static void main(String [] args){

		Scanner s = new Scanner(System.in);

		System.out.print("Input a number : ");
		int x = s.nextInt();

	for(int i = 0; i<10; i++){

		System.out.println(x + " x " + (i +1 ) + " = " + (x * (i+1)) );
		}
	}
}
