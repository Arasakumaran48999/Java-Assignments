package arasakumaran;

import java.util.Scanner;

public class Task66 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		int option=0;
		if(num>0) {
			System.out.println("The given number is a positive integer");
			do{
				System.out.println("MENU:");
				System.out.println("1.even or odd\n2.prime or not\n3.palindrome or not\n4.armstrong or not\n5.perfect or not\n6.exit\n");
				option=sc.nextInt();
				switch(option) {
				case 1:{
					if(num%2==0) {
						System.out.println("The given number is an EVEN number");
					}else {
						System.out.println("The given number is a ODD number");
					}		
					break;
				}
				case 2:{
					int i,m=0,flag=0;      
					m=num/2;      
					if(num==0||num==1){  
						System.out.println("The given number is NOT prime number");      
					 }else{  
					   for(i=2;i<=m;i++){      
					    if(num%i==0){      
					    	System.out.println("The given nuymber is NOT prime number");      
					    	flag=1;      
					    	break;      
					    }      
					   }      
					   if(flag==0)  { System.out.println("The given number is prime number"); }  
					  }
				  	break;
				}
				case 3:{
					int r,sum=0,temp;    		  
					temp=num;    
					while(num>0){    
						r=num%10;  
						sum=(sum*10)+r;    
						num=num/10;    
					}    
					if(temp==sum)    
						System.out.println("palindrome number ");    
					else    
						System.out.println("not palindrome");
					
					break;
				}
				case 4:{
					int remainder,result=0;
					int tempp=num;
			        while(tempp!=0)
			        {
			            remainder=tempp%10;
			            result+=Math.pow(remainder, 3);
			            tempp/=10;
			        }
			        if(result == num)
			            System.out.println("The given number is an Armstrong number.");
			        else
			            System.out.println("The given number is NOT an Armstrong number.");

					break;
				}
				case 5:{
					int i=1;  
					int sum=0;
					while(i<=num/2){  
						if(num % i == 0){  
							sum = sum + i;  
						} 
					i++;  
					}
					if(sum==num)
						System.out.println("The given number is a perfect number");
					else
						System.out.println("The given number is not a perfect number");
						break;
			    }
				case 6:{
					System.out.println("The program is exited");
					break;
				}
				
				}
			}while(option!=6);
		}
		else {
			System.out.println("The given number is a negative integer");
		}
		
	}

}
