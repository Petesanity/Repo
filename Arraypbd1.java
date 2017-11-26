/*Write a program that creates an array of ten integers. It should put ten random numbers from 1 to 100 in the array.
It should copy all the elements of that array into another array of the same size, Change the last value in the first array to a -7
Then display the contents of both arrays.
*/

public class Arraypbd1{

	public static void main(String [] args){


		int [] arr = new int [10]; //array of size 10
		int [] arr1 = new int[arr.length]; //2nd array of size 10
		for(int i = 0; i <arr.length;i++){
			
			arr[i] = (int)(Math.random() * 100); //put random values in array
			
			arr1[i] = arr[i]; // place all elements in first array into second
		}
		
		arr[arr.length - 1] = -7; //change the last element of first array to -7

		System.out.println("Array 1 : " );
		for(int i : arr){

			System.out.println(i); //print all values of 1st arr
		}

		System.out.println("Array 2 : "); 
		for(int i : arr1){

			System.out.println(i); //prints all values of 2nd arr
		}
	}
}