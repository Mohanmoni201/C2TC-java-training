package mohan;

public class classobj1 {
        public static void main(String ar[]) {
        	remainder r = new remainder();
        	r.set("work","10:30am");
        	r.dis();
        	
        }
}
class remainder {
	   private String title,timings;

	public void set(String title,String timings) {
		this.title=title;
		this.timings = timings;
	}
	public void dis() {
		System.out.println("Title = "+title+" Timings = "+timings);
	}
}