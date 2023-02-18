package mohan;

import java.util.Random;
import java.util.Scanner;

public class exphandelling1 {
 public static void main(String a[]) {
	 Scanner in = new Scanner(System.in) ;
	 int n = 0;
	 try {
		 System.out.println("Enter size of array");
		 n = Integer.parseInt(in.nextLine());
	 }
	 catch(NumberFormatException e) {
		 n = 5;
		 System.out.println("Size set to 5");
	 }
	 int arr[] = new int[n],i = 0;
	  try {
		  for(;i<n;i++) {
			   arr[i] = Integer.parseInt(in.nextLine());
		  }
	  }
	  catch(NumberFormatException e) {
		  Random r = new Random();
		  while(i<n) {
		  arr[i++] = r.nextInt(10);
	  }
	  }
	  for(int j=0;j<n;j++) {
		  System.out.println(arr[j]);
	  }
 }
}
