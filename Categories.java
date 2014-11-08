
import java.util.LinkedList;

public class Categories {
	private String category_name;
	private double weight;
	private LinkedList<Assignments> assignments;
	
	public Categories()
	{
		this.weight = 0.0;
	}
	
	public void add_Assignment(String Name, double Points_Earned, double Points_Possible)
	{
		Assignments A = new Assignments();
		A.set_Name(Name);
		A.set_Points_Earned(Points_Earned);
		A.set_Points_Possible(Points_Possible);
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
	
	
	
}
