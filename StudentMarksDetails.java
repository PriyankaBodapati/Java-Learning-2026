import java.util.*;

class StudentDetails
{
	String name;
	int rollno;
	StudentDetails(String sname,int srollno)
	{
		name=sname;
		rollno=srollno;
	}
	public void std_details()
	{
		System.out.println("Name of the student is "+name);
		System.out.println("Roll Number of the " + name + " is " +rollno);
	}
}
class MarksDetails
{
	int eng,phy,math;
	float avg;
	MarksDetails(int english,int physics,int mathematics)
	{
		eng=english;
		phy=physics;
		math=mathematics;
	}
	public void std_marks()
	{
		avg=(eng+phy+math)/3;
		System.out.println("English = " +eng+ "\nPhysics = " +phy+ "\nMathematics = "+math);
		System.out.println("Average marks = " +avg);
	}
}
class StudentMarksDetails
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter student name: ");
		String sname=s.next();
		System.out.println("Enter student Rollno: ");
		int srollno=s.nextInt();
		System.out.println("Enter English marks: ");
		int english=s.nextInt();
		System.out.println("Enter phyics marks: "); 
		int physics=s.nextInt();
		System.out.println("Enter mathematics marks: ");
		int mathematics=s.nextInt();
		StudentDetails sd=new StudentDetails(sname,srollno);
		MarksDetails sm=new MarksDetails(english,physics,mathematics);
		sd.std_details();
		sm.std_marks();
	}
}