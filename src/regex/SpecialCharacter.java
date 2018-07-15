package regex;

public class SpecialCharacter {
	
	public static void main(String[] args) {
		
		String myString = "$100";
		
		// replace()
		System.out.println(myString.replace('$', ' '));
		
		// replaceAll()
		System.out.println(myString.replaceAll("\\$", ""));
		
		
	}

}
