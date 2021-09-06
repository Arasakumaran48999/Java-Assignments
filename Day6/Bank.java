package Day6;
public class Bank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer c=new Customer();
		Thread t1=new Thread(new Runnable()
				{

					@Override
					public void run() {
						// TODO Auto-generated method stub
						c.withdraw(9000);
						c.deposit(2000);
						
					}});
		Thread t2=new Thread(new Runnable()
		{

			@Override
			public void run() {
				// TODO Auto-generated method stub
				c.withdraw(5000);
				c.deposit(6000);
				
			}});
		t1.start();
		t2.start();
		}

}
class Customer
{
	int totalbalance=5000;
	
	synchronized void withdraw(int amt)
	{
	if(totalbalance<amt)
	{
		try {
			System.out.println("waiting for money to get deposited");
			wait();
			
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		totalbalance-=amt;
		System.out.println("your amt withdraw");
	}
	else
	{
		totalbalance-=amt;
		System.out.println(" now withdraw amt");
	}
	}
	synchronized void deposit(int amt)
	{
		totalbalance+=amt;
		System.out.println("amt deposited");
		notify();
	}
}