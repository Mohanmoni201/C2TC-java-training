package mohan;

public class basic {
       public  static void main(String ar[])
       {
    	   int a=10,b=12;
    	   System.out.println("sum of a and b is "+(a+b));
    	   
    	   int c = Integer.parseInt("43");
    	   float d = Float.parseFloat("40.23");
    	   double e = Double.parseDouble("123.231902");
    	   System.out.println(c+d+e);
    	   
    	   String len = "0123456789";
    	   System.out.println(len.length());
    	   
    	   String in = "mohankumarfeb201@gmail.com";
    	   int index = in.indexOf("@");
    	   System.out.println(index);
    	   String company = in.substring(index+1);
    	   System.out.println(company);
    	   
    	   String lastindex = "mohankumar@feb201@gmail.com";
    	   int last  = lastindex.lastIndexOf("@");
    	   System.out.println(last);
    	   System.out.println("companyname = "+lastindex.substring(last+1)+" username = "+lastindex.substring(0,last));
    	   
    	   String s  = "10 20 30";
    	   String sp[] = s.split(" ");
    	   int sum=0;
    	   for(int i=0;i<sp.length;i++) {
    		   sum+=Integer.parseInt(sp[i]);
    	   }
    	   System.out.println(sum);
    	   
    	   String mobile  = "9591856827,8618076882,2354624650";
    	   String spl[]=mobile.split(",");
    	   for(int i=0;i<sp.length;i++) {
    	         if(spl[i].startsWith("9591")) {
    	        	 System.out.println("Airtel");
    	         }
    	         else if(spl[i].startsWith("8618")) {
    	        	 System.out.println("jio");
    	         }
    	         else {
    	        	 System.out.println("Other provider");
    	         }
    	   }
    	   
    	   String comp= "water",p="Water";
    	   System.out.println(comp.equals(p));
    	   System.out.println(comp.equalsIgnoreCase(p));
    	   System.out.println((int)comp.charAt(0));
    	   System.out.println((int)p.charAt(0));
    	   System.out.println(comp.compareTo(p));
    	   
    	   //palindrome
    	   String  pali="mom";
    	   String newstring = "";
    	   for(int i=0;i<pali.length();i++) {
    	   String subpart = pali.substring(i,i+1);
    	   newstring = subpart+newstring;
    	   }
    	   if(pali.equals(newstring)) {
    		   System.out.println("palindrome");
    	   }
    	   else {
    		   System.out.println("Not palindrome");
    	   }
    	   //find vowels count
    	   String demo = "This is an demo message";
    	   String vowels = "aeiou";
    	   int cnt=0;
    	   demo = demo.toLowerCase();
    	   for(int i=0;i<demo.length();i++) {
    	   String each =  demo.substring(i,i+1);
    	   if(vowels.indexOf(each)>=0){
    		   cnt+=1;	   
    	   }
    	   }
    	   System.out.println("The count of vowels is "+cnt);
    	   
    	   System.out.println(demo.replace("demo","important"));
    	   
    	   int anc = 10;
    	   String an= String.valueOf(anc);
    	   System.out.println(an);
   }
}
