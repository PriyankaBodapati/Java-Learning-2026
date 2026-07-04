import java.util.*;

class Student
{
	final String college="KITS";
	final void displayCollege()
	{
		System.out.println("College: " +college);
	}

	void displayStudent(String name)
	{
		System.out.println("Student Name: " +name);
	}
}

class Main
{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		Student std = new Student();
		System.out.print("Enter Student Name: ");
		String name = s.nextLine();
		std.displayStudent(name);
		std.displayCollege();
	}
}