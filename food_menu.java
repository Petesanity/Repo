//Program that lets you order food, select categories such as Meat, Desert etc.. and then tells you what you ate 
//Small bug: requests user input twice at rare times
import java.util.Scanner;


public class food_menu{

	public static void main(String[] args){

		Scanner s = new Scanner (System.in);

		System.out.println("Welcome to the food festival!");
		System.out.println("What is your name?");
		String name = s.nextLine();

		System.out.println("Are you hungry ? \"Yes\" or \"No\" " );
		String ans = s.nextLine();

		String foodsEaten = "";
		int option;

		while(ans.equals("Yes")){

			System.out.println(" What would you like to eat? Enter the number.");

			System.out.println(" 1.Meat \n 2.Veggie \n 3.Snack \n 4.Dessert");
			int choice = s.nextInt();
			if(choice == 1){

				System.out.println(" Your options are: \n 1.Jerk Chicken \n 2.Bacon stuffed burger \n 3.Curry Goat \n 4.Roast Beef and chicken with fries");
				System.out.println(" Which will you have? Enter the number ");
				option = s.nextInt();
				if(option == 1){

					System.out.println("BUON APPETITO! Would you like to add more pepper? \"Yes or No\"");
					String pepper = s.nextLine();
					pepper = s.nextLine();
					if(pepper.equals("Yes")){

						foodsEaten = foodsEaten.concat("Jerk Chicken with Pepper...");
						System.out.println("Excellent it's better when spicy");
					}
					else if(pepper.equals("No")){
						foodsEaten = foodsEaten.concat("Jerk Chicken...");
					}		
				}
					
				else if(option == 2){

					System.out.println("BUEN PROVECHO!");
					System.out.println("Want to add another layer of \"Meat\" or \"More Bacon\" or \"Nothing Extra\" ?");
					String more = s.nextLine();
					more = s.nextLine();
					if(more.equals("Meat")){

						foodsEaten =  foodsEaten.concat("Bacon stuffed burger with extra layer of Meat...");
						System.out.println(" Excellent More meat is always good!");

					}
					else if(more.equals("More Bacon")){

						foodsEaten = foodsEaten.concat("Bacon stuffed burger with More Bacon!...");
						System.out.println("Is there ever a thing called too much bacon");
					}
					else if(more.equals("Nothing Extra")){

						foodsEaten = foodsEaten.concat("Bacon stuffed burger...");
					}			
				}		
				else if(option == 3){

					foodsEaten = foodsEaten.concat("Curry Goat...");
					System.out.println("ENJOY!");
				}
				
				else if(option == 4){

					foodsEaten = foodsEaten.concat("Roast Beef and chicken with fries...");
					System.out.println("HAPPY EATING");
				}
				System.out.println("Are you hungry? \"Yes\" or \"No\"");
				ans = s.nextLine();	
				ans = s.nextLine();
			}
			else if(choice == 2){

				System.out.println(" Your options are : \n 1.Veggie Burger \n 2.Veggie Patty \n 3.Kale Delight \n 4.Tofu Special");
				System.out.println(" Which will you have? Enter the number ");
				option = s.nextInt();

				if(option == 1){

					foodsEaten = foodsEaten.concat("Veggie Burger...");
					System.out.println("SMAKLIG SPIS!");
				}
				else if(option == 2){

					foodsEaten = foodsEaten.concat("Veggie Patty...");
					System.out.println("KALI OREXI!");
				}
				else if(option == 3){

					foodsEaten = foodsEaten.concat("Kale Delight..." );
					System.out.println("SMACZNEGO!");
				}
				else if(option == 4){

					foodsEaten = foodsEaten.concat("Tofu Special...");
					System.out.println("PRIYATNOGO APPETITA!");
				}

				System.out.println("Are you hungry? \"Yes\" or \"No\"");
				ans = s.nextLine();
				ans = s.nextLine();
						
			}
			else if(choice == 3){

				System.out.println(" Your options are : \n 1.Popcorn \n 2.Yogurt \n 3.Barbecue Chips \n 4.Banana Chips");
				System.out.println("Which will you have? Enter the number ");
				option = s.nextInt();

				if(option == 1){

					foodsEaten = foodsEaten.concat("Popcorn...");
					System.out.println(" Good choice, would you like butter with that? \"Yes\" or \"No\"");
					String butter = s.nextLine();
					butter = s.nextLine();
					if(butter.equals("Yes")){

						foodsEaten = foodsEaten.concat("Popcorn with butter...");
						System.out.println("Can't go wrong with butter");
					}
					else if(butter.equals("No")){

						foodsEaten = foodsEaten.concat("Popcorn...");
					}
				}

				else if(option == 2){

					System.out.println("YUM!");
					System.out.println("Would you like to add \"Strawberries\" or \"Cherries\" or \"Nothing Extra\"?");
					String fruits = s.nextLine();
					fruits = s.nextLine();
					if(fruits.equals("Strawberries")){

						foodsEaten = foodsEaten.concat("Strawberry Yogurt...");
						System.out.println("Strawberry Yogurt is swell!");
					}
					else if(fruits.equals("Cherries")){

						foodsEaten = foodsEaten.concat("Cherry Yogurt...");
						System.out.println("Cherry Yogurt Enjoy!");

					}
					else if(fruits.equals("Nothing Extra")){

						foodsEaten = foodsEaten.concat("Yogurt...");
						System.out.println("Ok enjoy your regular yogurt");
					}
				}
					
				else if(option == 3){

					foodsEaten = foodsEaten.concat("Barbecue Chips...");
					System.out.println(" CRUNCHY AND TASTY!");
				}
				
				else if(option == 4){

					foodsEaten = foodsEaten.concat("Banana Chips...");
					System.out.println(" VERY TASTY! MY PERSONAL FAVORITE!");
				}

				System.out.println("Are you hungry? \"Yes\" or \"No\"");
				ans = s.nextLine();	
				ans = s.nextLine();

			}
			else if(choice == 4){

				System.out.println(" Your options are : \n 1.Ice-Cream Cake \n 2.Rum Cake \n 3.Plain ole pie \n 4.Oatmeal Raisin cookies ");
				System.out.println("Which will you have? Enter the number ");
				option = s.nextInt();

				if(option == 1){

					System.out.println("DELISH! Would you like sprinkles with that \"Yes\" or \"No\"");
					String sprinkles = s.nextLine();
					sprinkles = s.nextLine();
					if(sprinkles.equals("Yes")){

						foodsEaten = foodsEaten.concat("Ice-Cream Cake with sprinkles...");
						System.out.println("Sprinkles make everything better");
					}
					else if(sprinkles.equals("No")){

						foodsEaten = foodsEaten.concat("Ice-Cream Cake...");
					}
				}
				
				else if(option == 2){

					foodsEaten = foodsEaten.concat("Rum Cake...");
					System.out.println("DELICIOUS! BE WARNED IT DOES HAVE A BIT OF RUM INSIDE ^_^ ");
				}
				
				else if(option == 3){

					System.out.println("JUST REGULAR PLAIN OLE PIE(YAWN)");
					System.out.println("Would you like to make it not so plain? \"Yes\" or \"No\" ?");
					String plain = s.nextLine();
					plain = s.nextLine();
					if(plain.equals("Yes")){

						foodsEaten = foodsEaten.concat("Explosive pie with a 50 sec timer. Also blueberry inside...");
						System.out.println(" Explosive pie with a 50 sec timer. Also blueberry inside");
					}
					else if(plain.equals("No")){

						foodsEaten = foodsEaten.concat("Plain ole pie... ");
					}
				}
				
				else if(option == 4){

					foodsEaten = foodsEaten.concat("Oatmeal Raisin cookies... ");

					System.out.println("YUM!");
				}

				System.out.println("Are you hungry? \"Yes\" or \"No\"");
				ans = s.nextLine();
				ans = s.nextLine();												
			}			
		}	
		if(ans.equals("No")){

			System.out.println("Good bye Happy digesting " + name);

			if(foodsEaten == ""){

				System.out.println("You ate Nothing");
			}
			else{
		
				System.out.println("You ate " + foodsEaten );
			}
		}	
	}
}