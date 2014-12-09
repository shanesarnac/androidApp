public class Categories_Tests {
	public static void test_Get_Assignment(int test_number)
	{
		Categories testcategory = new Categories();
		boolean isvalid = true;
		
		System.out.println("Test " + test_number + ": testing get_Assignment() ");
		
		System.out.println(".....Initializing Assignment.....");
		testcategory.add_Assignment("HW1",70,100,true);
		
		Assignments testassignment = new Assignments();
		testassignment.set_Name("HW1");
		testassignment.set_Points_Earned(70);
		testassignment.set_Points_Possible(100);
		testassignment.set_Complete(true);
		
		System.out.println(".....Checking if Assignment returns correctly.....");
		if(testassignment.get_Title() != testcategory.get_Assignment(0).get_Title())
			isvalid = false;
		if(testassignment.get_Points_Earned() != testcategory.get_Assignment(0).get_Points_Earned())
			isvalid = false;
		if(testassignment.get_Points_Possible() != testcategory.get_Assignment(0).get_Points_Possible())
			isvalid = false;
		if(testassignment.is_Complete() != testcategory.get_Assignment(0).is_Complete())
			isvalid = false;
		
		if(isvalid == true)
			System.out.println("Test " + test_number + " passed. ");
		else
			System.out.println("Test " + test_number + " failed. ");
		System.out.println(" ");
	}
	
	public static void test_Get_Assignment_Count(int test_number)
	{
		Categories testcategory = new Categories();
		
		System.out.println("Test " + test_number + ": testing get_Assignment() ");
		
		System.out.println(".....Initializing Assignments.....");
		for(int i = 0; i < 5; i++)
		{
			testcategory.add_Assignment("HW" + i, 70,100,true);
		}
		
		System.out.println(".....Checking if correct assignment count.....");
		if(testcategory.get_Assignment_Count() == 5)
			System.out.println("Test " + test_number + " passed. ");
		else
			System.out.println("Test " + test_number + " failed. ");
		System.out.println(" ");
	}
	
	public static void test_Get_Category_Name(int test_number)
	{
		Categories testcategory = new Categories();
		
		System.out.println("Test " + test_number + ": testing get_Category_Name() ");
		
		System.out.println(".....Initializing Category Name.....");
		testcategory.set_Category_Type("Quiz");
		
		System.out.println(".....Checking if Category Name is correctly set.....");
		if(testcategory.get_Category_Name() == "Quiz")
			System.out.println("Test " + test_number + " passed. ");
		else
			System.out.println("Test " + test_number + " failed. ");
		System.out.println(" ");
	}
	
	public static void test_Get_Category_Weight(int test_number)
	{
		Categories testcategory = new Categories();
		
		System.out.println("Test " + test_number + ": testing get_Category_Weight() ");
		
		System.out.println(".....Initializing Category Weight.....");
		testcategory.set_Category_Weight(20);
		
		System.out.println(".....Checking if Weight is correct.....");
		if(testcategory.get_Category_Weight() == 20)
			System.out.println("Test " + test_number + " passed. ");
		else
			System.out.println("Test " + test_number + " failed. ");
		System.out.println(" ");
	}
	
	public static void test_Get_Percent_Earned(int test_number)
	{
		Categories testcategory = new Categories();
		
		System.out.println("Test " + test_number + ": testing get_Percent_Earned() ");
		
		System.out.println(".....Initializing Assignments.....");
		for(int i = 0; i < 10; i++)
			testcategory.add_Assignment("HW"+i,75,100,true);
		
		System.out.println(".....Checking for correct percent earned.....");
		if(testcategory.get_Percent_Earned() == 0.75)
			System.out.println("Test " + test_number + " passed. ");
		else
			System.out.println("Test " + test_number + " failed. ");
		System.out.println(" ");
	}
	
	public static void main(String[] args)
	{
		test_Get_Assignment(1);
		test_Get_Assignment_Count(2);
		test_Get_Category_Name(3);
		test_Get_Category_Weight(4);
		test_Get_Percent_Earned(5);
	}
}
