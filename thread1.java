package mohan;

public class thread1 {
 public static void main(String ar[]) {
	 country c = new country("india",9,59,50);
	 country d = new country("japan",10,59,50);
 }
}
class country implements Runnable{
	Thread th;
	int h,m,s;
	String count;

	public country(String count,int h,int m,int s){
		this.h = h;
		this.m = m;
		this.s = s;
		this.count = count;
		th = new Thread(this);
		th.start();
	}
	
	public void run() {
		while(true) {
		s++;
		if(s==60) {
			m++;
			s=0;
			if(m==60) {
				h++;
				m=0;
				if(h==24) {
					h=0;
					m=0;s=0;
				}
			}
		}
		try {Thread.sleep(1000);
		System.out.format("Country : %s %d:%d:%d  ",count,h,m,s);
	}
		catch(InterruptedException e) {}
		}
}
}