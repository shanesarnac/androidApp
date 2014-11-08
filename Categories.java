import java.util.LinkedList;

public class Categories {
	private String category_name;
	private double weight;
	private LinkedList assignments;
	
	public Categories()
	{
		this.category_name = "";
		this.weight = 0.0;
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
