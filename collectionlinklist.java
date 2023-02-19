package mohan;

import java.util.LinkedList;

public class collectionlinklist {
  public static void main(String a[]) {
	  LinkedList<String> l = new LinkedList<String>();
	  l.add("mohan");
	  l.add("kumar");
	  l.addFirst("M");
	  l.addLast("and thank you");
   for(int i=0;i<l.size();i++) {
	   System.out.println(l.get(i));
   }
   System.out.println(l.contains("mohan"));
   System.out.println(l.indexOf("mohan"));
   System.out.println(l.isEmpty());
   System.out.println(l.peek());
   System.out.println(l.pop());
   System.out.println(l.remove(2));
  }
}
