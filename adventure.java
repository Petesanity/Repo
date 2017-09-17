//Nested if statement adventure 

import java.util.Scanner;

public class adventure{

	public static void main(String [] args){

	Scanner s = new Scanner(System.in);
	String ans_1;
	

	System.out.println("\nWELCOME TO PETER'S SCARY ADVENTURE!");
	System.out.println("You are in a creepy house! Would you like to go \"upstairs\" or into the \"kitchen\"?");
	ans_1 = s.nextLine();

		if(ans_1.equals("kitchen")){
			
			System.out.println("\nThere is a long countertop with dirty dishes everywhere. Off to one side there is, as you'd expect, a refrigerator. You may open the \"refrigerator\" or look in a \"cabinet\"");
			ans_1 = s.nextLine();

			if(ans_1.equals("refrigerator")){
				
				System.out.println("\nInside the refrigerator you see food and stuff. It looks pretty nasty. Would you like to eat some of the food?(\"yes\" or \"no\")");
				ans_1 = s.nextLine();

				if(ans_1.equals("no")){

					System.out.println("\nYou'll die of starvation....eventually");
				}
				
				else{

					System.out.println("\nGood luck eating that nasty food...you'll probably die");
				
				}
				
			}

		}

		else{

			System.out.println("\nUpstairs you see a hallway. At the end of the hallway is the master \"bedroom\". There is also a \"bathroom\" off the hallway. Where would you like to go?");
			ans_1 = s.nextLine();

			if(ans_1.equals("bedroom")){

				System.out.println("\nYou are in a plush bedroom, with expensive-looking hardroom furniture. The bed is unmade. In the back of the room, the closet door is ajar. Would you like to open the door?(\"yes\" or \"no\")");
				ans_1 = s.nextLine();

				if(ans_1.equals("no")){

					System.out.println("\nWell, then I guess you'll never know what was in there. Thanks for playing, I'm tired of making nested if statements");
				}
				else{

					System.out.println("\nYou open the door and inside you see the Flying Dutchman ready to take your soul. YAY no more if statements");
				}
			
			}
			else{

				System.out.println("\nBOOM! YOU DIED. That wasn't a smart move huh? Glad I don't have to make anymore nested if statements");
			}
		}

	}
}



















