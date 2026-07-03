import java.util.*;

class Details
{	
	public void emp_details(String ename,String eid,float esalary)
	{	
		System.out.println("Name of employee: "+ename);
		System.out.println("Employee Id: "+eid);
		System.out.println("Employee salary: "+esalary);
	}
}
class EmployeeDetails
{
	public static void main(String args[])
	{
		String name,id;
		float sal;
		Scanner a=new Scanner(System.in);
		System.out.println("Enter name,id,salary details of employee respectively: ");
		name=a.next();
		id=a.next();
		sal=a.nextFloat();	
		Details d=new Details();
		d.emp_details(name,id,sal);
	}
}	