//Three card monty GAME 
//Peter Farquharson

import java.util.Scanner;
import java.util.Random;

public class card_game{

	public static void main(String [] args){

		Scanner s = new Scanner(System.in);
		Random random = new Random();
		int num = random.nextInt(3) + 1;

		System.out.println("You slide up to Fast Eddie's card table and plop down your cash.He glances at you out of the corner of his eye and starts shuffling.He lays down three cards.");
		System.out.println("Which one is the ace?");
		System.out.println("\n ##   ##   ## ");
		System.out.println(" ##   ##   ## ");
		System.out.println(" 1    2    3 ");
		System.out.println("  ");
		int guess = s.nextInt();

		if(num == guess){

			System.out.println("You nailed it! Fast Eddie reluctantly hands over your winnings, scowling");

			if(guess == 1){

				System.out.println("\n AA   ##   ## ");
				System.out.println(" AA   ##   ## ");
				System.out.println(" 1    2    3 ");

			}
			if(guess == 2){

				System.out.println("\n ##   AA  ## ");
				System.out.println(" ##   AA  ## ");
				System.out.println(" 1    2   3 ");
			}
			if(guess == 3){

				System.out.println("\n ##   ##   AA ");
				System.out.println(" ##   ##   AA ");
				System.out.println(" 1    2    3 ");
			}
		}

		if(num != guess){

			System.out.println("\nHa! Fast Eddie wins again! The ace was card number " + num);

			if(num == 1){

				System.out.println("\n AA   ##   ## ");
				System.out.println(" AA   ##   ## ");
				System.out.println(" 1    2    3 ");

			}
			if(num == 2){

				System.out.println("\n ##   AA  ## ");
				System.out.println(" ##   AA  ## ");
				System.out.println(" 1    2   3 ");
			}
			if(num == 3){

				System.out.println("\n ##   ##   AA ");
				System.out.println(" ##   ##   AA ");
				System.out.println(" 1    2    3 ");
			}
		}
	}
}