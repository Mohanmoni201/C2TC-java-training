package mohan;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class collectionsarratlist1 {
   public static void main(String ar[]) {
	   Scanner in = new Scanner(System.in);
	   ArrayList<String>A = new ArrayList<String>();
	   while(true) {
		   System.out.println("1.login\n2.logout\n3.list\n4.exit");
		    int ch = Integer.parseInt(in.nextLine());
		    if(ch==1) {
		    	 System.out.println("Enter usn");
		
		    	String usn =in.nextLine(); 
		    	 if(A.contains(usn)) {
		    		 System.out.println("username already exists");
		    	 }
		    	 
		    	 else {
		    		 A.add(usn);
		    	 }
		    	 
		    }
		    if(ch==2) {
		    	System.out.println("Enter usn");
		    	String usn =in.nextLine(); 
		    	if(A.indexOf(usn)!=-1) {
		    	A.remove(usn);
		    	System.out.println("Removed");
		    	}
		    	else { System.out.println("Username does not exists");
		    	}
		    }
		    if(ch==3) {
		    	for(int i=0;i<A.size();i++) {
		    	System.out.println(A.get(i));
		    	
		    	}
		    	
		    }if(ch==4)System.exit(0);
		    
	   }
   }
}
