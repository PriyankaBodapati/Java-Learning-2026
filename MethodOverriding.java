import java.util.Scanner;

class Vehicle 
{
	void display() 
	{
        System.out.println("This is a Vehicle");
    	}
}
class Car extends Vehicle 
{
	@Override
	void display() 
	{
        System.out.println("This is a Car");
    	}
}

class Method
{
	public static void main(String[] args) 
	{
        Scanner s=new Scanner(System.in);
        System.out.println("Choose:");
        System.out.println("1.Vehicle");
        System.out.println("2.Car");
        int choice=s.nextInt();
        Vehicle obj;
        if(choice == 1) 
	{
		obj=new Vehicle();
        } 
	else if(choice == 2) 
	{
		obj=new Car();
        } 
	else
	{
		System.out.println("Invalid Choice");
		s.close();
		return;
	}
	obj.display();
    }
}