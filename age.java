//Age limits
import java.util.Scanner;

public class age{
  
  public static void main(String[] args){
    
    Scanner s = new Scanner(System.in);
    
    System.out.println("Hey, what's your name?");
    String name = s.nextLine();
    
    System.out.println("How old are you? " + name);
    int age = s.nextInt();
    
    if(age <  16){
      
      System.out.println("You can't drive " + name);
    }
    if(age < 18){
      
      System.out.println("You can't vote " +name);
    }
    if(age < 25){
      
      System.out.println("You can't rent a car " + name);
    }
    if(age >= 25){
      
      System.out.println("You can do anything thats legal" + name);
    }
  }
}
    