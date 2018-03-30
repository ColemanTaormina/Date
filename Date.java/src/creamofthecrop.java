import java.util.Scanner;
public class creamofthecrop {
	public static void main(String [] args) {
		Scanner in= new Scanner (System.in);
String ice;

System.out.println("What is your favorite flavor icecream?(Chose bellow) ");
System.out.println("Vanilla, Chocolate, Mintchip, Strawberry, Coffe, Rockyroad, Banana");	
ice= in.nextLine();
switch (ice) {
		case "Vanilla": System.out.print("Mammas boy, scared and pathetic");
		break;
		case "Chocolate": System.out.print("Daddys boy, strong and poised");
		break;
		case "Mintchip": System.out.print("Reasonable for someone who thinks that the world revolves around them");
		break;
		case "Strawberry": System.out.print("NO, stop think about your choices");
		break;
		case "Coffe": System.out.print("Yes, you are normal, creative, and will live long and prosper");
		break;
		case "Rockyroad": System.out.print("Did you grow up on a farm? Probably, since you are not to bright");
		break;
		case "Banana": System.out.print("Well at least its not strawberry so you can surive anything");
		break;
		default: System.err.println("Please chose a flavor number that exists (while remembering to capitalize), the rest are dead to me");
		break;
		}

	
	
	
	
	
	
	
	}
}