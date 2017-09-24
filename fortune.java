//FORTUNE COOKIE WITH LOTTERY NUMBERS


import java.util.Random;

public class fortune{

	public static void main(String [] args){

		Random random = new Random();

		int cookie = random.nextInt(6) + 1;
		int cookies = random.nextInt(54) + 1;
		int biscuit = random.nextInt(54) + 1;
		int snack = random.nextInt(54) + 1;
		int lotto = random.nextInt(54) + 1;
		int desert = random.nextInt(54) + 1;



		if(cookie == 1){

			System.out.println("Fortune cookie says : \"You will find happiness with a new love.\"");
			System.out.println("Lotto numbers :" + cookie + "-" + cookies + "-" + biscuit + "-" + snack + "-" + lotto + "-" + desert);
		}
		if(cookie == 2){

			System.out.println("Fortune cookie says : \"You will suffer a fate far worse than death(THATS RIGHT THE FRIENDZONE).\"");
			System.out.println("Lotto numbers :" + cookie + "-" + cookies + "-" + biscuit + "-" + snack + "-" + lotto + "-" + desert);
		}
		if(cookie == 3){

			System.out.println("Fortune cookie says : \"You will receive alot of money in the near future.\"");
			System.out.println("Lotto numbers :" + cookie + "-" + cookies + "-" + biscuit + "-" + snack + "-" + lotto + "-" + desert);
		}
		if(cookie == 4){

			System.out.println("Fortune cookie says : \"You will seek out the one who knows.\"");
			System.out.println("Lotto numbers :" + cookie + "-" + cookies + "-" + biscuit + "-" + snack + "-" + lotto + "-" + desert);
		}
		if(cookie == 5){

			System.out.println("Fortune cookie says : \"You will achieve every goal you set for yourself.\"");
			System.out.println("Lotto numbers :" + cookie + "-" + cookies + "-" + biscuit + "-" + snack + "-" + lotto + "-" + desert);
		}
		if(cookie == 6){

			System.out.println("Fortune cookie says : \"You miss a 100% of the shots you don't take. Unless you don't take the shot so you wont miss something you dont take. Think about that.\"");
			System.out.println("Lotto numbers :" + cookie + "-" + cookies + "-" + biscuit + "-" + snack + "-" + lotto + "-" + desert);
		}
	}
}