package mohan;

import java.util.LinkedList;
import java.util.Scanner;

public class collectionlinklist2 {
public static void main(String ar[]) {
	Scanner in = new Scanner(System.in);
	LinkedList<Integer> L1 = new LinkedList<Integer>();
	LinkedList<Integer> L2 = new LinkedList<Integer>();
	LinkedList<Integer> res = new LinkedList<Integer>();
	System.out.println("Enter first number");
	 String num = in.nextLine();
	 System.out.println("Enter second number");
	 String num1 = in.nextLine();

	 for(int i=0;i<num.length();i++) {
		 int  sub = Integer.parseInt(num.substring(i,i+1));
		  L1.addLast(sub);
	 }
	 for(int i=0;i<num1.length();i++) {
		 int  sub = Integer.parseInt(num1.substring(i,i+1));
		  L2.addLast(sub);
	 }
	 int carry = 0;
	 while(L1.size()!=0 && L2.size()!=0) {
		 int val = L1.getLast()+L2.getLast()+carry;
		  res.addLast(val%10);
		  carry = val/10;
		  L1.removeLast();L2.removeLast();
	 }
	 LinkedList<Integer> t;
	 if(L1.size()!=0)t=L1;else t = L2;
	 while(t.size()!=0) {
		 int val = t.getLast()+carry;
		 res.addLast(val%10);
		  carry = val/10;
		  t.removeLast();
	 }
	 while(carry!=0) {
		 res.addLast(carry);
	 }
	 System.out.print("Sum = ");
	 for(int i=res.size()-1;i>=0;i--) {
		 System.out.print(res.get(i));
	 }
}
}
