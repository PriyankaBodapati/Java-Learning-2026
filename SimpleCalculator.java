import java.util.*;
class Calc
{
	public static void main(String args[])
	{	
		int num_1,num_2;
		System.out.println("Enter values");
		Scanner s=new Scanner(System.in);
		num_1=s.nextInt();
		num_2=s.nextInt();
		System.out.println("Enter an Operation from the following: \nAddition(+) \nSubtraction(-) \nMultipliction(*) \nDivision(/) \nModulus(%)");
		char operation=s.next().charAt(0);
		switch(operation)	{
			case '+':System.out.println(num_1+num_2);
			break;
			case '-':System.out.println(num_1-num_2);
			break;
			case '*':System.out.println(num_1*num_2);
			break;
			case '/':System.out.println(num_1/num_2);
			break;
			case '%':System.out.println(num_1%num_2);
			break;	
		}
	}
}