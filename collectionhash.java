package mohan;

import java.util.Enumeration;
import java.util.Hashtable;

public class collectionhash {
    public static void main(String ar[]) {
    	Hashtable<Integer,String> H = new Hashtable<Integer,String>();
     H.put(1, "hello");
     H.put(2, "mohan kumar");
     H.replace(2, "mohan");
     H.put(3,"remove");
     System.out.println(H.isEmpty());
     System.out.println(H.containsKey(1));
     System.out.println(H.containsValue("mohan"));
     System.out.println(H.get(1));
     System.out.println(H.remove(3));
     Enumeration<Integer> e = H.keys();
     while(e.hasMoreElements()) {
    	 int ele = e.nextElement();
     System.out.println(H.get(ele));
     }
     System.out.println(H.keySet());
     
    }
}
