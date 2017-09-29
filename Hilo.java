//Hi-Lo game with seven tries

import java.util.Random;
import java.util.Scanner;

public class Hilo{

	public static void main(String [] args){

		Scanner s = new Scanner(System.in);
		Random random = new Random();

		int tries = 0;
		int ran = random.nextInt(100) + 1;

		System.out.println("Im thinking of a number between 1 - 100. You have 7 guesses! Good Luck!");
		System.out.println("First guess : ");
		int guess = s.nextInt();

		if(guess > ran ){
			System.out.println("Sorry, that guess is too high.");
		}
		else if(guess < ran ){

			System.out.println("Sorry, that guess is too low.");
		}
		tries++;

	
		while(guess != ran && tries < 7){
		
			System.out.println("Guess # " + (tries + 1) + ":");
			guess = s.nextInt();

			if(guess > ran){
				
				System.out.println("Sorry, that guess is too high.");
			}
			else if(guess < ran){

				System.out.println("Sorry, that guess is too low.");
			}
			tries++;
		}

		if(ran == guess){
			
			System.out.println("You guessed it! What are the odds?!?");
		}

		else if(tries == 7){

			System.out.println("Sorry you didn't guess it in 7 tries. The number was " + ran + "." + " YOU LOSE!");
		}				
	}
}