import java.util.*;

class AccountDetails
{	
	public void deposit()
	{
		System.out.println("Enter amount to be deposited into your account: ");
		float a=enter_amount();
		System.out.println("Amount of "+ a +" is deposited into your account");
	}
	public void withdraw()
	{
		System.out.println("Enter amount to be withdraw from your account: ");
		float a=enter_amount();
		System.out.println("Amount of "+ a +" is Withdrawed from your account");
	}
	public float enter_amount()
	{
		Scanner s=new Scanner(System.in);
		float amount=s.nextFloat();
		return amount;
	}
}
class BankAccount
{	
	public static void main(String args[])
	{	
	Scanner s=new Scanner(System.in);
	AccountDetails ad=new AccountDetails();
	System.out.println("Enter 1 to deposit or Enter 2 to withdraw");
	int n=s.nextInt();
	if(n==1)
		ad.deposit();
	else if(n==2)	
		ad.withdraw();	
	else 
		System.out.println("Invalid number");
	}
}