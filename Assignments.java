/** Assignments.java
 * 
 *  @author Shane Sarnac, Fadhil Suhendi, Dan Wallin
 *  <hr> 									
 *  @date Originally created: 10/19/2014 									
 *  @modified Modified on: 12/4/2014 (added self-documenting code)
 * 	
 *  <hr>
 * 
 *  @section desc Description
 *  The Assignments class is used in order to set points possible and available points for a given assignment. 
 */ 

public class Assignments {
	String title;
	double points_earned;
	double points_possible;
	boolean complete;
	
	
	public Assignments() 
	{
		this.points_earned = 0;
		this.points_possible = 1;
	}
	
	public void set_Name(String Name)
	{
		this.title = Name;
	}
	
	public void set_Points_Earned(double Points_Earned)
	{
		this.points_earned = Points_Earned;
	}
	
	public void set_Points_Possible(double Points_Possible)
	{
		this.points_possible = Points_Possible;
	}
	
	
	/**
	 * This method sets an assignment to be completed only after it has been assigned point values.
	 */
	public void set_Complete(boolean Complete)
	{
		this.complete = Complete;
	}
	
	public String get_Title()
	{
		return this.title;
	}
	
	public double get_Points_Earned()
	{
		return this.points_earned;
	}
	
	public double get_Points_Possible ()
	{
		return this.points_possible;
	}
	
	/**
	 * This method checks to make sure that the assignment has been assigned points earned and points available.
	 */
	public boolean is_Complete()
	{
		return complete;
	}
}
