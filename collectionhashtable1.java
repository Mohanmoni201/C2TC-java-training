package mohan;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Scanner;

public class collectionhashtable1 {
 public static void main(String ar[]) {
	 Scanner s =  new Scanner(System.in);
	 Hashtable<Integer,String> h = new Hashtable<Integer,String>();
	 while(true) {
		 System.out.println("1.new appointment\n2.serve for appointment\n3.list all\n4.exit");
		 int ch = Integer.parseInt(s.nextLine());
		 if(ch==1) {
			 System.out.println("Enter token number and name ");
			   int tok = Integer.parseInt(s.nextLine());
			   String name = s.nextLine();
			   if(h.containsKey(tok)) {
				   System.out.println("token already exits");
			   }
			   else {
				   h.put(tok, name);
			   }
		 }
		 if(ch==2) {
			 System.out.println("Enter token number");
		  int tok = Integer.parseInt(s.nextLine());
		  if(h.containsKey(tok))System.out.println("Served for "+h.remove(tok));
		  else System.out.println("Enter valid token");
		 }
		 if(ch==3) {
			 Enumeration<Integer> e = h.keys();
			 while(e.hasMoreElements()) {
				 int tok = e.nextElement();
				 System.out.println(h.get(tok));
			 }
		 }
		 if(ch==4)System.exit(0);
		 
	 }
 }
}
