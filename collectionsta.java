package mohan;

import java.util.Stack;

public class collectionsta {
	//decimal to binary
	public static void main(String ar[]) {
              Stack<Integer> S = new Stack<Integer>();
	         int num  = 19;
	         while(num!=0) {
	        	 int rem = num %2;
	        	 S.push(rem);
	        	   num=num/2;
	         }
	         while(!S.isEmpty())
	         System.out.print(S.pop());
	
	
	//binary to  decimal
	 int arr[] = {1,0,0,1,1};
	 int corres[] = new int[arr.length];
	 int numa = 1;
	   for(int i=arr.length-1;i>=0;i--) {
		   corres[i] = numa;
		   numa = numa*2;
	   }
	   int sum=0;
	  for(int i = 0;i<arr.length;i++) { 
		  if(arr[i]==1) {
			  sum+=corres[i];
		  }
	  }
	  System.out.println("number =  "+sum);
}
}
