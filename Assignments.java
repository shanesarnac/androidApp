

public class Assignments {
	String title;
	double points_earned;
	double points_possible;
	
	public Assignments() 
	{
		this.title = Title;
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
}
