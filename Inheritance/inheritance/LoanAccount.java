// Create a class LoanAccount which also inherits Account class.
// Create different methods in LoanAccount class like payEMI(),
// topUpLoan(), repayment()
package inheritance;
public class LoanAccount extends Account
{
	//pay EMI method
	public void payEMI()
	{
		System.out.println("Withdraw Method");
	}
	
	//topUpLoan method
	public void topUpLoan()
	{
		System.out.println("topUpLoan Method");
	}
	
	//repayment method
	public void repayment()
	{
		System.out.println("repayment Method");
	}
}