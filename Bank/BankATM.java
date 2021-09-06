package Bank;
import java.io.*;
import java.util.*;

import kumaran.Infer1;
import kumaran.Infer2;
import kumaran.info;
public class BankATM{

    public static void main(String[] args) {
        // TODO code application logic here
    	Scanner sc=new Scanner(System.in);
    	System.out.println("Choose website for ur bank digitally:");
    	System.out.println("1.HDFC\t2.SBI\t3.TMB");
    	int choice=sc.nextInt();
    	switch(choice) {
    	case 1:{
    		HDFC in1=new HDFC();
    		in1.showBank();
    		break;
    	}													//USING INTERFACE CONCEPT
    	case 2:{
    		SBI in2=new SBI();
    		in2.showBank();
    		break;
    	}
    	case 3:{
    		TMB in3=new TMB();
    		in3.showBank();
    		break;
    	}
    	}
    	
        
        Cash[] obj=new Cash[2];
        obj[0]=new Cash(1000,500,100);
        //obj[0].display();
        int ff=0;
        int gg=0;
        int hh=0;
        int jj=0;
        Customer[] obj1=new Customer[5];
        obj1[0]=new Customer(101,"Suresh",2343,25234);
        obj1[1]=new Customer(102,"Ganesh",5432,34123);
        obj1[2]=new Customer(103,"Magesh",7854,26100);
        obj1[3]=new Customer(104,"Naresh",2345,80000);
        obj1[4]=new Customer(105,"Harish",1907,103400);
        //obj1[4].display();
        int n=1;
        while(n>0){
            System.out.println("Enter your choice:\n1.Load cash\n2.show customer\n3.Show ATM operations\n0.Exit");
         n=sc.nextInt();
        switch (n){
            case 1:
            {
                System.out.println("Enter the number of Thousand rupees note:");
                int t=sc.nextInt();
                System.out.println("Enter the number of Five hundred rupees note:");
                int f=sc.nextInt();
                System.out.println("Enter the number of Hundred rupees note:");
                int h=sc.nextInt();
                obj[1]=new Cash(t,f,h);
                System.out.println("The ATM Machine contains:");
                obj[1].display();
                break;
            }
            case 2:
            {
                System.out.println("Accno|Name   |PIN |Balance");
                for(int i=0;i<5;i++){
                    obj1[i].display();
                }
                break;
            }
            case 3:
            {
                int l=0;
                System.out.println("Enter your Account number:");
                int ano=sc.nextInt();
                System.out.println("Enter the PIN:");
                int pi=sc.nextInt();
                int flag=0;
                for(int i=0;i<5;i++){
                    if(ano==obj1[i].accno){
                        if(pi==obj1[i].pin){
                            flag=1;
                            l=i;
                        }
                        else{
                            System.out.println("Your pin id is incorrect");
                        }
                    }
                    else{
                        System.out.println("Account number is not correct!!");
                    }
                }
                if(flag==1){
                    int nn=1;
                    while(nn>0){
                        System.out.println("Enter your choice:");
                        System.out.println("1.Check balance\n2.withdraw money\n3.Transfer money\n4.Mini statement\n0.Exit");
                        nn=sc.nextInt();
                        switch (nn){
                            case 1:
                            {
                                System.out.println("Your Balance is:"+obj1[l].accbal);
                                break;
                            }
                            case 2:
                            {
                                System.out.println("Enter the Amount to Withdraw:");
                                int amount=sc.nextInt();
                                ff=amount;
                                gg=1;
                                if((amount>=100)&&(amount<=10000)){
                                    int th=amount/1000;
                                    int rem=amount%1000;
                                    int fiv=rem/500;
                                    int rem1=rem%500;
                                    int hun=rem1/100;
                                    
                                    if(amount<obj1[l].accbal){
                                        obj1[l].accbal=obj1[l].accbal-amount;
                                        obj[1].thou=obj[1].thou-th;
                                        obj[1].fivehundreds=obj[1].fivehundreds-fiv;
                                        obj[1].hund=obj[1].hund-hun;
                                        System.out.println("The Amount distribution u have received!!");
                                        System.out.println("Thousands:"+th+"Five hundreds:"+fiv+"Hundreds:"+hun);
                                        System.out.println("The Amount order remains in ATM!!");
                                        obj[1].display();
                                    }
                                    else{
                                        System.out.println("Amount Insufficient in your Balance!!");
                                    }
                                }
                                else{
                                    System.out.println("Your Withdrawal amount is not in range!!");
                                }
                                break;
                            }
                            case 3:
                            {
                                System.out.println("Enter the REceiver Account number:");
                                int aac=sc.nextInt();
                                System.out.println("Enter the Amount to Transfer:");
                                int aam=sc.nextInt();
                                hh=aam;
                                if((aam>1000)&&(aam<10000)){
                                    jj=1;
                                    if(obj1[l].accbal>aam){
                                    obj1[l].accbal=obj1[l].accbal-aam;
                                    for(int i=0;i<5;i++){
                                        if(aac==obj1[i].accno){
                                              obj1[i].accbal=obj1[i].accbal+aam;
                                        }
                                    }                    
                                    }
                                }
                                break;
                            }
                            case 4:
                            {
                                int mm=1;
                                System.out.println("Account number:"+obj1[l].accno);
                                System.out.println("Holder name:"+obj1[l].accholder);
                                System.out.println("Account Balanace:"+obj1[l].accbal);
                                System.out.println("Id |     Remarks                                |Transcation Type  |  Transaction amount");
                                if(gg==1){
                                    System.out.println(mm+" "+"Withdrawn amount"+ff+" from ATM             "+"     Depit            "+ff);
                                    mm+=1;
                                }
                                 if(jj==1){
                                    System.out.println(mm+" "+"Transferred amount"+hh+" to another account  "+"     credit           "+hh);
                                    mm+=1;
                                }
                                
                                break;
                            }
                        }
                    }
                }
            }
        }
    }
        switch(choice) {
    	case 1:{
    		HDFC in1=new HDFC();
    		in1.thanksnote();
    		break;
    	}
    	case 2:{
    		SBI in2=new SBI();
    		in2.thanksnote();
    		break;
    	}
    	case 3:{
    		TMB in3=new TMB();
    		in3.thanksnote();
    		break;
    	}
    	}
        
    }
}   

class Cash
{  
int fivehundreds;
int thou;
int hund;
    Cash(int tho,int five,int hun)  
    {  
        thou=tho;
        fivehundreds=five;
        hund=hun;
    }
    public void display(){
        System.out.println("Thousand:"+thou+"Five Hundreds:"+fivehundreds+"Hundreds:"+hund);
    }

}  

class Customer
{  
int accno;
String accholder;
int pin;
int accbal;
    Customer(int acno,String achol,int acpin,int acbal)  
    {  
        accno=acno;
        accholder=achol;
        pin=acpin;
        accbal=acbal;
    }
    public void display(){
        System.out.println(accno+" "+accholder+" "+pin+" "+accbal);
    } 

}  
