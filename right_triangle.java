import java.util.Scanner;

public class right_triangle{

	public static void main(String [] args){

		Scanner s = new Scanner(System.in);

		int side_1, side_2, side_3;

		System.out.println("Enter three integers: ");
		System.out.println("Side 1 : ");
		side_1 = s.nextInt();
		System.out.println("Side 2 : ");
		side_2 = s.nextInt();
		System.out.println("Side 3 : ");
		side_3 = s.nextInt();

		while(side_1 > side_2 || side_2 > side_3){

			if(side_1 > side_2){

				System.out.println(side_2 + " is smaller than " + side_1 + ". Try again.");
				System.out.println("Side 2 : ");
				side_2 = s.nextInt();
			}

			if(side_2 > side_3){

				System.out.println(side_3 + " is smaller than " + side_2 + ".Try again.");
				System.out.println("Side 3 : ");
				side_3 = s.nextInt();
			}		

		}
			if(side_1 == side_2 || side_2 == side_3){

				System.out.println("Your three sides are " + side_1 + " " + side_2 + " " + side_3);
				System.out.println("NO! These sides do not make a right triangle");

			}
			else{
				
				System.out.println("Your three sides are " + side_1 + " " + side_2 + " " + side_3);
				System.out.println("These sides *DO* make a right triangle. Yippy-skippy!");
			}
	}
}