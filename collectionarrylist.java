package mohan;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class collectionarrylist {
 public static void main(String ar[]) {
	 Scanner in =new Scanner(System.in);
	 ArrayList<String> AL = new ArrayList<String>();
	 
	 System.out.println("Enter number to colors to add");
	 int num = Integer.parseInt(in.nextLine());
	 for(int i=0;i<num;i++) {
		 System.out.println("Enter color "+i);
		 String ele = in.nextLine();
		 AL.add(ele);
	 }
	 for(int i=0;i<num;i++) {
    System.out.println("color "+i+" is "+AL.get(i));
	 }
	 
	 System.out.println(AL.contains("red"));
	 System.out.println(AL.indexOf("red"));
	 AL.set(2,"yellow");
	 System.out.println(AL.remove(0));
	 System.out.println(AL.remove("red"));
	 Collections.sort(AL);
	 
	 
	 for(int i=0;i<AL.size();i++) {
		 System.out.println("color "+i+" is "+AL.get(i));
	 }
	
 }
}
