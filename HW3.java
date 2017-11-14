/* 
Name : Peter Farquharson
Title : Homework 3
Date : November 9, 2017
Description : Creating methods for arrays
*/

import java.util.Arrays;
public class HW3{

	//method that prints integer arrays
	public static void printInt(int [] arr){

		for(int i : arr){

			System.out.println(i);
		}

	}
	//method that prints string arrays
	public static void printString(String [] arr){

		for(String i : arr){

			System.out.println(i);
		}
	}
	//method that prints character arrays
	public static void printChar(char [] c){

		for(char i : c){

			System.out.println(i);
		}
	}
	//method that copy integer arrays
	public static void copyInt(int [] arr, int [] arr1){

		arr1 = Arrays.copyOf(arr, arr.length);
		for(int i : arr1){
			System.out.println(i);
		}
	}
	//method that copy String arrays
	public static void copyString(String [] s, String [] s1){

		for(int i = 0; i<s.length; i++){

			s1[i] = s[i];
		}
		for(String i : s1){

			System.out.println(i);
		}
	}
	//method that copy character array
	public static void copyChar(char [] a , char [] b){

		b = Arrays.copyOf(a , a.length);
		for(char i : b){

			System.out.println(i);
		}
	}

	public static void main(String [] args){

		int [] Arr1 = { 1, 2, 3, 4};
		int [] Arr2 = { 2, 4, 6, 8 };
		int [] Arr3 = { 3, 6, 9, 12};
		int [] Arr4 = { 5, 10, 15, 20};

		String [] sArr1 = { "Kaioken " , "Kamehameha " ,"Kakarot" };
		String [] sArr2 = { "Rasengan " , "Chidori ", "Kotoamatsukami"};
		String [] sArr3 = { "Mans " , "Not ", "Hot "};

		char [] cArr1 = {'S' , 'K' , 'R'};
		char [] cArr2 = {'A' , 'A' , 'P'};
		char [] cArr3 = {'A' , 'P', 'A'};

		printInt(Arr1); //prints int array 1
		System.out.println(" "); //extra space

		printString(sArr1);//prints String array 1
		System.out.println(" ");//extra sprace

		printChar(cArr2); // prints Character array 2
		System.out.println(" ");//extra space

		
		System.out.println("Copying integer array : ");
		copyInt(Arr2, Arr1);//copies first integer array into second

		System.out.println("\nCopying string array : ");
		copyString(sArr1, sArr2);//copies first string array into second

		System.out.println("\nCopying character array : ");
		copyChar(cArr1, cArr2); //copies first Char array into second
	} 
}