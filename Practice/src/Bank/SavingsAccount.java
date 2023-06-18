package Bank;

public class SavingsAccount extends BankAccount{
	
	public static void main(String[] a)
	{
		String name="Onkar";
		long number=1234567;
		double balance=3940.0;
		String address="Jamkhed";
		BankAccount bk=new BankAccount(name,number,balance, address,"Savings");
		SavingsAccount sc=new SavingsAccount();
		sc.foo();
		
	}
	void foo()
	{
		super.printInfo();
	}
	
}
