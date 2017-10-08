//Java program that keeps rolling dice until you get doubles(same number)
//Using do-while loop
//Same idea as previous Dice_doubles program

import java.util.Random;

public class Dice_doubles2{

	public static void main(String [] args){

		Random random = new Random();

		int roll_1, roll_2 , total;
		roll_1 = random.nextInt(6)+1;
		roll_2 = random.nextInt(6)+1;
		System.out.println("Here comes the DICE!");


	do{

		System.out.println("Roll #1 : " + roll_1);
		System.out.println("Roll #2 : " + roll_2);
		total = roll_1 + roll_2;
		System.out.println("The total is : " + total);	
		roll_1 = random.nextInt(6)+1;
		roll_2 = random.nextInt(6)+1;
	}

	while(roll_1 != roll_2);

	System.out.println("Roll #1 :" + roll_1);
	System.out.println("Roll #2 : " + roll_2);
	total = roll_1 + roll_2;
	System.out.println("The total is " + total);
	
	}

}