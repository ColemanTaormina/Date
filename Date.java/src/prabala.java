import java.util.Scanner;
public class prabala {
	public static void main(String [] args) {
		Scanner in= new Scanner (System.in);
		
		int a;
		int b;
		int c;
		int x;
		double is;
		double roota;
		double rootb;
		
	System.out.print("What is the value of a? ");
a=in.nextInt();
		System.out.print("What is the value of b? ");
b=in.nextInt();
		System.out.print("What is the value of c? ");
c=in.nextInt();

x=(int)Math.pow(b,2)-(4*a*c);

	if(x==0){
	is= (-b + (double)Math.pow(x, (double)1/2))/(2.0*a);
	System.out.printf("There is one real root: %.3f", is);
	}
	else if(x>0){
		roota=(-b + (double)Math.pow(x, (double)1/2))/(2.0*a);
	rootb= (-b - (double)Math.pow(x, (double)1/2))/(2.0*a);
	System.out.printf("There are two real roots: %.3f and %.3f",roota, rootb);
}
	
	else {
		System.out.print("There are no real roots.");
	}
	
	}
}




//roots= (-b + Math.pow(Math.pow(b,2)-(4*a*c),(1/2)))/(2*a)
//-b - Math.pow(Math.pow(b,2)-(4*a*c),(1/2)))/(2*a)
	//	
//if (((Math.pow(b, 2))-4*a*c)>0){
//System.out.print("The equation has 2 roots: ");
//}
//if (((Math.pow(b, 2))-4*a*c)==0){
//System.out.print("The equation has 1 root: ");
//}
//if (((Math.pow(b, 2))-4*a*c)<0){
//System.out.print("The equation has no real roots.");
