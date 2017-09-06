//Create a program that swaps 2 variables

public class prac5{
	public static void main(String [] args){

		int a = 23;
		int b = 3;
		int temp;

		System.out.println(" a  is " + a + " b is " + b );

		 temp = a;
		 a = b;
		b = temp;

		System.out.println(" After swapping a is " + a + " b is " + b );


	}
}