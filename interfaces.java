package mohan;

import java.util.Random;

interface storein{
	public void storage();
}
public class interfaces {
	public static void main(String ar[]) {
       storein s ;
       Random in = new Random();
        int a  =  in.nextInt();
        int g = in.nextInt();
        
        if(a>g) {
        	s = new amazon();
        }
        else s =new gdrive();
s.storage();}     
}
class amazon implements storein{
	public void storage() {
		System.out.println("Stored in amazon server");
	}
}
class gdrive implements storein{
	public void storage() {
		System.out.println("Stored in google server");
	}
}
