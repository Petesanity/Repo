package takehome;
import java.awt.Color;

/*	Name: Peter Farquharson
 *  Date: December 10, 2017
 *  Topic: TakeHomeTest
 *  Instructor: Yanilda Peralta
 */
public class PS4 { 
	
	private String model; //instance variable
	private Color color; //instance variable
	private int numofControllers; //instance variable
	private boolean power; //instance variable
	private String storageSize; //instance variable
	PS4(){ //default constructor
		
		model = "Slim";
		color = Color.BLACK;
		numofControllers = 2;
		power = false;
		storageSize = "500 GB";
	}
	PS4(String model,Color color, int numofControllers, String storageSize){ //constructor overloading
		
		this.model = model;
		this.color = color;
		this.numofControllers = numofControllers;
		this.storageSize = storageSize;
	}
	public boolean isOn(){ //method to turn the PS4 on
		if(power){
			power = false;
		}
		else{
			power = true;
		}
		return power;
	}
	public String getModel(){ //getter for model
		return model;
	}
	public void setModel(String model){ //setter for model
		
		this.model = model;
	}
	public Color getColor(){ //getter for color
		return color;
	}
	public void setColor(Color color){ //setter for color
		this.color = color;
	}
	public int getnumofControllers(){ //getter for number of controllers
		return numofControllers;
	}
	public void setnumofControllers(int numofControllers){ //setter for number of controllers
		this.numofControllers = numofControllers;
	}
	public String getstorageSize(){ //getter for storage size
		return storageSize;
	}
	public void setstorageSize(String storageSize){ //setter for storage size
		this.storageSize = storageSize;
	}
}














