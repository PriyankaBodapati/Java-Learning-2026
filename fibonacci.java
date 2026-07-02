import java.util.*;
class Fibonacci
{
	public static void main(String args[])
	{
		int n,a=0,b=1,i,fib;
		System.out.println("Enter a value");
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		System.out.print(a+" "+b+" ");
		for(i=3;i<=n;i++)
		{	
			fib=a+b;
			System.out.print(fib +" ");
			a=b;
			b=fib;
		}
	}
}
