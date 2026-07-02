import java.util.*;

class ReverseNum 
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
		System.out.println("Reverse of "+n+ " is " +reverse_number);
	}
}