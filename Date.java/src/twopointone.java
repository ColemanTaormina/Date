import java.util.Scanner;

public class twopointone {
	public static void main(String[] args) {

		int year;
		System.out.print("Enter a year: ");
		Scanner in = new Scanner(System.in);
		year = in.nextInt();

		//if(year>1582) {
	
		// if (year % 4 != 0 || ( year % 100 == 0)) {
		//	if (year >= 400 && year % 400 != 0) 
			//	System.out.println("That was not a leap year");
			
		//}
		//}
if (year> 1582) {
		if (((year % 4) == 0 || (year %100)==0) && (year % 400)==0) 
			System.out.print("This is a leap year");
			
			else 
				System.out.print ("This was not a leap year");
		}

		

	
	if (year<1582){
			System.out.print("That year can not be determined since, before 1582, due to the Calander pending adoption of the leap year" );
		
	}
	}
}
