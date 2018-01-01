import java.util.Scanner;
public class switchprac{

	public static void main(String [] args){
		Scanner s = new Scanner(System.in);
		int numofbabies;
		System.out.println("Enter the number of babies : ");
		numofbabies = s.nextInt();

		switch(numofbabies){

			case 1:
				System.out.println("Congratulations!");
				break;
			case 2:
				System.out.println("Twins");
				break;
			case 3:
				System.out.println("Triplets");
				break;
			case 4:
				System.out.println("Quadruplets");
				break;
			case 5 : //since case 5 has no breaks it takes in the output for case 6
			case 6 :
				System.out.println("Unbelievable");
				break;
			default : //creates outputs for cases not listed however it is optional
				System.out.println("I dont believe you");
				break;
		}
	}
}