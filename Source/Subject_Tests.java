public class Subject_Tests {
	public static void test_Get_Category(int test_number)
	{
		Subject testsubject = new Subject();
		boolean isvalid = true;
		
		System.out.println("Test " + test_number + ": testing get_Category() ");
		System.out.println(".....Initializing categories.....");
		//Initialize multiple Categories 
		for(int i = 0; i < 10; i++)
		{
			testsubject.add_Category("Category" + i, 10.0);
		}
		System.out.println(".....Checking if categories are valid.....");
		// Check to see if all categories correctly added
		for(int j = 0; j < 10; j++)
		{
			if(testsubject.get_Category(j).get_Category_Name() == ("Category" + j))
				isvalid = true;
			if(testsubject.get_Category(j).get_Category_Weight() == 10.0)
				isvalid = true;
		}
		if(isvalid == true)
			System.out.println("Test " + test_number + " passed. ");
		else
			System.out.println("Test " + test_number + " failed. ");
		System.out.println(" ");	
	}
	
	public static void test_Get_Category_Count(int test_number)
	{
		Subject testsubject = new Subject();
		
		System.out.println("Test " + test_number + ": testing get_Category_Count() ");
		System.out.println(".....Initializing categories.....");
		//Initialize multiple Categories 
		for(int i = 0; i < 10; i++)
		{
			testsubject.add_Category("Category" + i, 10.0);
		}
		System.out.println(".....Checking number of Categories added to list.....");
		// Check to see if all categories correctly added
		if(testsubject.get_Category_Count() == 10)
			System.out.println("Test " + test_number + " passed. ");
		else
			System.out.println("Test " + test_number + " failed. ");
		System.out.println(" ");
	}
	
	public static void test_Get_Credit_Hours(int test_number)
	{
		Subject testsubject = new Subject();
		
		System.out.println("Test " + test_number + ": testing get_Credit_Hours() ");
		
		System.out.println(".....Setting Credit Hours.....");
		testsubject.set_Credit_Hours(5);
		
		System.out.println(".....Checking Credit Hours.....");
		if(testsubject.get_Credit_Hours() == 5)
			System.out.println("Test " + test_number + " passed. ");
		else
			System.out.println("Test " + test_number + " failed. ");
		System.out.println(" ");
	}
	
	public static void test_Get_Percent_Complete(int test_number)
	{
		Subject testsubject = new Subject();
		
		System.out.println("Test " + test_number + ": testing get_Percent_Complete() ");
		
		System.out.println(".....Initializing Categories.....");
		for(int i = 0; i < 5; i++)
		{
			testsubject.add_Category("Category" + i, 10.0);
		}
		
		System.out.println(".....Checking if Percent Complete is valid.....");
		if(testsubject.get_Percent_Complete() == 50)
			System.out.println("Test " + test_number + " passed. ");
		else
			System.out.println("Test " + test_number + " failed. ");
		System.out.println(" ");
	}
	
	public static void test_Get_Subject_Name(int test_number)
	{
		Subject testsubject = new Subject();
		
		System.out.println("Test " + test_number + ": testing get_Subject_Name() ");
		
		System.out.println(".....Initializing Subject.....");
		testsubject.set_Class_Name("Math");
		
		System.out.println(".....Checking if the name is valid.....");
		if(testsubject.get_Subject_Name() == "Math")
			System.out.println("Test " + test_number + " passed. ");
		else
			System.out.println("Test " + test_number + " failed. ");
		System.out.println(" ");
	}
	
	public static void test_Is_Complete(int test_number)
	{
		Subject testsubject = new Subject();
		boolean isvalid = true;
		
		System.out.println("Test " + test_number + ": testing is_Complete() ");
		
		System.out.println(".....Adding Categories.....");
		for(int i = 0; i < 5; i++)
		{
			testsubject.add_Category("Category" + i, 10.0);
		}
		
		System.out.println(".....Checking for correct False return.....");
		if(testsubject.is_complete() == true)
			isvalid = false;
			
		System.out.println(".....Completing Category Weights.....");
		for(int i = 0; i < 5; i++)
		{
			testsubject.add_Category("Category" + i, 10.0);
		}
		if(testsubject.is_complete() == true && isvalid == true)
			System.out.println("Test " + test_number + " passed. ");
		else
			System.out.println("Test " + test_number + " failed. ");
		System.out.println(" ");
	}
	
	public static void main(String[] args)
	{
		test_Get_Category(1);
		test_Get_Category_Count(2);
		test_Get_Credit_Hours(3);
		test_Get_Percent_Complete(4);
		test_Get_Subject_Name(5);
		test_Is_Complete(6);
	}
}
