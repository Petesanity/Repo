//Write a program that converts a total number of seconds to hours, minutes and seconds

import java.util.Scanner;

public class time {

	public static void main(String [] args){

		Scanner s = new Scanner (System.in);


		System.out.println("Enter the amount of seconds : ");
		int seconds = s.nextInt();

		int hours = seconds / 3600; // Since 60 seconds is one minute and 60 mins is 1 hr then to convert seconds into hours would be 60 * 60 = 3600

		int minutes = (seconds / 60) % 60; // diving by 60 would put it in the format as both hour and min for example something like 83 mins. The modulus seperates the minute

		int sec = seconds % 60; // this calculation provides the seconds


		System.out.println(seconds + " seconds =  " + hours + " hours " + minutes + " minutes " + sec + " seconds");


	}
}







