//Home Alarm System code

import java.util.Scanner;

public class alarm{
  
	public static void main(String[] args){

		Scanner in = new Scanner(System.in);

		String name, password, pass, alarm;
		int pin;
		
		System.out.println("Hello, what is your name?");
		name = in.nextLine();
		System.out.println("Hello "+ name + " what is your pin for your IJP Security?");
		
		pin = in.nextInt();
		
		if (pin == 00000){
		
		  System.out.println("Thank you, now please enter your password");
		  password = in.nextLine();
		  password = in.nextLine();
		  
		  if (password.equals ("Swish")){
  		  
  		    System.out.println("Welcome home "+ name+ " would you like change your password?");
  		    pass = in.nextLine();
  		    
  		    if (pass.equals ("yes")){
  		    
  		     System.out.println("enter your new password, please?");
  		     password = in.nextLine();
  		     System.out.println("Your new password is " + password);
  		     
  		     System.out.println(name + " would you like to arm or disarm your alarm?");
  		     alarm = in.nextLine();
  		     
  		        if(alarm.equals("arm"))
  		        {
  		          System.out.println("Alarm activated!");
  		        }
  		        else
  		        {
  		          System.out.print("Okay "+ name + "don't forget to active alarm before leaving!");
  		        }
  		    }
  		    else
  		    {
  		     System.out.println("okay no problem be sure to alarm your system before heading out "+name);
  		     
  		     System.out.println(name + " would you like to arm or disarm your alarm?");
  		     
  		     alarm = in.nextLine();
  		     
    		        if(alarm.equals("yes"))
    		        {
    		          System.out.println("Alarm activated!");
    		        }
    		        else
    		        {
    		          System.out.print("Okay "+ name + "don't forget to active alarm before leaving!");
    		        }
  		    }
  		    
  		  }
  		  else
  		  {
  		  System.out.println("WARNING!!!!");
  		  System.out.println("WARNING!!!!");
  		  System.out.println("WARNING!!!!");
  		  System.out.println("WARNING!!!!");
  		  System.out.println("WARNING!!!!");
  		  System.out.println("WARNING!!!!");
  		  System.out.println("INTRUDER ALERT!!!!! 911 IS BEING CONTACTED");
  		  }
		
		  
		}
		else
		{
		  System.out.println("WARNING!!!!");
		  System.out.println("WARNING!!!!");
		  System.out.println("WARNING!!!!");
		  System.out.println("WARNING!!!!");
		  System.out.println("WARNING!!!!");
		  System.out.println("WARNING!!!!");
		  System.out.println("INTRUDER ALERT!!!! 911 IS BEING CONTACTED");
		}
	}
}