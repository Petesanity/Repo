//Given a string array that contains cities of USA. Print every city that starts with A , O, C

public class HW{

	public static void main(String [] args){

	
		String[] city = {"Aberdeen" , "Arlington" , "Allentown", "Oakdale" , "Oswego" , "Canton" , "Indianapolis", "Memphis" , "Minneapolis" , "Chicago" , "Tulsa" , "Portland" , "Orlando" , "Philadelphia" , "Dallas" , "Honolulu" , "Tampa" , "Miami" , "Nashville" , "Seattle"};

		for(int i = 0; i<city.length; i++){ //loop through the array

			if(city[i].charAt(0) == 'A'){   //If the character in the first index of each city is A
			
				System.out.println(city[i] + " ");//print all the cities that start with A
			}
			else if(city[i].charAt(0) == 'O'){   //If the character in the first index of each city is O

				System.out.println(city[i] + " "); //print all the cities that start with O
			}
			else if(city[i].charAt(0) == 'C'){ //If the character in the first index of each city is C

				System.out.println(city[i] + " "); //print all the cities that start with C
			}
		}			
		
	}
}
