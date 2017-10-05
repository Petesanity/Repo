//Write a program that gets several integers from the user. Sum up all the integers they give you. Stop looping when they enter a 0. Display the total at the end.


import java.util.Scanner;

public class adding_in_a_loop{

	public static void main(String [] args){

		Scanner s = new Scanner(System.in);
		System.out.println("I will add up the numbers you give me. ");
		System.out.print("Number : ");
		int num = s.nextInt();
		int total = 0;
		total = num + total;

		
		while(num != 0){
			
			System.out.println("The total so far is " + total);
			System.out.print("Number : ");
			num= s.nextInt();
			total += num;

		}
		
		if(num==0){

			System.out.println("The total is " + total);
		}		


	}
}