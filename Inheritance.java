import java.util.*;

class GoldenRetriver
{	
	void features() 
	{
	System.out.println("golden colour, loyal, friendly");
	}
}
class GermanShepherd extends GoldenRetriver
{	
	void featuresGerman() 
	{
	System.out.println("black saddle on back, intelligent, trained");
	}
}
class Pomerian extends GermanShepherd
{	
	void featuresPomerian() 
	{
	System.out.println("orange or white, lively, extroverted");
	}
}
class Dogs
{
	public static void main(String[] args) 
	{	
		Scanner sc = new Scanner(System.in);
		Pomerian dog=new Pomerian();
		System.out.println("Choose a Dog Breed:\n1. Golden Retriever \n1. Golden Retriever \n3. Pomeranian");
		int choice = sc.nextInt();
		switch (choice) 
		{
           	case 1:dog.features();
                break;
		case 2:dog.featuresGerman();
                break;
		case 3:dog.featuresPomerian();
                break;
		default:
                System.out.println("Invalid Choice");
        	}
	}
}