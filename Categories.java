
import java.util.LinkedList;

public class Categories {
	private String category_name;
	private double weight;
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
		
	}
	
	public void set_Category_Type(String Category_name)
	{
		this.category_name = Category_name;
	}
	
	public void set_Category_Percentage(double Weight) 
	{
		this.weight = Weight;
	}
	
	public double get_Category_Percentage() {
		return weight;
	}
	
	public String get_Category_Type() 
	{
		return category_name;
	}
	
	public double Calculate_Score()
	{
		double total_points_earned = 0;
		double total_points_available = 0;
		double score;
		int total_Assignments = assignments.size();
		if(total_Assignments == 0)
		{
			return 0.0;
		}
		for(int i = 0; i < total_Assignments; i++)
		{
			if(assignments.get(i).is_Complete() == true)
			{
				total_points_earned += assignments.get(i).get_Points_Earned();
				total_points_available += assignments.get(i).get_Points_Possible();
			}
		}
		score = total_points_earned/ total_points_available;
		return score;
	}
	
	
}
