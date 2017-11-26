/*Create an array that can hold ten integers, and fill each slot with a different random value from 1-50.
 Display those values on the screen, and then prompt the user for an integer. Search through the array,
 and if the item is present, say so. It is not necessary to display anything if the value was not found.
*/ 

import java.util.Scanner;
public class Arraypbd2{

	public static void main(String [] args){

		Scanner s = new Scanner(System.in);

		int [] arr = new int [40];

		System.out.print("Value to find : ");
		int v = s.nextInt();
		System.out.print("Array : ");

		for(int i : arr){

			i = (int)(Math.random() * 50);
			System.out.print(i + " ");

			if(v == i){

				System.out.println(v + " is in the array");
			}
		}
	}
}