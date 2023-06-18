package Bank;

public class BankAccount {
 String accountName;
 long acNumber;
 double balance;
 String address;
 final String IFSC="MAHB008";
 String accType;
 
 public BankAccount() {}
 
public BankAccount(String accountName, long acNumber, double balance, String address,String accType) {
	super();
	this.accountName = accountName;
	this.acNumber = acNumber;
	this.balance = balance;
	this.address = address;
	this.accType=accType;
}

  void printInfo()
 {
	 System.out.println("Account Number : "+acNumber);
	 System.out.println("IFSC Code : "+IFSC);
	 System.out.println("Account Name : "+accountName);
	 System.out.println("Account Balance : "+balance);
	 System.out.println("Address : "+address);
	 System.out.println("Account Type : "+accType);
 }
}
