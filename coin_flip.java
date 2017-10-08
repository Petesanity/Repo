// Coin flip generator using a do while loop

import java.util.Scanner;
import java.util.Random;

public class coin_flip{

	public static void main(String [] args){

		Scanner s = new Scanner(System.in);
		Random random = new Random();

		String again;
		String coin;

		do{

			int flip = random.nextInt(2);

			if(flip == 1){

				coin = "Heads"; 
			}
			else{

				coin = "Tails";
			}

			System.out.println("You flip a coin and it is " + coin);
			System.out.println("Would you like to flip again (y/n)? ");
			again = s.nextLine();
		}
		while(again.equals("y"));
	}
}