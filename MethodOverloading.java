import java.util.*;

class Areas
{	
	public void area(int lenght,int breadth)
	{	
		System.out.println("Area is " +(lenght*breadth));
	}
	public void area(int side)
	{
		System.out.println("Area is " +(side*side));
	}
	public void area(float radius)
	{
		System.out.println("Area is " +(3.14*radius*radius));
		
	}
}
class Shapes
{
	public static void main(String args[])
	{
		Areas a=new Areas();
		Scanner s=new Scanner(System.in);
		System.out.println("choose a shape to find area of that shape: \n1.Rectangle \n2.Square \n3.Circle ");
		int n=s.nextInt();
		if(n==1)
		{	
			System.out.println("Enter lenght and Breadth");
			int lenght=s.nextInt();
			int breadth=s.nextInt();
			a.area(lenght,breadth);
		}
		else if(n==2)
		{
			System.out.println("Enter side");
			int side=s.nextInt();
			a.area(side);
		}
		else if (n==3)
		{
			System.out.println("Enter raidus");
			float radius=s.nextFloat();
			a.area(radius);
		}
		else
			System.out.println("Invalid number");
	}
}

			
