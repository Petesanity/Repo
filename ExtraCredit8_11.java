/*8.11 (Complex Numbers) Create a class called Complex for performing arithmetic with complex
numbers. Complex numbers have the form
realPart + imaginaryPart * i , where i is sqrt of -1.
Write a program to test your class. Use floating-point variables to represent the private data of the
class. Provide a constructor that enables an object of this class to be initialized when it’s declared.
Provide a no-argument constructor with default values in case no initializers are provided. Provide
public methods that perform the following operations:
a) Add two Complex numbers: The real parts are added together and the imaginary parts
are added together.
b) Subtract two Complex numbers: The real part of the right operand is subtracted from
the real part of the left operand, and the imaginary part of the right operand is subtracted
from the imaginary part of the left operand.
c) Print Complex numbers in the form (realPart, imageinaryPart).
*/

/*
	Name: Peter Farquharson
	Topic : Extra Credit 8.11
	Date : 11/19/2017
	Instructor : Yanilda Peralta
*/


class Complex{

	private double real; //double for floating point variable
	private double imaginary;	//double for floating point variable
	
	public Complex(){ //default variables

		real = 1.0;
		imaginary = 1.0;
	}
	public Complex(double r , double i){//constructor with initialization

		real = r;
		imaginary = i;
	}
	public Complex getSum(Complex num){ //adds two complex numbers of type Complex

		return new Complex( real + num.real, imaginary + num.imaginary); 
							
	}

	public Complex getDifference(Complex num1){ //subtracts two complex numbers

		return new Complex(real - num1.real, imaginary - num1.imaginary);

	}
	public String toString(){ //Print Complex numbers in the form (realPart, imageinaryPart).


		return "(" + real + "," + imaginary + ")";
	}
}

public class ExtraCredit8_11{

	public static void main( String [] args){

		Complex calc1 = new Complex(12.1, 9.0); // object with real # 12.1 and imaginary 9.0
		Complex calc2 = new Complex(5.9, 6.3); //object with real # 5.9 and imaginary 6.3
		System.out.println(calc1.toString()); //Print Complex numbers in object calc1 in the form (realPart, imageinaryPart).
		System.out.println(calc2.toString()); //Print Complex numbers in object calc2 in the form (realPart, imageinaryPart).
		System.out.println("Sum : " + calc1.getSum(calc2).toString()); //gets sum of objects calc1 and calc2
		System.out.println("Difference : " + calc1.getDifference(calc2)); // gets difference of objects calc1 and calc2
		
	}
}


