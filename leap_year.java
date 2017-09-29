//Peter Farquharson

import java.util.Scanner;

public class leap_year{
  
  public static void main(String[] args){
    
    Scanner s = new Scanner (System.in);
    
    System.out.print("Enter month : ");
    int month = s.nextInt();
    System.out.print("Enter day : ");
    int day = s.nextInt();
    System.out.print("Enter year : ");
    int year = s.nextInt();
    
    if(month > 12 || month < 1 || day < 1 || day > 31 || year < 1000 || year > 9999 ){
        
        System.out.println("Invalid Entry.");
    }
    else if(year % 4 == 0 || year % 4 == 0 && year % 100 == 0 && year % 400 ==0){

        System.out.println(month + "/" + day + "/" + year + " falls on a leap year. ");
    }

    else{

        System.out.println(month + "/" + day + "/" + year + " does not fall on a leap year");

    }
        
  } 
}