package mohan;

import java.util.Random;
import java.util.Scanner;

public class classobj {
	       public static void main(String ar[]) {
	    	  tracking t= new tracking();
	    	  t.placeoroder();
	    	  t.track();
	    	  t.setloc();
	    	  t.track();
	       }        
}
 class tracking {
	  private String orderid;
      private double lat,lon;
      
   public void placeoroder() {
 	  Random r = new Random();
 	  orderid = "#"+r.nextInt(99999);
 	  lat = 123.4649;
 	  lon  = 16.45315;
   }
   
   public void setloc() {
	   Scanner in = new Scanner(System.in);
	   System.out.println("Enter lat and lon");
	    lat = Double.parseDouble(in.nextLine());
	    lon = Double.parseDouble(in.nextLine());
   }
   
   public void track() {
	   System.out.println(" orderid = "+orderid+" lat = "+lat+" lon= "+lon);
   }
}
