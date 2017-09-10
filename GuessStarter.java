import java.util.Random;
import java.util.Scanner;

public class GuessStarter{ 

	public static void main(String [] args){


		Scanner s = new Scanner(System.in);

		Random random = new Random(); 		//pick a random number

		int number = random.nextInt(100) + 1; //the result would be between 0-99 but adding the 1 includes 100

		System.out.println(" Im thinking of a number between 1 and 100 (including both). Can you guess what it is ?  ");

		System.out.println(" Type a number : ");

		int x = s.nextInt() ;

		System.out.println("\n");

		System.out.println("Your guess is " + x);

		System.out.println("The number I was thinking of is : " + number);

		System.out.println("\n");

		if(x > number){

			System.out.println("You were off by " + (x - number));
		}
		if(number > x){

			System.out.println("You were off by " + (number - x));
		}

		if(x==number){

			System.out.println(" WOW! YOU GOT IT RIGHT CONGRATS ");

		}
	}
}