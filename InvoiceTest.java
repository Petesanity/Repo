//Name : Peter Farquharson
class Invoice{

	private String part_number;    //instance variable
	private String part_description; //instance variable
	private int item_quantity; //instance variable
	private double item_price; //instance variable

	public Invoice(){  //default constructor

		part_number = "A1";

		part_description = "Multipurpose solvent";

		item_quantity = 100;

		item_price = 24.99;
	}
	public String getNum(){ //getter for  part_number

		return part_number;
	}
	public void setNum(String part_number){ //setter for  part_number

		this.part_number = part_number;
	}
	public String getDescription(){  //getter for part_description 

		return part_description;
	}
	public void setDescription(String part_description){ //setter for part_description

		this.part_description = part_description;
	}
	public int getQuantity(){ //gets the value of item_quantity

		return item_quantity;
	}
	public void setQuantity(int item_quantity){ //sets the value of item_quantity

		this.item_quantity = item_quantity;
	}
	public double getPrice(){ //gets the value of price per item

		return item_price;
	}
	public void setPrice(double item_price){ //sets the value for price per item

		this.item_price = item_price;
	}
	public double getInvoiceAmount(){ //calculates the invoice amount

		if(item_quantity < 0){ //if item_quantity is negative then modify it to 0

			item_quantity = 0;
		}
		if(item_price < 0){ //if price per item is negative modify it to 0.0

			item_price = 0.0;
		}

		return item_quantity * item_price;
	}	
}
public class InvoiceTest{

	public static void main(String [] args){

		Invoice ethanol = new Invoice();
		System.out.println("Ethanol : ");
		//Attains the values that were initialized in the default constructor
		System.out.println("Price is : " + ethanol.getPrice() + "\nQuantity : " + ethanol.getQuantity() + "\nDescription : " + ethanol.getDescription() + "\nPart number : " + ethanol.getNum() + "\nInvoice amount : " + ethanol.getInvoiceAmount());

		Invoice glue = new Invoice();
		glue.setPrice(29.99);
		glue.setQuantity(12);
		glue.setDescription("Multipurpose adhesive");
		glue.setNum("B4");
		System.out.println();
		System.out.println("Glue : ");
		//Attains altered values different than what was initialized in default constructor
		System.out.println("Price is : " + glue.getPrice() + "\nQuantity : " + glue.getQuantity() + "\nDescription : " + glue.getDescription() + "\nPart number : " + glue.getNum() + "\nInvoice amount : " + glue.getInvoiceAmount());
	}
}