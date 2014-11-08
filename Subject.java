import java.util.LinkedList;

public class Subject {
	private String classname;
	private int credit_hours;
	private LinkedList<Categories> categories;
	
	public Subject()
	{
		this.credit_hours = 0;
	}
	
	public void Save_Subject()
	{
		
	}
	
	public void Load_Subject()
	{
		
	}
	
	public void set_Class_Name(String ClassName)
	{
		this.classname = ClassName;
	}
	
	public void set_Credit_Hours(int Credit_Hours)
	{
		this.credit_hours = Credit_Hours;
	}
	
	public void add_Category(String Name, double Weight)
	{
		Categories C = new Categories();
		C.set_Category_Type(Name);
		C.set_Category_Percentage(Weight);
		categories.add(C);
	}
	
	public boolean is_complete()
	{
		int List_Size = categories.size();
		double sum = 0;
		for(int i = 0; i < List_Size; i++)
		{
			sum += categories.get(i).get_Category_Percentage();
		}
		return sum == 100.0;
	}
	
	public String get_Subject_Name()
	{
		return this.classname;
	}
	
	public int get_Credit_Hours()
	{
		return this.credit_hours;
	}
	
	public double Calculate_Grade() 
	{
		int total_categories = categories.size();
		double grade = 0;
		for(int i = 0; i < total_categories; i++)
		{
			score += categories.get(i).Calculate_Score()*categories.get(i).get_Category_Percentage();
		}
		return score;
	}
	
}
