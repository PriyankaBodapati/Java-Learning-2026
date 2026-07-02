import java.util.*;
class Evenodd
{
	public static void main(String args[])
	{
		int n;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a value");
		n=s.nextInt();
		if(n%2==0)
			System.out.println(n+ " is a Even Number");
		else	
			System.out.println(n+" is a Odd Number");
	}
}
		