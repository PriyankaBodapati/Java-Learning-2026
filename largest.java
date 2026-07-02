import java.util.*;

class Largest
{
	public static void main(String args[]) 
	{
		int a,b,c;
		System.out.println("Enter three values");
		Scanner s = new Scanner(System.in);
        	a = s.nextInt();
		b = s.nextInt();
		c = s.nextInt();	
		if(a>b && a>c)
			System.out.println(a+ " is the largest number");
		else if(b>c)
			System.out.println(b+ " is the largest number");
		else
			System.out.println(c+ " is the largest number");
	}
}
	