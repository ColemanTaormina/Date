import java.util.Scanner;
public class Taxes {
public static void main(String [] args) {
	Scanner in = new Scanner(System.in);
	
	System.out.print("How many hours did you work this week? ");
	double time= in.nextDouble();
	System.out.print("What is your hourly wage? ");
	double wage= in.nextDouble();
	double earnings=0;
	
	if(time>40) { 
		earnings= (((time-40)*1.5)*wage) + (wage*40);}
		else if (time>=0 && time<=40){
	earnings= (time*wage);

}
	
if (time<0 ||wage<0) {
System.err.print("Really, that is not possible to compute");
}
if (time>=0 && wage>=0){
System.out.printf("You earned $%.2f before taxes",earnings);
}
}
}
