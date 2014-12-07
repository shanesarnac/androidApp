import java.util.Scanner;
import java.util.LinkedList;

/** @mainpage GradeCalculator.java 
 * 
 *  @author Shane Sarnac, Fadhil Suhendi, Dan Wallin
 *  <hr> 									
 *  @date Originally created: 10/19/2014 									
 *  @modified Modified on: 11/29/2014 (added self-documenting code)
 * 	
 *  <hr>
 * 
 *  @section desc Description
 *  This files uses the Subject, Assignments and Categories classes in order to calculate the user's overall grade. 
 */ 


public class GradeCalculator
{
	/**
	* This method creates a new Subject class with the name provided by the user.
	* @param className the class name entered by the user
	* */	
	public static void Create_New_subject()
	{
		Subject subject = new Subject();
		Scanner in = new Scanner(System.in);
		String choice = "";
		String className = "";
		
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
		subject.set_Class_Name(className);
		Add_Category(subject);
		
			
		/* To Do: Add loops to allow for assignments to be added */
		subject.Save_Subject();
		Calculate(subject);
	}
	
	/**
	 * This method adds a category (or multiple categories) as well as the weights of each category in a given subject,
	 * then puts this information in the Categories class.
	 * @param Weight the percentage weight of the category
	 * */
	public static void Add_Category(Subject subject)
	{
		Scanner in = new Scanner(System.in);
		String choice = "";
		String categoryName = "";
		double Weight = 0.0;
		
		while(choice != "q" && subject.is_complete() == false)
		{
			System.out.println("You have completed " + subject.get_Percent_Complete() + " percent so far.");
			System.out.println("Enter the Name of the Category to be added: ");
			categoryName = in.nextLine();
			System.out.println("Enter the weight of the Category to be added: ");
			Weight = Double.parseDouble(in.nextLine());
			System.out.println("You entered: " + categoryName + " for the category name and " + Weight + " for the weight.");
			System.out.println("Is this correct (y/n)");
			choice = in.nextLine();
			if(choice.equals("y")) 
			{
				Categories category = new Categories();
				category.set_Category_Type(categoryName);
				category.set_Category_Weight(Weight);
				subject.add_Category(category);
				System.out.println("Would you like to add (1) Completed Assignments, (2) Enter Category totals, (3) skip this step? ");
				choice = in.nextLine();
				if(choice.equals("1"))
				{
					Add_Assignment(category);
				}
				else if(choice.equals("2"))
				{
					Set_Category_Totals(category);
				}
				else
				{
					choice = "q";
				}
			}
			choice = "";
		}
	}
	
	/**
	 * This method adds an assignment (or multiple assignments) within a category, and puts this information in the 
	 * Assignments class.
	 * @param points_possible total points available on an assignment.
	 * @param points_earned points earned by the student on the given assignment.
	 * */
	public static void Add_Assignment(Categories category)
	{
		Scanner in = new Scanner(System.in);
		String choice = ""; 
		String assignmentName = "";
		double points_possible = 0.0;
		double points_earned = 0.0;
		
		while(choice != "q")
		{
			System.out.println("Enter the name of the assignment");
			assignmentName = in.nextLine();
			System.out.println("Enter the number of points that can be earned in this assignment");
			points_possible = Double.parseDouble(in.nextLine());
			System.out.println("Enter the number of points earned on this assignment");
			points_earned = Double.parseDouble(in.nextLine());
			System.out.print("You entered: " + assignmentName + " for the name of the assignment, "); 
			System.out.print(points_possible + " for the total number of points possible, and ");
			System.out.println(points_earned + " for the number of points earned on the assignment. ");
			System.out.println("Is this correct? (y/n)");
			choice = in.nextLine();
			if(choice.equals("y"))
			{
				category.add_Assignment(assignmentName, points_earned, points_possible, true);
				System.out.println("Would you like to continue adding assignments? (y/n)");
				choice = in.nextLine();
				if(choice.equals("n"))
				{
					choice = "q";
				}
			}
		}
	}
	
	/**
	 * Instead of adding individual assignments to a category, this method adds total points earned 
	 * and total points available across all assignments.
	 * */
	public static void Set_Category_Totals(Categories category)
	{
		Scanner in = new Scanner(System.in);
		String choice = "";
		double points_earned = 0.0;
		double points_possible = 0.0;
		while(choice != "q")
		{
			System.out.println("Enter the number of points earned in the category");
			points_earned = Double.parseDouble(in.nextLine());
			System.out.println("Enter the total number of points available in the category");
			points_possible = Double.parseDouble(in.nextLine());
			System.out.println("You entered: " + points_earned + " for the points earned and " + points_possible + " for the total points possible");
			System.out.println("Is this correct? (y/n)");
			choice = in.nextLine();
			if(choice.equals("y"))
			{
				choice = "q";
			}
		}
		category.set_Totals(points_earned, points_possible);
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
