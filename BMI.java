// Name:  Peter Farquharson
// Fun Fact: I like the Walking Dead
// Code that calculates Body Mass Index
import java.util.Scanner;

public class BMI {
  
  public static void main(String[] args) {
    
    Scanner s = new Scanner(System.in);
    System.out.println("Enter your height in m : ");
    double height = s.nextDouble();
    System.out.println("Enter your weight in kg : ");
    double weight = s.nextDouble();
    double BMI = weight / (height * height);
    System.out.println(" Your BMI is " + BMI);
    
    }
}