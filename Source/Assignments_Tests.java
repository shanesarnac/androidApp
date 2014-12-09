public class Assignments_Tests {
	public static void test_Get_Points_Earned(int test_number)
	{
		System.out.println("Test " + test_number + ": testing get_Points_Earned() ");
		Assignments testassignment = new Assignments();
		
		System.out.println(".....Initializing Points Earned.....");
		testassignment.set_Points_Earned(89.0);
		
		System.out.println(".....Checking if points earned is correct.....");
		if(testassignment.get_Points_Earned() == 89.0)
			System.out.println("Test " + test_number + " passed. ");
		else
			System.out.println("Test " + test_number + " failed. ");
		System.out.println(" ");
	}
	
	public static void test_Get_Points_Possible(int test_number)
	{
		System.out.println("Test " + test_number + ": testing get_Points_Possible() ");
		Assignments testassignment = new Assignments();
		
		System.out.println(".....Initializing Points Possible.....");
		testassignment.set_Points_Possible(99.0);
		
		System.out.println(".....Checking if points possible is correct.....");
		if(testassignment.get_Points_Possible() == 99.0)
			System.out.println("Test " + test_number + " passed. ");
		else
			System.out.println("Test " + test_number + " failed. ");
		System.out.println(" ");
	}
	
	public static void test_Get_Title(int test_number)
	{
		System.out.println("Test " + test_number + ": testing get_Title() ");
		Assignments testassignment = new Assignments();
		
		System.out.println(".....Initializing Assignment Name.....");
		testassignment.set_Name("HW1");
		
		System.out.println(".....Checking if name is correct.....");
		if(testassignment.get_Title() == "HW1")
			System.out.println("Test " + test_number + " passed. ");
		else
			System.out.println("Test " + test_number + " failed. ");
		System.out.println(" ");
	}
	
	public static void test_Assignment_Is_Complete(int test_number)
	{
		System.out.println("Test " + test_number + ": testing get_is_Complete() ");
		Assignments testassignment = new Assignments();
		boolean isvalid = true;
		
		System.out.println(".....Initializing Assignment.....");
		testassignment.set_Complete(true);
		
		System.out.println(".....Checking if returns if complete.....");
		if(testassignment.is_Complete() == true)
			System.out.println("Test " + test_number + " passed. ");
		else
			System.out.println("Test " + test_number + " failed. ");
		System.out.println(" ");
	}
	
	public static void main(String[] args)
	{
		test_Get_Points_Earned(1);
		test_Get_Points_Possible(2);
		test_Get_Title(3);
		test_Assignment_Is_Complete(4);
	}
}
