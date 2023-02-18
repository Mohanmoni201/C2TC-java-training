package mohan;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class workwithfiles2 {
   public static void main(String ar[]) throws IOException {
	   int arr[] = {1,2,3};
	   try {
		RandomAccessFile raf = new RandomAccessFile("D:\\abc.txt","rw");
		for(int i=0;i<arr.length;i++) {
		raf.writeFloat(arr[i]);
		}
		raf.close();
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
   }
}
