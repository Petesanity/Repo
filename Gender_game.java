// Program that evaluates combination of nested ifs and compound conditions. Ask the user for a gender, first name, last name , age and marital status depending on age.

import java.util.Scanner;

public class Gender_game{

	public static void main(String [] args){

		Scanner s = new Scanner(System.in);

		System.out.print("What is your gender (M or F)? ");
		String gender = s.nextLine();
		System.out.print("First name : ");
		String first = s.nextLine();
		System.out.print("Last name : ");
		String Last = s.nextLine();
		System.out.print("Age : ");
		int age = s.nextInt();
		String married ;
		
		if(gender.equals("M")){

			if(age >= 20){

				System.out.println("Then I shall call you Mr." + " " + Last);
			}
			if(age < 20){

				System.out.println("Then I shall call you " + first + " " + Last);
			}
		}

		
		if(gender.equals("F") && age >19){
			System.out.print("Are you married, " + first + " yes or no ?: ");
			married = s.nextLine();
			married =  s.nextLine();
			if(married.equals("no")){

				System.out.println("Then I shall call you Ms." + Last);
			}
			else{
				
				System.out.println("Then I shall call you Mrs." + Last);
			}
		}
		if(gender.equals("F") && age <= 19) {
			System.out.println("Then I shall call you " + first + " " + Last);
		}
				
	}
}