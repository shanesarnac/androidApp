

public class Assignments {
	String title;
	double points_earned;
	double points_possible;
	
	public Assignments(String Title, double Points_Earned, double Points_Possible) 
	{
		this.title = Title;
		this.points_earned = Points_Earned;
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
