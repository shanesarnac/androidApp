
import java.util.LinkedList;

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
	
	public void remove_Assignment(int index)
	{
		assignments.remove(index);
		assignment_count--;
	}
	
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
