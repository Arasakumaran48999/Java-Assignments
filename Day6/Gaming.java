package Day6;

public class Gaming {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int flag=0;
		String win[]=new String[3];
		Gamer a=new Gamer();
		Thread t1=new Thread(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub

				a.pertolpump();
				a.pitstop();
				a.finalwinner();
			}

		});
		Thread t2=new Thread(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				a.pertolpump();
				a.pitstop();
				a.finalwinner();

			}

		});
		Thread t3 = new Thread(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				a.pertolpump();
				a.pitstop();
				a.finalwinner();
			}

		});
		Thread t4=new Thread(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				a.pertolpump();
				a.pitstop();
				a.finalwinner();

			}

		});
		Thread t5=new Thread(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				a.pertolpump();
				a.pitstop();
				a.finalwinner();
			}

		});
		Thread t6 = new Thread(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				a.pertolpump();
				a.pitstop();
				a.finalwinner();
			}

		});
		Thread t7=new Thread(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				a.pertolpump();
				a.pitstop();
				a.finalwinner();

			}

		});
		Thread t8 = new Thread(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				a.pertolpump();
				a.pitstop();
				a.finalwinner();

			}

		});

		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
		t6.start();
		t7.start();
		t8.start();

	}

}
class Gamer {
	synchronized void pertolpump() {
		for (int i = 0; i <= 50; i++) {
			if (i == 50) {
				System.out.println("Petrolpump:" + Thread.currentThread().getName());
				
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}

		}
	}
	synchronized void pitstop() {
		for (int i = 51; i <= 75; i++) {
			if (i == 75) {
				System.out.println("Pitstop:" + Thread.currentThread().getName());

				try {
					Thread.sleep(200);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}

		}
	}
	

	synchronized void finalwinner() {
		for (int i = 76; i <=100; i++) {
			if (i == 100) {
				System.out.println("Final:" + Thread.currentThread().getName());
				notifyAll();

			}

		}
	}
}



