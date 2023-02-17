package mohan;

import java.io.File;

public class fileclass {
	public static void main(String a[]) {
File f = new File("D:\\");
String lis[] = f.list();
for(int i=0;i<lis.length;i++) {
  if(lis[i].endsWith(".pdf"))
System.out.println(lis[i]);
}
}
}