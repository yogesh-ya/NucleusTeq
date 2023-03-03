//Create different methods in SavingsAccount class like withdraw(),
// deposit(), fixedDeposit().
package inheritance;
public class SavingsAccount extends Account
{
	//withdraw amount method
	public void withdraw()
	{
		System.out.println("Withdraw Method");
	}
	
	//deposite amount method
	public void deposit()
	{
		System.out.println("deposit Method");
	}
	
	//fixed Deposit method
	public void fixedDeposit()
	{
		System.out.println("fixed deposite Method");
	}
}