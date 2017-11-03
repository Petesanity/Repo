/*
Write a program that repeatedly asks the user for the speed of the cars 
passing by until they enter a negative number as a sentinel. 
When the user enters the sentinel value print the number of cars that passed, 
and the average speed of the cars.
*/

import java.util.Scanner;
public class car_speed{

	public static void main(String [] args){

		Scanner s = new Scanner(System.in);

		int count = 0;
		int sum = 0;
		int speed = 0;
		int avg	= 0;	
		while(speed >= 0){

			System.out.println("Enter the speed of the cars passing");
			speed = s.nextInt();
			if(speed > -1){
				sum += speed;
				count++;	
				
			}
		}
		avg = sum / count;

		System.out.println(" The number of cars that passed are  " + count + " and the average speed of the cars is " + avg);
	}

}