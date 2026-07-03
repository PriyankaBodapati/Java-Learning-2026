import java.util.*;

class Armstrong
{
    static void check_num(int num)
    {
        int r,sum=0;
        int n=num;

        while(n>0)
        {
            r=n%10;
            sum=sum+(r*r*r);
            n=n/10;
        }

        if (sum==num)
            System.out.println(num + " is an Armstrong number");
        else
            System.out.println(num + " is not an Armstrong number");
    }
}

class Main
{
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
	System.out.println("Enter a value");
	int num = s.nextInt();
        Armstrong.check_num(num);
    }
}
	
	