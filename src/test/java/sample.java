import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class sample
{
	/*BeforeClass
	Before
	Test
	After
	AfterClass*/

	@BeforeClass
	public static void beforeClass_()
	{
		System.out.println("before class");
	}
	
	@AfterClass
	public static void afterClass_()
	{
		System.out.println("after class");
	}
	
	@Before
	public void before()
	{
		System.out.println("Before");
	}
	
	@After
	public void after()
	{
		System.out.println("After");
	}
	
	@Test
	public void test1()
	{
		System.out.println("Test 1");
	}
	
	@Test
	public void test2()
	{
		System.out.println("Test 2");
	}
	
	@Test
	public void test3()
	{
		System.out.println("Test 3");
	}
	
	@Test
	public void test4()
	{
		System.out.println("Test 4");
	}
}
