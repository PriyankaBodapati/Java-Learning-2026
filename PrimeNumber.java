import java.util.*;
class Prime
{
	public static void main(String args[])
	{
		int n;
		System.out.println("Enter a value");
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		int i,c=0;
		for(i=2;i<n;i++)
		{
			if(n%i==0)
				c++;	
		}
		if(c>0)	
			System.out.println(n+" is a not a prime number");
		else
			System.out.println(n+" is a prime number");
	}
}