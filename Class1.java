//Create a class called employee
class Employee{

	private int age;
	private String name;

	public Employee(){

	}
	public Employee(int age, String name){

		this.age = age;
		this.name = name;
	}
	public int getAge(){

		return age;
	}
	public void setAge(int age){

		this.age = age;
	}
	public String getName(){

		return name;
	}
	public void setName(String name){

		this.name = name;
	}	
}
public class Class1{

	public static void main(String [] args){

		Employee employee1= new Employee(21, "Phil");
		Employee employee2 = new Employee(56, "Dil");

		System.out.println(employee2.getName() + " " + employee2.getAge());
		System.out.println(employee1.getName() + " " + employee1.getAge());

		employee1.setName("Phil");
		employee1.setAge(34);
		System.out.println(employee1.getName() + " " + employee1.getAge());
		

		employee2.setName("Mark");
		employee2.setAge(43);
		System.out.println(employee2.getName() + " " + employee2.getAge());
	}
}