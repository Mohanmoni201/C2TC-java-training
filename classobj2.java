package mohan;

import java.util.Scanner;

public class classobj2 {
         public static void main(String ar[]) {
        	 Fuel f = new Fuel();
        	 f.fill();
        	 Fuel.summary();
         }
}
class Fuel{
	private String vno;
	private float amt,lts;
	private String vtype;
	private static float totalsalesamt,petrol=1000,diesel = 1000;
	private static float pcost = 100,dcost = 90;
	
	public void fill() {
		Scanner in =new Scanner(System.in);
		System.out.println("Enter lts vno and type");
		lts = Float.parseFloat(in.nextLine());
		vno = in.nextLine();
		vtype = in.nextLine();
				if(vtype.toLowerCase().equalsIgnoreCase("petrol")) {
					petrol = petrol-lts;
					amt = lts*pcost;
				}
				if(vtype.toLowerCase().equalsIgnoreCase("diesel")) {
					diesel = diesel-lts;
					amt = lts*dcost;
				}
				totalsalesamt+=amt; 
	}
	public static void summary() {
		System.out.println("diesel stock = "+diesel+" petrol stock = "+petrol+" totalsales = "+totalsalesamt);
	}
}
