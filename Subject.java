import java.util.LinkedList;

public class Subject {
	private String classname;
	private int credit_hours;
	private int category_count;
	private LinkedList<Categories> categories = new LinkedList<Categories>();
	
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
		C.set_Category_Weight(Weight);
		categories.add(C);
		category_count++;
	}
	
	public void add_Category(Categories category)
	{
		categories.add(category);
		category_count++;
	}
	
	public void remove_Category(int index)
	{
		categories.remove(index);
	}
	
	public boolean is_complete()
	{
		System.out.println("The Percent complete so far is " + this.get_Percent_Complete());
		return this.get_Percent_Complete() == 100.0;
	}
	
	public String get_Subject_Name()
	{
		return this.classname;
	}
	
	public int get_Credit_Hours()
	{
		return this.credit_hours;
	}
	
	public int get_Category_Count()
	{
		return this.category_count;
	}
	
	public Categories get_Category(int i)
	{
		return categories.get(i);
	}
	
	public double get_Percent_Complete()
	{
		double sum = 0;
		for(int i = 0; i < category_count; i++)
		{
			sum += categories.get(i).get_Category_Weight();
		}
		return sum;
	}
	
	public double Calculate_Grade() 
	{
		int total_categories = categories.size();
		double grade = 0;
		if(total_categories == 0)
		{
			return 0;
		}
		for(int i = 0; i < total_categories; i++)
		{
			grade += categories.get(i).get_Percent_Earned()*categories.get(i).get_Category_Weight();
		}
		return grade;
	}
	
}
