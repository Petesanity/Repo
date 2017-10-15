//array with a 1000 integers that prints random numbers from 10-99

public class arr2{

	public static void main(String [] args){

		int [] num = new int [1000];


		for(int i = 0; i < num.length; i++){

			num[i] = 10 + (int)(Math.random() * ((99 - 10) + 1));
			System.out.print(num[i] + " " + " ");
		}
	}
}