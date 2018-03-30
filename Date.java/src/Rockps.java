import java.util.Scanner;
public class Rockps {
	public static void main(String [] args) {
		Scanner in= new Scanner (System.in);
		int rock=1;
		int paper=2;
		int scissors=3;
		int yourchoice;
		int mychoice=(int)(Math.random()*3)+1;
				
		System.out.print("Choose rock(1), paper(2), or scissors(3): ");
		yourchoice=in.nextInt();
	
		if (yourchoice==3){
			System.out.print("You chose scissors. ");
		}
			if (yourchoice==2){
			System.out.print(" You chose paper. ");
			}
			if (yourchoice==1){
			System.out.print("You chose rock. ");
			}
		
			if(yourchoice > 3 || yourchoice < 1) {
				System.err.print("NO work chose between 1-3");
			}
			if (mychoice==3 && (yourchoice <= 3 && yourchoice >= 1)){
				System.out.print("I chose scissors. ");
			}
				if (mychoice==2 && (yourchoice <= 3 && yourchoice >= 1)){
				System.out.print("I chose paper. ");
				}
				if (mychoice==1 && (yourchoice <= 3 && yourchoice >= 1)){
				System.out.print("I chose rock. ");
				}
				
			if (yourchoice==mychoice){
				System.out.print("Its a draw");
			}
				if ((yourchoice==1)&&(mychoice==2)){
					System.out.print("You lose");
				}
				if ((yourchoice==1)&&(mychoice==3)){
					System.out.print("You win");	
				}
				if ((yourchoice==2)&&(mychoice==1)){
					System.out.print("You win");
				}
				if ((yourchoice==2)&&(mychoice==3)){
					System.out.print("You lose");
				}
				if ((yourchoice==3)&&(mychoice==1)){
					System.out.print("You lose");
				}
				if ((yourchoice==3)&&(mychoice==2)){
					System.out.print("You win");
				
				}
				
	}
}
