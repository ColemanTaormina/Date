
public class Time {
	public static void main(String[] args) {
	int hour= 14;
	int min = 33;
	int sec = 40;
	System.out.println(hour+":"+min+":"+sec );
	System.out.println(3600*hour+60*min+sec+" Since midnight");
	System.out.println(24*3600+ " Sec in day");
	System.out.println(((((double)hour*3600)+(double)min*60)+(double)sec)/(double)(86400)*100+"%");
}
}
 