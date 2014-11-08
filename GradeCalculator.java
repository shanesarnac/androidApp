import java.util.Scanner;
import java.util.LinkedList;

public class GradeCalculator
{
	public double pointsEarned;
	public double pointsPossible;
	public double gradeWeight;
	
	public GradeCalculator next;
	
	public GradeCalculator(double pointsEarned, double pointsPossible, double gradeWeight)
	{
		this.pointsEarned = pointsEarned;
		this.pointsPossible = pointsPossible;
		this.gradeWeight = gradeWeight;
	}
	
	public void Create_New_subject()
	{
		Subject p = new Subject();
		Scanner in = new Scanner(System.in);
		String choice = "";
		String className = "";
		while(choice != "q")
		{
			System.out.println("Enter name of class: ");
			className = in.nextLine();
			System.out.println("You entered: " + className + " is this correct? (y/n) ");
			choice = in.nextLine();
			if(choice == "y")
				choice = "q";
		}
		
		p.set_Class_Name(className);
		while(p.is_complete() == false)
		{
			p.add_Category();
		}
		p.Save_Subject();
		//Calculate(p);
	}
	
	public void Load_Subject()
	{
		Subject p = new Subject();
		p.Load_Subject();
		//Calculate(p);
	}
	
	public void Calculate(Subject p)
	{
		//p.totalGrade();
	}
	
	public void display()
	{
		//System.out.println(pointsEarned + " " + pointsPossible + " " gradeWeight);
	}
	
	public static void main(String[] args)
	{
		LinkList theLinkedList = new LinkList();
		
		Scanner in = new Scanner(System.in);
		System.out.print("How many grades will you be entering? ");
		int numGrades = in.nextInt();
		
		System.out.print("Enter grade followed by overall weight for all " + numGrades + " grade(s): ");
		double pointsE = 0;
		double pointsP = 0;
		double weight = 0;
		
		while(numGrades > 0)
		{
			pointsE = in.nextDouble();
			pointsP = in.nextDouble();
			weight = in.nextDouble();
			theLinkedList.insertFirstLink(pointsE, pointsP, weight);
			numGrades--;
		}
		
		theLinkedList.display();
		theLinkedList.totalGrade();
		
		System.out.println(); 
	}
}

class LinkList
{
	public GradeCalculator firstLink;
	
	LinkList() 
	{
		firstLink = null;
	}
	
	public boolean isEmpty()
	{
		return(firstLink == null);
	}
	
	
	public void insertFirstLink(double pointsEarned, double pointsPossible, double gradeWeight)
	{
		GradeCalculator newLink = new GradeCalculator(pointsEarned, pointsPossible, gradeWeight);
		newLink.next = firstLink;
		firstLink = newLink;
	}
	
	//Removes first link
	public GradeCalculator removeFirst()
	{
		GradeCalculator linkReference = firstLink;
		
		if(!isEmpty())
		{
			firstLink = firstLink.next;
		}
		else
		{
			System.out.println("Empty Linked List.");
		}
		
		return linkReference;
	}
	
	//Display everything in list until we hit nullptr
	public void display()
	{
		GradeCalculator theLink = firstLink;
		
		while(theLink != null)
		{
			theLink.display();
			//System.out.println("Next Subject: " + theLink.next);
			theLink = theLink.next;
			System.out.println();
		}
	}

	public double totalGrade()
	{
		GradeCalculator theLink = firstLink;
		double totalGrade = 0; 
		
		while(theLink != null)
		{
			totalGrade += (theLink.pointsEarned / theLink.pointsPossible) * (theLink.gradeWeight);
			theLink = theLink.next;
		}
		System.out.println("Total grade: " + totalGrade + "%");
		return totalGrade;
	}
	
	/*
	public GradeCalculator find(double category)
	{
		GradeCalculator theLink = firstLink;
		if(!isEmpty())
		{
			while(theLink.category != category)
			{
				if(theLink.next == null)
				{
					return null;
				}
				else
				{
					theLink = theLink.next;
				}
			} 
		}
		else
		{
			System.out.println("Empty Linked List");
		}
		
		return theLink;
	}
	
	public GradeCalculator removeLink(String category)
	{
		GradeCalculator currentLink = firstLink;
		GradeCalculator previousLink = firstLink;
		
		while(currentLink.category != category)
		{
			if(currentLink.next == null)
			{
				return null;
			}
			else
			{
				previousLink = currentLink;
				currentLink = currentLink.next;
			}
		}
		if(currentLink == firstLink)
		{
			firstLink = firstLink.next;
		}
		else
		{
			previousLink.next = currentLink.next;
		}
		
		return currentLink;
	}*/
}


