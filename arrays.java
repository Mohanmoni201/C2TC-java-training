package mohan;

import java.util.Arrays;
import java.util.Scanner;

public class arrays {

	public static void main(String args[]) {
		int arr[]= new int[10];
		Scanner in = new Scanner(System.in);
		int a[] = {10,20,30};
		for(int i=0;i<arr.length;i++) {
			  arr[i]=in.nextInt();
		}
		Arrays.sort(arr);
		for(int i =0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	   int ind =  Arrays.binarySearch(a,20);
	 System.out.println(ind);
	 
	 int array2d[][]  =new int[5][5]; 
	 for(int row=0;row<array2d.length;row++) {
		 for(int col = 0;col<array2d.length;col++) {
			 array2d[row][col]=in.nextInt();
		 }
	 }
	 for(int row=0;row<array2d.length;row++) {
		 for(int col = 0;col<array2d.length;col++) {
			 System.out.print(array2d[row][col]+" ");
			 		 }
		 System.out.println("\n");
}
	}
}
