package mohan;

import java.util.Scanner;

public class exphandelling3 {
     public static void main(String ar[]) {
          int n;
          Scanner in = new Scanner(System.in);
    	 try {
    		 System.out.println("Enter size");
    		  n = Integer.parseInt(in.nextLine());
    	 }
    	 catch(NumberFormatException e) {
    	  n = 10;
    	  System.out.println("Size set to 10");
    	 }
    	 int arr[] = new int[n],num,i;
    	 
    	 for(i=0;i<n;i++) {
    	 try { 
    		 num = Integer.parseInt(in.nextLine());
    		 if(num<0) {
    			 throw new negative(num);
    		 }
    		 arr[i] = num; 
    		 } 
    	 catch(negative e) {
    		 int ab = e.abs();
    		 arr[i] = ab; 
    	 }
    	 catch(NumberFormatException e) {
    		 System.out.println("Only numbers");
    		 int newnumm = in.nextInt();
    		 arr[i] = newnumm;
    	 }
     }
    	 for(int j=0;j<n;j++) {
    	 System.out.println(arr[j]);
    	 }
     }
}
class negative extends Exception{
	int numa;
	public negative(int num) {
		numa = num;
	}
	public int abs(){
		return Math.abs(numa);
	}
}

