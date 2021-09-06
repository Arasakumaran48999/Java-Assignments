package Day5;

public class CommandLine {

	public static void main(String[] args) {
		CommandLine cl = new CommandLine();
		if(args.length > 0) {
			int i=Integer.parseInt(args[0]);
			cl.prime(i);
			cl.even(i);
			cl.palindrom(i);
			cl.armstrong(i);
			cl.perfect(i);
		}
		else {
			System.out.println("Not a command line argument");
		}

	}
	public void prime(int x) {
		boolean flag = false;
	    for (int i = 2; i <= x / 2; ++i) {
	      if (x % i == 0) {
	        flag = true;
	        break;
	      }
	    }

	    if (!flag)
	      System.out.println(x + " is a prime number.");
	    else
	      System.out.println(x + " is not a prime number.");
	  }
	public void even(int x) {
		if(x % 2 == 0) {
			System.out.println("The number is even");
		}else {
			System.out.println("The number is odd");
		}
	}
	public void palindrom(int x) {
		  int r,sum = 0,temp;    		  
		  temp = x;    
		  while(x > 0){    
		   r = x % 10;  
		   sum = (sum * 10) + r;    
		   x = x / 10;    
		  }    
		  if(temp == sum)    
		   System.out.println("palindrome number ");    
		  else    
		   System.out.println("not palindrome");    
		}
	public void armstrong(int x) {
		int temp = x;
		int a;
		int sum = 0;
		while(temp > 0) {
			a = temp % 10;
			temp=temp/10;
			sum=(int) (sum+(Math.pow(a,3)));
		}
		if(sum == x) {
			System.out.println("This number is a Armstrong number");
		}else {
			System.out.println("This number is not a Armstrong number");
		}
	}
	public void perfect(int x) {  
		int sum=0;
		int sample=x;
		for(int i=1; i <= x/2; i++)  
		{  
			if(x % i == 0)  
			{  
				sum=sum + i;  
			} 
		}
		if(sum == sample) {
			System.out.println("The given number is a perfect number");
		}else {
			System.out.println("The given number is not a perfect number");
		}
	} 
}
	
	

