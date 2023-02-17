package mohan;

import java.util.Calendar;
import java.util.Date;

public class age {
	public static void main(String a[]) {
		Date D = new Date();
		int year = D.getYear()+1900;
	 int born = 2001;
     int age = year-born;
     System.out.println(age);
     
     Calendar C = Calendar.getInstance();
     int age1=C.get(Calendar.YEAR)-born;
     System.out.println(age1);
     C.set(Calendar.DAY_OF_WEEK,7);
     int day = C.get(Calendar.DAY_OF_WEEK);
     C.set(Calendar.WEEK_OF_MONTH,2);
     int daymonth = C.get(Calendar.WEEK_OF_MONTH);
     System.out.println(daymonth);
     if(day==1 ||(day==7 && (daymonth==2 ||daymonth==4) )){
    	 System.out.println("Holiday");
     }
     else {
    	 System.out.println("working");
     }
}
}