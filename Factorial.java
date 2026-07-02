import java.util.*;
class Factorial
{	
	public static void main(String args[])
	{
		int n,i,fact=1;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a value");
		n=s.nextInt();
		if(n==0 && n==1)
			System.out.println("1");
		for(i=1;i<=n;i++)
		{	
			fact=fact*i;
		}
		System.out.println("Factorial of "+n+" is "+fact);
	}
}