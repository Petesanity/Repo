//distance formula

import java.util.Scanner;

public class distance{

	public static void main(String [] args){

		Scanner s = new Scanner(System.in);

		double distance_formula;

		System.out.println("Enter the values for x1 : " );
		double x1 = s.nextDouble();

		System.out.println("x2 : ");
		double x2 = s.nextDouble();

		System.out.println("y1 : ");
		double y1 = s.nextDouble();

		System.out.println("y2 : ");
		double y2 = s.nextDouble();

		distance_formula = Math.sqrt((x2-x1) * (x2-x1) + (y2-y1) *(y2-y1));

		System.out.printf("The distance of the given points is %.3f " , distance_formula);
	}	

}