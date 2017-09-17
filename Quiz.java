//Name : Peter Farquharson
//Teammates : James Cervantes and Ikuseghan Pryce
import java.util.Scanner;
public class Quiz{

	public static void main(String [] args){
		Scanner s = new Scanner(System.in);
		int ans_1, ans_2, ans_3, grade = 0 ;
		
		System.out.print("Are you ready for a quiz ? ");
		String reply = s.nextLine();
		
		System.out.println("Okay, here it comes! ");
		System.out.println("\nQ1) What is the capital of Alaska?");
		System.out.println("1) Melbourne" +	"\n2) Anchorage" + 	"\n3) Juneau");
		ans_1 = s.nextInt();
		
		if(ans_1 == 3){
			System.out.println("\nThat's right! ");
			grade++;
		}
		else{
			System.out.println("\nThat is incorrect");
		}
		System.out.println("\nQ2) Can you store the value \"cat\" in a variable of type int?");
		System.out.println("1) Yes" + "\n2) No");
		ans_2 = s.nextInt();

		if(ans_2 == 2){
			System.out.println("\nThat's right! ");
			grade++;
		}
		else{
			System.out.println("\nSorry, \"cat\" is a string. ints can only store numbers.");
		}
		System.out.println("\nQ3) What is the result of 9+6/3?");
		System.out.println("1) 5" + "\n2) 11" + "\n3)15/3");
		ans_3 = s.nextInt();

		if(ans_3 == 2){
			System.out.println("\nThat's correct!");
			grade++;
		}
		else{
			System.out.println("\nThat is incorrect");
		}
		System.out.println("\nOverall you got " + grade + " out of 3 correct." + "\nThanks for playing!");		
	}
}