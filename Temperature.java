 // Name: Peter Farquharson                              
// Fun Fact: I like the Walking Dead    

import java.util.Scanner;

public class Temperature{
  
  public static void main(String[] args) {
    
    Scanner s = new Scanner(System.in);
    System.out.println(" Enter temp in Farenheit : ");
    Double temp = s.nextDouble();
    double temp_celsius = (temp - 32)* 5/9;
    System.out.println("The current temp is " + temp_celsius + " degrees Celsius . ");
  }
  
}