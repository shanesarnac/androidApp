import java.util.Scanner;

public class Link
{
	public double gradePercent;
	public double gradeWeight;
	
	public Link next;
	
	public Link(double gradePercent, double gradeWeight)
	{
		this.gradePercent = gradePercent;
		this.gradeWeight = gradeWeight;
	}
	
	public void display()
	{
		System.out.println(gradePercent + " " + gradeWeight);
	}

	public static void main(String[] args)
	{
		LinkList theLinkedList = new LinkList();
		
		Scanner in = new Scanner(System.in);
		System.out.print("How many grades will you be entering? ");
		int numGrades = in.nextInt();
		
		System.out.print("Enter grade followed by overall weight for all " + numGrades + " grade(s): ");
		double percent = 0;
		double weight = 0;
		
		while(numGrades > 0)
		{
			percent = in.nextDouble();
			weight = in.nextDouble();
			theLinkedList.insertFirstLink(percent, weight);
			numGrades--;
		}
		
		theLinkedList.display();
		theLinkedList.totalGrade();
		
		System.out.println(); 
	}
}

class LinkList
{
	public Link firstLink;
	
	LinkList() 
	{
		firstLink = null;
	}
	
	public boolean isEmpty()
	{
		return(firstLink == null);
	}
	
	
	public void insertFirstLink(double gradePercent, double gradeWeight)
	{
		Link newLink = new Link(gradePercent, gradeWeight);
		newLink.next = firstLink;
		firstLink = newLink;
	}
	
	//Removes first link
	public Link removeFirst()
	{
		Link linkReference = firstLink;
		
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
		Link theLink = firstLink;
		
		while(theLink != null)
		{
			theLink.display();
			//System.out.println("Next Link: " + theLink.next);
			theLink = theLink.next;
			System.out.println();
		}
	}

	public double totalGrade()
	{
		Link theLink = firstLink;
		double totalGrade = 0; 
		
		while(theLink != null)
		{
			totalGrade += theLink.gradePercent * (theLink.gradeWeight / 100);
			theLink = theLink.next;
		}
		System.out.println("Total grade: " + totalGrade + "%");
		return totalGrade;
	}
	
	/*
	public Link find(double category)
	{
		Link theLink = firstLink;
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
	
	public Link removeLink(String category)
	{
		Link currentLink = firstLink;
		Link previousLink = firstLink;
		
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


