package takehome;
import java.util.Scanner;
import java.util.Random;

/*	Name: Peter Farquharson
 *  Date: December 10, 2017
 *  Topic: TakeHomeTest
 *  Instructor: Yanilda Peralta
 */

public class AllanTuring {
	
	public static boolean getRandomChoice(){
		Random ran = new Random();
		int r = ran.nextInt(2); 
		
		if(r == 1){
			return true;
		}
		else if(r ==0){
			return false;
		}
		return true;
		
	}
	public static void main(String[] args){
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("What is your favorite music?");
		String ans = s.nextLine();
		boolean var = true;
		var=getRandomChoice();
		if(var){// == true){
			System.out.println("Nice! We are a match! I like " + ans + " because it's length is " + ans.length());
			System.out.println("Awesome we should go to a concert together, because the first character of the name of the music is "+ ans.charAt(0));
			System.out.println("and we could add it to the periodic table,and make " + ans + " chemistry");
		}
		else{
			
			System.out.println("“I’m sorry we don’t match because I don’t like " + ans);
		}
	}

}
