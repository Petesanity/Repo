package takehome;

import java.awt.Color;

/*	Name: Peter Farquharson
 *  Date: December 10, 2017
 *  Topic: TakeHomeTest
 *  Instructor: Yanilda Peralta
 */

public class PS4Test {
	
	public static void main(String [] args){
		
		PS4 p4 = new PS4("Slim", Color.PINK , 3 , " 1TB");
		
		System.out.println("Model: " + p4.getModel() + " Color: " +  p4.getColor() + " Controllers: " +  p4.getnumofControllers() + " Storage size: " + p4.getstorageSize());

		System.out.println("Is the ps4 on ? " + p4.isOn());
		
		p4.setColor(Color.CYAN);
		p4.setModel("PS4 Pro");
		p4.setnumofControllers(1);
		p4.setstorageSize("250 GB");
		
		System.out.println("Model: " + p4.getModel() + " Color: " +  p4.getColor() + " Controllers: " +  p4.getnumofControllers() + " Storage size: " + p4.getstorageSize());
		System.out.println("Is the ps4 on ? " + p4.isOn());

	}
}
