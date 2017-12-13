public class Trace{

	public static void get(int x){

		boolean flag = true;

		int y =x ;

		while(flag){

			if(y<5){

				System.out.println(y);
			}
			else{

				System.out.println(x);
				flag = false;
			}
			y--;
		}
	}
	public static void main(String [] args){

		get(2);
	}
}