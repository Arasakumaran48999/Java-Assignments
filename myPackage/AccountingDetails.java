package myPackage;

import java.util.Scanner;

public class AccountingDetails implements Account {
  public static int accountnumber = 102; 
  String accountholdername;
  String accountholderaddress;
  double minimumbalance;
  double balance;
  long mobileno;
  int anumber;

  public AccountingDetails(String accountholdername, double minimumbalance,
		double balance, String accountholderaddress, long mobileno) {
    super();
    this.accountholdername = accountholdername;
    this.minimumbalance = minimumbalance;
    this.balance = balance;
    this.accountholderaddress = accountholderaddress;
    this.mobileno = mobileno;
  }
  
  public AccountingDetails() {
	    accountnumber ++;
	  }
  public int getAccountNumber() {
    return anumber;
  }
  public String getAccountholderaddress() {
    return accountholderaddress;
  }

  public void setAccountholderaddress(String accountholderaddress) {
    this.accountholderaddress = accountholderaddress;
  }

  public long getMobileno() {
    return mobileno;
  }

  public void setMobileno(long mobileno) {
    this.mobileno = mobileno;
  }
  
  public String getAccountholdername() {
    return accountholdername;
  }

  public void setAccountholdername(String accountholdername) {
    this.accountholdername = accountholdername;
  }

  public long getAccountnumber() {
    return accountnumber;
  }

  public double getMinimumbalance() {
    return minimumbalance;
  }

  public void setMinimumbalance(double minimumbalance) {
    this.minimumbalance = minimumbalance;
  }

  public double getBalance() {
    return balance;
  }
  
  public void setAccountNumber(int accountnumber) {
	  this.anumber = accountnumber;
  }
  
  public void setBalance(double balance) {
    this.balance = balance;
  }

  @Override
  public void withdrawAmount(double amount) {
    double balance = getBalance();
    if(amount < balance) {
      balance = balance - amount;
      setBalance(balance);
      System.out.println("Amount withdrawn");
    }
    else {
    	System.out.println("Amount cannot be withdrawn");
    }
	
}

  @Override
  public void depositAmount(double amount) {
    double balance = getBalance();
    balance = balance + amount;
    setBalance(balance);
    System.out.println("Amount deposited successfully");
	
  }

  @Override
  public void checkBalance() {
    System.out.println("Your current balance is : " + getBalance());	
	
  }

  @Override
  public void calculateInterest() {
	  double balance=getBalance();
      double interest = (balance*5)/(12*100);
      System.out.println("Your interest is: " + interest);
  }

  @Override
  public void createAccount() {
	System.out.println("Enter the details....");
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter AccountHolderName:");
	String accountholdername = sc.nextLine();
	System.out.println("Enter the address:");
	String accountholderaddress = sc.nextLine();
	System.out.println("Enter contact number:");
	long mobileno = sc.nextLong();
	System.out.println("Enter the minimum amount to be deposited while creating account:");
	double minimumbalance = sc.nextDouble();
	System.out.println("Enter the amount you want to deposit:");
	double balance = sc.nextDouble();
	setAccountholdername(accountholdername);
	setAccountholderaddress(accountholderaddress);
	setMobileno(mobileno);
	setMinimumbalance(minimumbalance);
	setBalance(balance);
	setAccountNumber(accountnumber);
	System.out.println("Account created");
  }

  @Override
  public void displayAccountDetails() {
    System.out.println("Account Details---------------");
    System.out.println("AccountHolderName:" + accountholdername);
    System.out.println("AccountNumber:" + anumber);
    System.out.println("AccountHolderAddress:" + accountholderaddress);
    System.out.println("Contact Number:" + mobileno);
    System.out.println("MinimumBalance:" + minimumbalance);
    System.out.println("Balance:" + balance);
    System.out.println("--------------------------------------------------------------");
  }

  
}