/*In 1937, Lothar Collatz proposed that no matter what number you begin with, the sequence eventually reaches 1. 
This is widely believed to be true, but has never been formally proved.
Write a program that inputs a number from the user, and then displays the Collatz Sequence starting from that number. Stop when you reach 1.*/


import java.util.Scanner;

public class Collatz{

	public static void main(String [] args){

		Scanner s = new Scanner(System.in);
		int n;
		int steps = 0; // initialize variable to get the steps
		int large = 0; //initialize variable to get the largest value

		System.out.print("Starting number : ");
		n = s.nextInt();
		System.out.print(n);

		while(n > 1){

			if(n % 2 == 0){  //check if its even

				n = n / 2;
			}
			else{

				n = (3 * n) + 1; //else its odd
			}

			System.out.print("\t" + n); // tab to get space between numbers
			steps++;	//increment the steps after each loop

			if(n > large){

				large = n; /* starting value is 0. runs through the while loop, the first number is greater 
				than 0 so it takes its place then it measures the second with the first then the third
				with the second and so on until it gets the largest value */
			}	
		}
			
			System.out.println(" ");//extra space
			System.out.println("\nTerminated after " + steps +" steps. The largest value was " + large);
	}
}