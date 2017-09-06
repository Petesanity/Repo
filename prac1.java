//Code that gives the sum of 2 numbers
import java.util.Scanner;
class prac1 {

	public static void main(String[] args) {

    int a, b, c=0;
	Scanner s=new Scanner(System.in);
	System.out.println("Enter any two numbers :");
	a=s.nextInt();
	b=s.nextInt();
	c=a+b;
	System.out.println("Sum: "+c);
	
	}
}