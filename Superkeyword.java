import java.util.*;

class Patient
{
	Patient(String name) 
	{
        	System.out.println("Patient Name: " + name);
    	}
}

class Age extends Patient 
{
	Age(String name, int age) 
	{
        	super(name);
        	System.out.println("Patient Age: " + age);
    	}
}

class Main 
{
	public static void main(String args[]) 
	{
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter Patient Name: ");
        String name = sc.nextLine();
	System.out.print("Enter Patient Age: ");
        int age = sc.nextInt();
	Age d = new Age(name, age);
    	}
}