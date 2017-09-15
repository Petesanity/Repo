// Peter Farquharson
//CMP 167
//Teammate: Johnn Garcia

import java.util.Scanner;

public class Currency{

	public static void main(String [] args){

		Scanner s = new Scanner(System.in);

		double x , y, z , pesos , quetzals, colóns , us_dollar; //declaration of currency and variables for formula

		System.out.println(" Enter number of Mexican Pesos : ");
		x = s.nextDouble();

		System.out.println("Enter number of Guatemalan Quetzals : ");
		y= s.nextDouble();

		System.out.println("Enter number of Salvadoran Colóns : ");
		z = s.nextDouble();

		pesos = 0.0544 * x;

		quetzals = 0.1305 * y;

		colóns = 0.1144 * z;

		us_dollar = pesos + quetzals + colóns;

		System.out.println(" Total US Dollars =  $" + us_dollar);

	}
}