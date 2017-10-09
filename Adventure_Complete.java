// Adventure game redone to include freely moving from room to room

import java.util.Scanner;

public class Adventure_Complete{

	public static void main(String [] args){

		Scanner s = new Scanner(System.in);

		int nextroom = 1;
		String ans_1 = "";
		System.out.println("\nWELCOME TO PETER'S SCARY ADVENTURE!");

		while(nextroom != 0){

			if(nextroom == 1){

				System.out.println("You are in a creepy house! Would you like to go \"upstairs\" or into the \"kitchen\"?");
				System.out.print(" >");
				ans_1 = s.nextLine();
				if(ans_1.equals("kitchen")){

					nextroom = 2;
				}
				else if(ans_1.equals("upstairs")){

					nextroom = 3;
				}
				
			}
			if(nextroom == 2){
				
				System.out.println("\nThere is a long countertop with dirty dishes everywhere. Off to one side there is, as you'd expect, a refrigerator. You may open the \"refrigerator\" or look in a \"cabinet\" or \"go back\"");
				System.out.print(" >");
				ans_1 = s.nextLine();

				if(ans_1.equals("go back")){

					nextroom = 1;
				}

				if(ans_1.equals("cabinet")){

					System.out.println("\nYou open the cabinet and you feel faint. Darkness overwhelms you and you die mysteriously....(dun dun dunnn)");
					nextroom = 0;
				}
				
				if(ans_1.equals("refrigerator")){
				
					System.out.println("\nInside the refrigerator you see food and stuff. It looks pretty nasty. Would you like to eat some of the food?(\"yes\" or \"no\")");
					ans_1 = s.nextLine();

					if(ans_1.equals("no")){

						System.out.println("\nYou'll die of starvation....eventually");
						nextroom = 0;
					}
				
					else{

						System.out.println("\nGood luck eating that nasty food...you'll probably die");
						nextroom = 0;
				
					}
				}									
			}
			if(nextroom == 3){

				System.out.println("\nUpstairs you see a hallway. At the end of the hallway is the master \"bedroom\". There is also a \"bathroom\" off the hallway or you could be a wimp and \"go back\" . Where would you like to go?");
				System.out.print(" >");
				ans_1 = s.nextLine();
				if(ans_1.equals("go back")){

					nextroom = 2;
				}
				if(ans_1.equals("bedroom")){

					System.out.println("\nYou are in a plush bedroom, with expensive-looking hardroom furniture. The bed is unmade. In the back of the room, the closet door is ajar. Would you like to open the door?(\"yes\" or \"no\") ");
					System.out.print(" >");
					ans_1 = s.nextLine();


					if(ans_1.equals("no")){

						System.out.println("\nWell, then I guess you'll never know what was in there. Thanks for playing, I'm tired of making nested if statements");
						nextroom = 0;
					}
					else if(ans_1.equals("yes")){

						System.out.println("\nYou open the door and inside you see the Flying Dutchman ready to take your soul. YAY no more if statements");
						nextroom = 0;
					}
				}					
									

				if(ans_1.equals("bathroom")){

					System.out.println("\nYou slowly open the bathroom door and BOOM! YOU DIED. That wasn't a smart move huh? Glad I don't have to make anymore nested if statements");
					nextroom = 0;
				}
			}
		}	
	}
}
