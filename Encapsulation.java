import java.util.*;

class Student
{
	private int id;
	private String name;
	private double marks;
	public void setId(int id)
	{
		this.id=id;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public void setMarks(double marks)		
	{
		this.marks=marks;
	}
	public int getId()
	{
		return id;
	}
	public String getName()
	{
		return name;
	}
	public double getMarks()
	{
		return marks;
	}
}
class Main
{
	public static void main(String args[])
	{	
		
		
		Student std=new Student();
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Student id: ");
		std.setId(s.nextInt());
		System.out.println("\nEnter Student name: ");
		std.setName(s.next());
		System.out.println("\nEnter Student Marks: ");
		std.setMarks(s.nextDouble());
		System.out.println("Enter Student id is "+std.getId());
		System.out.println("Enter Student name is "+std.getName());
		System.out.println("Enter Student Marks are "+std.getMarks());
	}
}