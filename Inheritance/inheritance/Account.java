/*Create a class Account with properties like accountNo, name,
address, phoneNo, dob, balance.
Write getter and setter methods for all properties

Create Parameterized Constructor for class Account.

Create a method closeAccount()

Create a class SavingsAccount which inherits Account class.

Create different methods in SavingsAccount class like withdraw(),
deposit(), fixedDeposit().

Create a class LoanAccount which also inherits Account class.

Create different methods in LoanAccount class like payEMI(),
topUpLoan(), repayment()*/

package inheritance;
public class Account 
{
	private long accountNo;
	private String name;
	private String address;
	private long phoneNo;
	private String dob;
	private long balance;
	
	//Parameterised Constructor
	// Account(long )
	// {
		
	// }
	//set & get account number 
	public void setAccountNo(long accountNo)
	{
		this.accountNo=accountNo;
	}
	public long getAccountNo()
	{
		return accountNo;
	}
	
	//set & get your name 
	public void setName(String Name)
	{
		this.name=name;
	}
	public String getName()
	{
		return name;
	}
	
	//set & get your address 
	public void setAddress(String address)
	{
		this.address=address;
	}
	public String getAddress()
	{
		return address;
	}
	
	//set & get your phoneNo 
	public void setPhoneNo(long phoneNo)
	{
		this.phoneNo=phoneNo;
	}
	public long getPhoneNo()
	{
		return phoneNo;
	}
	
	//set & get your dob 
	public void setDob(String dob)
	{
		this.dob=dob;
	}
	public String getDob()
	{
		return dob;
	}
	
	//set & get for balance 
	public void setBalance(long balance)
	{
		this.balance=balance;
	}
	public long getBalance()
	{
		return balance;
	}
	
	//method for closing account
	public void closeAccount()
	{
		System.out.println("Account closed");	
	}
}
