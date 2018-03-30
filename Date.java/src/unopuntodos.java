import java.util.Scanner;
public class unopuntodos {
	public static void main (String[] args ) {
		
	double seconds;
	double hours;
	double minutes;
	Scanner in = new Scanner(System.in);
	System.out.print("Type seconds:");
	seconds = in.nextDouble();
	hours=seconds/3600;
	minutes=(seconds%3600)/60.0;
	seconds=(minutes - (int)minutes)*60.0;
	System.out.printf("That is: %d hours, %d minutes, and %.1f seconds", (int)hours, (int)minutes, seconds);
	}
}
//Write a program that converts a total number of seconds to
//hours, minutes, and seconds. It should (1) prompt the user for input, (2) read
//an integer from the keyboard, (3) calculate the result, and (4) use printf to
//display the output. For example, "5000 seconds = 1 hours, 23 minutes,
//and 20 seconds".
//Hint: Use the modulus operator.