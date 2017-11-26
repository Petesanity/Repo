/*8.6 (Savings Account Class) Create class SavingsAccount. Use a static variable annualInterestRate
to store the annual interest rate for all account holders. Each object of the class contains a
private instance variable savingsBalance indicating the amount the saver currently has on deposit.
Provide method calculateMonthlyInterest to calculate the monthly interest by multiplying the
savingsBalance by annualInterestRate divided by 12—this interest should be added to savingsBalance.
Provide a static method modifyInterestRate that sets the annualInterestRate to a new
value.Write a program to test class SavingsAccount. Instantiate two savingsAccount objects,
saver1 and saver2, with balances of $2000.00 and $3000.00, respectively. Set annualInterestRate
to 4%, then calculate the monthly interest for each of 12 months and print the new balances for
both savers. Next, set the annualInterestRate to 5%, calculate the next month’s interest and print
the new balances for both savers.*/

/*
	Name: Peter Farquharson
	Topic : HW 8.6
	Date : 11/19/17
	Instructor : Yanilda Peralta
*/
class SavingsAccount{

	public static double annualInterestRate; //store annual interest rate
	private double savingsBalance;// amount the saver has on deposit currently


	public SavingsAccount(){

		savingsBalance = 0;
		annualInterestRate = 0;
	}


	public SavingsAccount(double s){ //initializes savingsAccount

		savingsBalance = s;
	}

	public double calculateMonthlyInterest(){ //calculates monthly interest

		double calc = (savingsBalance * annualInterestRate) / 12;
		savingsBalance += calc;
		return savingsBalance;
	}
	public static void modifyInterestRate(double AIR){ //sets annual interest to a new value

		annualInterestRate = AIR;
	}
}
public class HW8_6{

	public static void main(String [] args){

		SavingsAccount saver1 = new SavingsAccount(2000); //instantiate with balance of 2000
		SavingsAccount saver2 = new SavingsAccount(3000); //instantiate with balance of 3000

		saver1.modifyInterestRate(0.04); //set annual interest rate to 4%
		System.out.println("Savings Balance with 4% interest for saver1 is : " + saver1.calculateMonthlyInterest());
		
		saver2.modifyInterestRate(0.04);//set annual interest rate to 4%
		System.out.println("Savings Balance with 4% interest for saver2 is : " + saver2.calculateMonthlyInterest());

		saver1.modifyInterestRate(0.05);//set annual interest to 5%
		System.out.println("Savings Balance with 5% interest for saver1 is : " + saver1.calculateMonthlyInterest());

		saver2.modifyInterestRate(0.05);//set annual interest to 5%
		System.out.println("Savings Balance with 5% interest for saver2 is : " + saver2.calculateMonthlyInterest());
	}
}