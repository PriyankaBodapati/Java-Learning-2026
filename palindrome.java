import java.util.*;

class Palindrome 
{
	public static void main(String args[]) 
	{
		int n,i,q,reverse_number=0;
		System.out.println("Enter a value");
		Scanner s = new Scanner(System.in);
	        n = s.nextInt();
		i=n;
		while(i>0)
		{	
			q=i%10;
			reverse_number=(reverse_number*10)+q;
			i=i/10;
		}
		if(n==reverse_number)
			System.out.println(n+ " is a palindrome number");
		else
			System.out.println(n+ " is not a palindrome number");
	}
}