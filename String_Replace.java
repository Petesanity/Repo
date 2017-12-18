//replaces the last character of String with a random character
public class String_Replace {

	public static String replaceLast(String s, char c){
		
		String p = s.replace(s.charAt(s.length()-1), c); //note that replace method only works with values of the same type
		return p;
		
	}
	
	public static void main(String [] args){
		
		String name = "Juniod";
		char s = 'r';
		String a1 = replaceLast(name, s);
		System.out.println(a1);
	}
}