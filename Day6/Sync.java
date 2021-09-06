package Day6;

public class Sync {

	public static void main(String[] args) {
		Sync s = new Sync();
		Thread t1 = new Thread(new Runnable() {
			public void run() {
				s.display(5);
			}
		});
		Thread t2= new Thread(new Runnable() {
			public void run() {
				s.display(7);
			}
		});
		t1.start();
		t2.start();
	}
	public void display(int n) {
		synchronized(this) {
			for(int i = 0;i < 20;i++) {
				System.out.println(n+" x "+i+" = "+(i*n));
			}
		}
	}
}
