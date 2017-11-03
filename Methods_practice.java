import java.util.Scanner;
public class Methods_practice{
	//this method gets the max of two integers
	public static int getMax(int x, int y){

		if(x > y){

			return x;
		}
		else{

			return y;
		}
	}
	//this method takes 2 ints and prints the max
	public static void printMax(int x, int y){

		System.out.print("The max is " + getMax(x , y));
		
	}
	//this method takes an int and shows if the year is a leap year
	public static void isLeapYear(int year){

		if(year < 1000 || year > 9999){

			System.out.println("Invalid Entry");
		}
		else if( year % 4 == 0 || year % 4 == 0 || year % 100 == 0 || year % 400 == 0){

			System.out.println("It is a leap year");
		}
		else{
			System.out.println("It is not a leap year");
		}

	}
	//this method takes an int and prints from that int up to and including 100
	public static void printAllUpTo100(int x){

		for(int i = x; i<=100; i++){

			System.out.println(i);
		}
	}
	//this method takes 2 ints and prints all numbers from the first int up to and including the second int
	public static void printUpTo(int x, int y){

		for(int i = x; i<=y; i++){

			System.out.println(i);
		}
	}
		//this method takes 2 ints and prints all numbers from the first int up to or down to the second int

	public static void printValsBetween(int x, int y){

		if(x < y){

			for(int i = x; i<=y; i++){

				System.out.println(i);
			}
		}
		else if(x > y){

			for(int i = x; i>=y; i--){

				System.out.println(i);
			}
		}
	}

	public static void main(String [] args){	
		/*
		getMax(4,10);
		printMax(4,10);
		isLeapYear(2008);
		printAllUpTo100(50);
		printUpTo(2,21);
		printValsBetween(9,5);
		*/
		
		/*
		Write a program that asks a user for their name, 
		and the year they were born and tells them if they were or weren’t born in a leap year,
 		and what they are old enough to do.
 		*/
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter your name and the year you were born :");
		System.out.print("Name : ");
		String name = s.nextLine();
		System.out.print("Birth year : ");
		int birth_year = s.nextInt();
		System.out.println("Let's see if you were born in a leap year ");
		isLeapYear(birth_year);
		int age = 2017 - birth_year;
		System.out.println("You are " + age + " years old.");
		if(age >= 16){

			System.out.println("You can drive ");
		}
		if(age >= 18){

			System.out.println("You can vote ");
		}
		if(age >= 21){

			System.out.println("You can drink ");
		}
		if( age >= 25){

			System.out.println("You can rent a car ");
		}
	}
}