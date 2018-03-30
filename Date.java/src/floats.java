import java.io.File;
import java.util.Scanner;
import java.io.IOException;
	public class floats {
		public static void main (String[] args) throws IOException {
			Scanner inFile = new Scanner (new File("testdata.txt"));
		double number;
		while (inFile.hasNext()) {
			number = inFile.nextDouble();
			System.out.println(number+"  ");
		System.out.println("s");
	
//if (number%2==0 && number<=100 && number>=2) {
	//System.out.println(number);
	//}
}
	}
	}