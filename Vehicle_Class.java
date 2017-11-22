import java.awt.Color;
/*
 * Author : Peter Farquharson
 * Date : 11/7/17
 * Title : Vehicle Test
 */
 class Vehicle {
	
	private int numofWheels;
	private Color color;
	private String engine;
	private int positionX;
	private int positionY;
	private double speed;
	
	public static boolean isOn = false; //public so you dont have to create a setter or getter for the variable
	// taking off static allows for seperate instances of turning on and off the lamborghini and benz however leaving static on and calling lamborghini.ignition() will change both of them
	
	
	//Constructor method : initialize instance variable
	public Vehicle(){
		/*
		this.color = Color.blue;
		this.engine = null;
		this.numofWheels = 4;
		*/
	}
	
	public Vehicle(Color c, String e, int n){
		
		this.color = c;
		this.engine = e;
		this.numofWheels = n;
		this.positionX = 0;
		this.positionY = 0;
		this.speed = 0.0;
		
	}
	public void accelerate(){
	  
	  speed++;
	}
	public void moveForward(int x, int y){
	  
	  positionX +=x;
	  positionY +=y;
	}
	public void moveBackwards(int x, int y){
	  
	  positionX -= x;
	  positionY -= y;
	}
	
	public static void ignition(){
	  
	  if(isOn){ //if it is on change it to false
	    
	    isOn = false;
	  }
	  else{
	    isOn = true; //else if its false change it to true
	  }
	}
	
	//get means to return something
	public int getNumofWheels(){
		
		return numofWheels;
	}
	//set means to modify
	public void setNumofWheels(int num){
		
		numofWheels = num;
	}
	
	//get retrieve something
	public Color getColor(){
		
		return color;
	}
	//modify
	public void setColor(Color color){
		
		this.color = color;
	
	}
	//retrieve something
	public String getEngine(){
		
		return engine;
	}
	//modify
	public void setEngine(String eng){
		
		engine =  eng;
	}
}
public class Vehicle_Class {
	
	public static void main(String [] agrs){
	
	Vehicle lamborghini = new Vehicle (Color.YELLOW, "V8" , 4); //new creates object and Vehicle is a default constructor
	//class/type   name      //actual object
	Vehicle benz = new Vehicle(Color.BLACK , "V10" , 4);
	
	
	System.out.println("Color : " + lamborghini.getColor());
	System.out.println("Engine : " + lamborghini.getEngine());
	System.out.println("Wheels : " + lamborghini.getNumofWheels());
	
	//lambo is off
	System.out.println( "Lambo : is Power on ? " + lamborghini.isOn); //get the true or false
	lamborghini.ignition(); // if its false change it to true and its true change it to false
	//benz is on
	System.out.println( "Benz : is Power on ? " + benz.isOn); //benz is off because the ignition method wan't called to change it on
	
	lamborghini.ignition(); // if its false change it to true and its true change it to false
  //lambo is off
	System.out.println( "Lambo : is Power on ? " + lamborghini.isOn); //get the true or false
	//benz is off
	System.out.println( "Benz : is Power on ? " + benz.isOn); //benz is off because the ignition method wan't called to change it on
	
	
	//N.B. taking off static will allow for sepertate instances to be called. Static 

 	
	}
}

