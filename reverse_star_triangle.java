//Starting with 5 rows , the triangle pattern goes in descending order
public class reverse_star_triangle{

	public static void main(String [] args){

		for(int i = 5; i>0; i--){

			for(int j = i; j>0; j--){

				System.out.print("*");
			}
			System.out.println();
		}
	}
}