//Create an array that can hold ten integers and fill up each element with a random number
public class arr1{
	public static void main(String [] args){

		int [] num = new int [10];
		for(int i = 0; i<num.length; i++){

			num[i] = (int)(Math.random() * 100 + 1);
			System.out.println("Slot " + i + " contains a " + num[i] );
		}
	}
}