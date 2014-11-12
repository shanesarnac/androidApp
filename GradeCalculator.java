import java.util.Scanner;
import java.util.LinkedList;

public class GradeCalculator
{	
	public static void Create_New_subject()
	{
		Subject p = new Subject();
		Scanner in = new Scanner(System.in);
		String choice = "";
		String className = "";
		String categoryName = "";
		double Weight = 0.0;
		while(choice != "q")
		{
			System.out.println("Enter name of class: ");
			className = in.nextLine();
			System.out.println("You entered: " + className + " is this correct? (y/n) ");
			choice = in.nextLine();
			if(choice.equals("y")) 
			{
				choice = "q";
			}
		}
		
		choice = "";
		p.set_Class_Name(className);
		while(p.is_complete() == false)
		{
			while(choice != "q")
			{
				System.out.println("Enter the Name of the Category to be added: ");
				categoryName = in.nextLine();
				System.out.println("Enter the weight of the Category to be added: ");
				Weight = Double.parseDouble(in.nextLine());
				System.out.println("You entered: " + categoryName + " for the category name and " + Weight + " for the weight.");
				System.out.println("Is this correct (y/n)");
				choice = in.nextLine();
				if(choice.equals("y")) 
				{
					choice = "q";
				}
			}
			choice = "";
			p.add_Category(categoryName, Weight);
		}
		/* To Do: Add loops to allow for assignments to be added */
		p.Save_Subject();
		Calculate(p);
	}
	
	public void Load_Subject()
	{
		Subject p = new Subject();
		p.Load_Subject();
		//Calculate(p);
	}
	
	public static void Calculate(Subject p)
	{
		double grade = 0;
		grade = p.Calculate_Grade();
		System.out.println("Your grade in " + p.get_Subject_Name() + " is " + grade);
	}
	
	public static void main(String[] args)
	{
		Create_New_subject();
	}
}
