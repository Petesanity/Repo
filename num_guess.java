//Previous Number guessing code redone using do-while loop

import java.util.Scanner;
import java.util.Random;

public class num_guess{

	public static void main(String [] args){

		Scanner s = new Scanner(System.in);
		Random random = new Random();

		int tries = 0;

		int ran = random.nextInt(10)+1;


		System.out.println("I have chosen a number between 1 and 10. Try to guess it!");
		System.out.println("Your guess : ");
		int guess = s.nextInt();
		tries++;

		do{

				System.out.println("That is incorrect. Guess again");
				System.out.println("Your guess : ");
				guess = s.nextInt();
				tries++;
			}
		while(guess != ran);
		
		if(guess == ran){
				System.out.println("That's right! You're a good guesser.");
				System.out.println("It only took you " + tries + " tries");
		}								
	}
}