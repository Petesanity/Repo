import java.util.Arrays;
public class Array_Methods{

	public static int [] resize(int [] arr){ //method that creates an array of double its length, copies values from original and returns longer array

		int [] arr1 = new int [ 2 * arr.length];

		arr1 = Arrays.copyOf(arr , arr.length);
	
		for(int i : arr1){

			System.out.println(i);
		}
		return arr1;
	}

	/* Incorrect/incomplete will fix soon
	public static void printArrReverse(String[] arr){ //method that prints a String array in reverse

		String [] arr1 = new String[arr.length];

		for(int i = 0; i<arr.length; i++){

			arr1[i] = arr[arr.length - i - 1];
		}
		System.out.println(Arrays.toString(arr1));
	}
	*/
	public static void printValTimesN(int n, int [] arr){ //method that prints array elements thatget multiplied by integer that was passed

		for(int i : arr){

			System.out.println(i * n);
		}
	}
	public static String getRandomWord(String [] arr){ //method that prints random index of a string array and prints it


		int ran = (int)(Math.random() * arr.length);


		return arr[ran];
	}

	public static void findMatch(int target, int [] arr){ /*iterates through the array to find if there is a value that matches the target,
															if the match it there, print it, if not print -1 for the entry
															*/
		for(int i = 0; i<arr.length; i++){

			if(target == arr[i]){

				System.out.println(arr[i]);
			}
			else{

				System.out.println("-1");
			}
			
		}	
	}
	public static int calcAverage(int [] arr){ //finds the average of an array

		int sum = 0;
		for(int i : arr){

			sum += i; 
		}
		int average = sum / arr.length;
		System.out.println(average);
		return average;
	}
	public static void main(String [] args){

		int [] x = { 1, 2};
		int [] p =  { 2, 0, 8 ,4,6};
		int n = 2;
		String [] sArray = {"I", "Like", "Java"};
		String [] sArray1 = { "I", "like", "C++", "Do", "You"};
		resize(x);//calls resize method
		printArrReverse(sArray); //calls print reverse method
		printValTimesN(n , x); //calls print value method
		System.out.println(getRandomWord(sArray1));//prints random word method
		findMatch(6, p); //calls match method
		calcAverage(p); //calls average method

	}
}
