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
	
	public void add_Category()
	{
		Categories c;
		
	}
	
	public boolean is_complete()
	{
		return false;
	}
	
	public String get_Subject_Name()
	{
		return this.classname;
	}
	
	public int get_Credit_Hours()
	{
		return this.credit_hours;
	}
	
	
}
