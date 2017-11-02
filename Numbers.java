/* Asks user for 2 numbers and gets the numbers in between however if the first number is smaller
of larger than the second it ascends or decends respectively
*/

import java.util.Scanner;
public class Numbers{

	public static void main(String [] args){

		Scanner s = new Scanner(System.in);

		System.out.println("Enter 2 numbers : ");
		int num = s.nextInt();
		int num1 = s.nextInt();
		System.out.println(" ");


		if(num1 > num){

			for(int i = num; i<=num1; i++){

				System.out.println(i);
			}

		}

		else if(num > num1){

			for(int i = num; i>=num1; i--){

				System.out.println(i);
			}
		}
		
	}
}
