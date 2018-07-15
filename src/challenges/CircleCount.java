package challenges;

import java.util.Scanner;

public class CircleCount {
	
	public static void main(String[] args) {
		// get the user input as String
		System.out.print("Enter your number here: ");
		Scanner s = new Scanner(System.in);
		System.out.println("Total number of circles in your number(s): " + getCountOfCircles(s.nextLine())); // call getCounterOfCircles method and print it
	}
	
	// method to check how many circles are in given number(s)
	public static int getCountOfCircles(String input) {
		char[] c = input.toCharArray(); // convert the string to characters as character arrays
		int counter = 0; // set counter as ZERO to sum up 
		// iterate the char array to get each numbers
		for (char d : c) {
			// switch case for 0, 4, 6, 8 , 9 along with counter+1 to sumup the numbers
			// to convert character to an int value - use getNumericValue(intValue) methos from Character class
			switch (Character.getNumericValue(d)) {
			case 0:
				counter = counter +1;
				break;
			case 4 :
				counter = counter +1;
				break;
			case 6 :
				counter = counter +1;
				break;
			case 8 :
				counter = counter +2;
				break;
			case 9 :
				counter = counter +1;
				break;
			} }
		return counter;
	}

}
