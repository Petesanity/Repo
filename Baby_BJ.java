//Baby Blackjack program
import java.util.Random;

public class Baby_BJ{

	public static void main(String[] args){

		Random ran = new Random();

		int x = ran.nextInt(10)+1;
		int y = ran.nextInt(10)+1;
		int a = ran.nextInt(10)+1;
		int b = ran.nextInt(10)+1;
		int total = x + y;
		int sum = a + b;

		System.out.println("Baby Blackjack!");
		System.out.println("   ");
		

		System.out.println("You drew " + x + " and " + y);
		System.out.println("Your total is " + total);
		System.out.println("   ");

		System.out.println("The dealer has " + a + " and " + b);
		System.out.println("Dealer's total is " + sum);

		if(total > sum){

			System.out.println("YOU WIN!");
		}
		else{

			System.out.println("DEALER WON!");
		}
	}
}