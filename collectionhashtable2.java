package mohan;

import java.util.Enumeration;
import java.util.Hashtable;

public class collectionhashtable2 {
 public static void main(String ar[]) {
	 String name = "it is an good sunday morning";
	 Hashtable <String,Integer>h = new Hashtable<String,Integer>();
	 for(int i=0;i<name.length();i++) {
		 String sub = name.substring(i,i+1);
		 if(h.containsKey(sub)) {
			     int val = h.get(sub);
			      val+=1;
			     h.put(sub,val);
		 }
		 else {
			 int val = 1;
			 h.put(sub, val);
		 }
	 }
	 Enumeration<String>e  = h.keys();
	 while(e.hasMoreElements()) {
		 String more = e.nextElement();
		 System.out.println(more+" "+h.get(more));
	 }
 }
}
