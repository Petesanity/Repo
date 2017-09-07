//Asks the user for coefficients and compute and display the roots

import java.util.Scanner;

public class roots{

	public static void main(String [] args){

		Scanner s = new Scanner(System.in);

		double a , b, c, root_1, root_2 ;

		System.out.println("Enter a : ");
		a = s.nextDouble();

		System.out.println("Enter b : ");
		b = s.nextDouble();

		System.out.println("Enter c :");
		c = s.nextDouble();

		root_1 = (-b + Math.sqrt( b * b - 4*a*c))/(2*a);
		root_2 = (-b - Math.sqrt( b * b - 4*a*c))/(2*a);

		System.out.println("Root 1 is " + root_1);
		System.out.println("Root 2 is "+ root_2);


	}
}