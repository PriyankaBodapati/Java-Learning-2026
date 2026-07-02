import java.util.*;

class MultiplicationTable 
{
	public static void main(String args[]) 
	{
	int n,i 	;
	Scanner s = new Scanner(System.in);
	System.out.println("Enter a value");
        n = s.nextInt();
	for(i=1;i<=10;i++)
	{
		System.out.println(n+ " x " +i+" = " +(n*i));
	}
	}
}