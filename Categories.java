import java.util.LinkedList;

/** Categories.java
 * 
 *  @author Shane Sarnac, Fadhil Suhendi, Dan Wallin
 *  <hr> 									
 *  @date Originally created: 10/19/2014 									
 *  @modified Modified on: 12/3/2014 (added self-documenting code)
 * 	
 *  <hr>
 * 
 *  @section desc Description
 *  This files is used in order to set assignment point totals for a given category.
 */ 

public class Categories {
	private String category_name;
	private double weight;
	private int assignment_count = 0;
	private double total_points_earned, total_points_possible;
	private LinkedList<Assignments> assignments = new LinkedList<Assignments>();
	
	public Categories()
	{
		this.weight = 0.0;
	}
	
	/**
	 * This method adds a new assignment as well as points earned and points possible for that assignment
	 * to a given category by utilizing the Assignments class. 
	 * @param assignment_count is incremented each time that a new assignment is added to a category
	 * */
	public void add_Assignment(String Name, double Points_Earned, double Points_Possible, boolean Complete)
	{
		Assignments A = new Assignments();
		A.set_Name(Name);
		A.set_Points_Earned(Points_Earned);
		A.set_Points_Possible(Points_Possible);
		A.set_Complete(Complete);
		assignments.add(A);
		assignment_count++;
		total_points_earned += Points_Earned;
		total_points_possible += Points_Possible;
	}
	
	
	/**
	 * This method simply removes an assignment whose information was entered incorrectly then decrements assignment count.  
	 * */
	public void remove_Assignment(int index)
	{
		assignments.remove(index);
		assignment_count--;
	}
	
	
	/**
	 * This method removes all assignments using recursion.  
	 * @param 
	 * */
	public void remove_All_Assignments()
	{
		if(assignment_count != 0)
		{
			remove_Assignment(assignment_count - 1);
			remove_All_Assignments();
		}
	}
	
	public void set_Category_Type(String Category_name)
	{
		this.category_name = Category_name;
	}
	
	public void set_Category_Weight(double Weight) 
	{
		this.weight = Weight;
	}
	
	
	/**
	 * This method is used to set the total points earned and total points possible for a given category. It first removes any
	 * assignments that were previously added.
	 * */
	public void set_Totals(double Points_Earned, double Points_Possible)
	{
		remove_All_Assignments();
		total_points_earned = Points_Earned;
		total_points_possible = Points_Possible;
	}
		
	public String get_Category_Name() 
	{
		return category_name;
	}
	
	public double get_Category_Weight()
	{
		return weight;
	}
	
	public double get_Percent_Earned()
	{
		return total_points_earned/total_points_possible;
	}
}
