package takehome;
import java.awt.Color;
/*	Name: Peter Farquharson
 *  Date: December 10, 2017
 *  Topic: TakeHomeTest
 *  Instructor: Yanilda Peralta
 */


public class Bird {
	
	protected String name; //instance variable
	private boolean hasFeather; //instance variable
	private boolean canFly; //instance variable
	private Color color; //instance variable
	private int eggsperYear; //instance variable
	private String beakShape; //instance variable
	
	Bird(){//default constructor 
		name = "Eagle ";
		hasFeather = true;
		canFly = true;
		color = Color.GREEN;
		eggsperYear = 10;
		beakShape = " Curved";
	}
	Bird(String name, boolean hasFeather, boolean canFly, Color color, int eggsperyear,String beakShape){ //constructor overloading
		this.name = name;
		this.hasFeather = hasFeather;
		this.canFly = canFly;
		this.color = color;
		this.eggsperYear = eggsperyear;
		this.beakShape = beakShape;
	}
	public void Speak(){ //method that prints bird sound
		
		System.out.println("Caaa Caaww , caaa caaaww");
	}
	public boolean Feathers(){ //method to check if the bird has feathers
		
		if(hasFeather){
			
			hasFeather = true;
		}
		else{
			hasFeather = false;
		}
		return hasFeather;
	}
	public boolean Flight(){ //method to check if the bird can fly
		if(canFly){
			canFly = true;
		}
		else{
			canFly = false;
		}
		return canFly;
	}
	public String getName(){ //getter for name
		return name;
	}
	public void setName(String name){ //setter for name
		this.name = name;
	}
	public Color getColor(){ //getter for color
		return color;
	}
	public void setColor(Color color){ //setter for color
		this.color = color;
	}
	public int geteggsperYear(){ //getter for eggs per year
		return eggsperYear;
	}
	public void seteggsperYear(int eggsperYear){ //setter for eggs per year
		this.eggsperYear = eggsperYear;
	}
	public String getbeakShape(){ //getter for beak shape
		return beakShape;
	}
	public void setbeakShape(String beakShape){ //setter for beak shape
		this.beakShape = beakShape;
	}
	public String toString(){ //returns all properties of the class
		return "[color: " + getColor() + "eggs laid per year: " + geteggsperYear() + "beak shape: " + getbeakShape() + "name: " + getName() + "Able to fly: " + Flight() + "Feathers: " + Feathers() + "]";
	}
}
	

	
	
	
	
	
	
	
	
	
	
	
	
