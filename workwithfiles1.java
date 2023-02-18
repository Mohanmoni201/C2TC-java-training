package mohan;

import java.io.File;

public class workwithfiles1 {
public static void main(String a[]) {
	{
		lisdir("D:\\Data mining\\");
	}

}
public static void lisdir(String dir) {
	     File f = new File(dir);
	     String ar[] = f.list();
	     for(int i=0;i<ar.length;i++) {
	    	    String curr = ar[i];
	    	    String newdir = dir+"\\"+curr;
	    	     File F = new File(newdir);
	    	     if(F.isDirectory()) {
	    	    	 lisdir(newdir);
	    	     }
	    	     else {
	    	    	 System.out.println(F.getPath());
	    	     }
	     }
}
}
