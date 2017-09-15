//Peter Farquharson
// Write a program to calculate the relative weight of a superhero astronaut on each planet he travels to
import java.util.Scanner;

public class Space{
  
  public static void main(String [] args){
    
    Scanner s = new Scanner(System.in);
    
    double what_planet , earth_weight;
    System.out.println("Please enter your current earth weight: ");
    earth_weight = s.nextDouble();
    System.out.println("\nI have information for the following planets :");
    
    System.out.println("\n 1. Venus    2. Mars   3. Jupiter ");
    System.out.println(" 4. Saturn   5. Uranus 6. Neptune");
    
    System.out.print("\nWhich planet are you visiting? ");
    what_planet = s.nextDouble();
    
    if(what_planet == 1){
       double Venus = 0.78 * earth_weight;
      System.out.println("Your weight would be " + Venus + " pounds on that planet.");
    }
    if(what_planet == 2){
      double Mars = 0.39 * earth_weight;
      System.out.println("Your weight would be " +  Mars + " pounds on that planet");
    }
    if(what_planet == 3){
      double Jupiter = 2.65 * earth_weight;
      System.out.println("Your weight would be " + Jupiter + " pounds on that planet");
    }
    if(what_planet == 4){
      double Saturn = 1.17 * earth_weight;
      System.out.println("Your weight would be " + Saturn + " pounds on that planet");
    }
    if(what_planet == 5){
      double Uranus = 1.05 * earth_weight;
      System.out.println("Your weight would be " + Uranus + " pounds on that planet");
    }
    if(what_planet == 6){
      double Neptune = 1.23 * earth_weight;
      System.out.println("Your weight would be " + Neptune +" pounds on that planet");
    }
    if(what_planet > 6){
      System.out.println(" Use a number from planet 1 to 6 ");
    what_planet = s.nextDouble();
    }
  }
}