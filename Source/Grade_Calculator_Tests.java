public class Grade_Calculator_Tests
{
	public static void testAddSubjectName()
	{
		Subject testsubject = new Subject();
		testsubject.set_Class_Name("Math");
		if(testsubject.get_Subject_Name() == "Math")
			System.out.println("Test passed. The correct name was added");
		else
			System.out.println("Test failed. The name was not correctly added");
	}
	
	public static void testAddCategory()
	{
		Subject testsubject = new Subject();
		testsubject.add_Category("Quiz", 20.0);
		if(testsubject.get_Category_Count() == 1 && testsubject.get_Category(0).get_Category_Name() == "Quiz" && testsubject.get_Percent_Complete() == 20.0)
			System.out.println("Test passed. The category count was successfully updated, the category name was updated, and the percent complete was updated");
		else
			System.out.println("Test failed. The category count, name, or weight was not updated");
	}
	
	public static void testSetCreditHours()
	{
		Subject testsubject = new Subject();
		testsubject.set_Credit_Hours(5);
		if(testsubject.get_Credit_Hours() == 5)
			System.out.println("Test passed. The number of Credit Hours was updated correctly");
		else
			System.out.println("Test failed. the number of Credit Hours was not updated correctly");
	}
	
	public static void testCalculateGrade()
	{
		Subject testsubject = new Subject();
		double grade;
		testsubject.add_Category("Quiz", 20);
		testsubject.add_Category("Midterms", 40);
		testsubject.add_Category("Homework", 20);
		testsubject.add_Category("Final", 20);
		
		testsubject.get_Category(0).set_Totals(8.0,10.0);
		testsubject.get_Category(1).set_Totals(180.0, 200.0);
		testsubject.get_Category(2).set_Totals(90.0, 100.0);
		testsubject.get_Category(3).set_Totals(75.0,100.0);
		
		grade = testsubject.Calculate_Grade();
		
		if(grade == 85.0)
			System.out.println("Test passed. The grade was calculated correctly");
		else
			System.out.println("Test failed. The grade was not calculated correctly");
	}
	
	public static void testAddAssignment()
	{
		Subject testsubject = new Subject();
		testsubject.add_Category("Quiz", 20);
		testsubject.get_Category(0).add_Assignment("HW 1", 8.0, 10.0, true);
		if(testsubject.get_Category(0).get_Assignment(0).get_Title() == "HW 1" 
			&& testsubject.get_Category(0).get_Assignment(0).get_Points_Possible() == 10.0
			&& testsubject.get_Category(0).get_Assignment(0).get_Points_Earned() == 8.0 
			&& testsubject.get_Category(0).get_Assignment(0).is_Complete() == true 
			&& testsubject.get_Category(0).get_Assignment_Count() == 1)
			System.out.println("Test passed. All values correctly entered and assignment count updated");
		else
			System.out.println("Test failed. Not all values correctly entered or assignment count updated");
	}
	
	public static void main(String[] args)
	{
		testAddSubjectName();
		testAddCategory();
		testSetCreditHours();
		testCalculateGrade();
		testAddAssignment();
	}
}
