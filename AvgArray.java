//finds the average of an array, takes int array as parameter, returns average in double
public class AvgArray{

	public static double getAverage(int [] arr){


		int sum = 0;

		for(int i =  0; i<arr.length; i++){

			sum += arr[i];
		}
		double result = sum / (double) arr.length;
		System.out.println(result);
		return result;
	}
	public static void main(String [] args){

		int [] arr1 = { 2, 4, 8, 2};

		double arr1Average = getAverage(arr1);


	}
}