//Guessing game but with counter added

import java.util.Scanner;
import java.util.Random;

public class counter{

	public static void main(String[] args){

		Scanner s = new Scanner(System.in);
		Random random = new Random();

		int ran = random.nextInt(10) + 1;
		int x = 1;

		System.out.println("I have chosen a number between 1 and 10. Try to guess it ");
		System.out.println("Your guess : ");
		int guess = s.nextInt();

		while(ran != guess){
			
			System.out.println("That is incorrect. Guess again");
			System.out.println("Your guess : ");
			guess = s.nextInt();
			x++;
		}
		
		if(ran == guess){

			if(x==1){
				System.out.println("It only took you " + x + " try ");
			}
			else{
				System.out.println("That's right! You're a good guesser. It only took you " + x + " tries.");
		
			}
		}
		
	}
}