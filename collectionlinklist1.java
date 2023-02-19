package mohan;

import java.util.LinkedList;
import java.util.Scanner;

public class collectionlinklist1 {
           public static void main(String ar[]) {
        	   Scanner in = new Scanner(System.in);
        	   LinkedList<ticket>L = new LinkedList<ticket>();
        	   
        	   while(true) {
        		   System.out.println("1.raise ticket\n2.Accept ticket\n3.list all ticket\n4.delete based on cid\n5.exit");
        		    int ch = Integer.parseInt(in.nextLine());
        		    if(ch==1) {
        		    	  ticket t= new ticket();
        		    	   System.out.println("Enter ticket cid");
        		    	    String cid =  in.nextLine();
        		    	    t.setcid(cid);
        		    	    System.out.println("Enter issue");
        		    	    String issue =  in.nextLine();
        		    	    t.setissue(issue);
        		    	    L.add(t);
        		    }
        		    if(ch==2) {
        		    	System.out.println(L.getFirst());
        		    	L.removeFirst();
        		    }
        		    if(ch==3) {
        		    	for(int i=0;i<L.size();i++) {
        		    	System.out.println(L.get(i));
        		    	}
        		    }
        		    if(ch==4) { 	
        		    	System.out.println("Enter cid");
        		    	String newcid = in.nextLine();
        		    	for(int i=0;i<L.size();i++) {
        		    	if(L.get(i).getcid().equalsIgnoreCase(newcid))L.remove(i);
        		    	}
        		    	}
        		    if(ch==5) {
        		    	System.exit(0);
        		    }
        		    
        	   }
           }
}
class ticket{
	 private String cid;
     private String datetime;
     private String issue;
     
     public void setcid(String cid) {
     	this.cid = cid;
     	datetime = new java.util.Date().toString();
     }
     public void setissue(String iss) {
     	issue = iss;
     }
    public String toString() {
   	return String.format("cid = %s,issue = %s,datetime = %s",cid,issue,datetime);
   }
     public String getcid() {
     	return cid;
     }
}
