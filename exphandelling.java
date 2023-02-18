package mohan;

import java.util.InputMismatchException;
import java.util.Scanner;

public class exphandelling {
 public static void main(String a[]) {
	 int sum=0;
	 Scanner in = new Scanner(System.in);
	 for(int i=0;i<4;i++) {
		 try {
			int num=in.nextInt();
			sum+=num;
		 }
		 catch(NumberFormatException e) {
			 System.out.println("Only numbers are allowed");
			 --i;
		 }
		 catch(InputMismatchException e) {
			 System.out.println("Only numbers are allowed");
			 --i;
		 }
		 finally {
			 System.out.println("Executed successfully");
		 }
	 }
 }
}
