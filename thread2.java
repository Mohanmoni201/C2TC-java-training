package mohan;

public class thread2 {
       public static void main(String ar[]) {
    	   send sn = new send();
    	   numbers s = new numbers("HI",sn);
    	   numbers s1 = new numbers("Bye",sn);
       }
}

class numbers implements Runnable{
	send sp;
	String mes;
	 numbers(String mess,send obj) {
		  Thread th;
		  th = new Thread(this);
		  sp=obj;
		  mes = mess;
		  th.start();
		 
	}

	@Override
	public void run() {
		synchronized(sp){
			sp.sender(mes);
		}
		
	}
	
}

class send {
	public void sender(String mes) {
		System.out.println("messege to send = "+mes);
		try {
			Thread.sleep(1000);
		System.out.println("messege sent = "+mes);
		}
		catch(InterruptedException e) {}
		}
}