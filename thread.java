package mohan;

public class thread {
 public static void main(String ar[]) {
     charp c = new charp();
     charpri d = new charpri();
     for(int i = 0;i<=26;i++) {
    	 System.out.print(i+" ");
    	 try {
    		 Thread.sleep(1000);
    	 }
    	 catch(InterruptedException e){}
     }
 }
}
class charpri implements Runnable{

	public charpri(){ 
		Thread th;	
		th = new Thread(this);
	 th.start();
	}
	@Override
	public void run() {
		for(int i=65;i<=90;i++) {
			System.out.print(((char)i)+ " ");
			 try {
	    		 Thread.sleep(1000);
	    	 }
	    	 catch(InterruptedException e){}
	     }
		}
		
}
class charp implements Runnable{

	public charp(){ 
		Thread th;	
		th = new Thread(this);
	 th.start();
	}
	@Override
	public void run() {
		for(int i=27;i<=90;i++) {
			System.out.print((i)+ " ");
			 try {
	    		 Thread.sleep(1000);
	    	 }
	    	 catch(InterruptedException e){}
	     }
		}
		
}
	

