/*Write a program that creates an array which can hold ten values. 
Fill the array with random numbers from 1 to 100. Display the values in the array on the screen. 
Then use a linear search to find the largest value in the array, and display that value and its slot number.
*/

public class Arraypbd3{

	public static void main(String [] args){

		int [] arr = new int [10];
		int largest = 0;
		int spot = 0;
		System.out.println("Array : ");

		for(int i = 0; i<arr.length; i++){

			arr[i] = (int)(Math.random()*100 );
			System.out.println(arr[i]);

			if(arr[largest] < arr[i]){

				largest = i;
			}
		}
		System.out.println("The largest value is " + arr[largest]);
		System.out.println("It is in slot " + largest);
	}
}