import inheritance.Account;
import inheritance.SavingsAccount;
import inheritance.LoanAccount;
public class TestAccount
{
	public static void main(String ar[])
	{
		LoanAccount loanaccount =new  LoanAccount();
		loanaccount.closeAccount();
		SavingsAccount savingsaccount = new SavingsAccount();
		savingsaccount.closeAccount();
	}
}