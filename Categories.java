import java.util.LinkedList;

public class Categories {
	private String category_name;
	private double weight;
	private LinkedList assignments;
	
	public Categories(String Category_name, double Weight)
	{
		this.category_name = Category_name;
		this.weight = Weight;
	}
	
	public void set_Category_Type()
	{
		
	}
	
	public void set_Category_Percentage(double percentage) 
	{
		
	}
	
	public double get_Category_Percentage() {
		return weight;
	}
	
	public String get_Category_Type() 
	{
		return category_name;
	}
	
	
	
}
