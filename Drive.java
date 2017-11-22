class Car{

	private String brand;
	private String model;
	private int numOfDoors;
	private int speed;

	public Car(){

	}
	public Car(String carBrand, String carModel, int doors){

		brand = carBrand;
		model = carModel;
		numOfDoors = doors;
	}

	public String toString(){

		return "Brand : " + brand + "\nModel : " + model + "\nNumber of doors : " + numOfDoors + "\nSpeed : " + speed;

	}
	public int getSpeed(){

		return speed;
	}
	public void setSpeed(int speed){

		this.speed = speed;
	}
	public void Accelerate(){

		speed += 5;

	}
}
public class Drive{

	public static void main(String [] agrs){

		Car myCar = new Car("Honda", "Accord", 4);

		myCar.setSpeed(65);

		myCar.Accelerate(); // Adds 5 each times to speed

		System.out.println(myCar.toString());
	}
}