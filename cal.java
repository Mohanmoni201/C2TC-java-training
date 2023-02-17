package mohan;

import java.util.Date;

public class cal {
	public static void main(String ar[]) {
	 Date C =new Date();
     Date D =new Date(2020,10,21);
     int date = C.getDate();
     int month = C.getMonth()+1;
     int year  = C.getYear()+1900;
     String toString = C.toString();
     int day = C.getDay();
     int compare = C.compareTo(D);
     
     int h = C.getHours();
     int m = C.getMinutes();
     int s = C.getSeconds();
      System.out.print(date+"\n"+month+"\n"+year+"\n"+toString+"\n"+day+"\n"+compare+"\n"+h+"\n"+m+"\n"+s);
     
	}
}
