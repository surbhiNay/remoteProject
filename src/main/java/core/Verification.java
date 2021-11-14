package core;

import java.io.IOException;

import org.junit.Assert;

import seleniumUtilities.SeleniumMethods;

public class Verification 
{
	SeleniumMethods selenium = new SeleniumMethods();
	
	public void assertTrue(boolean condition) throws IOException
	{
		selenium.takeScreenshot();
		Assert.assertTrue(condition);
	}
	
	public void assertFalse(boolean condition) throws IOException
	{	
		selenium.takeScreenshot();
		Assert.assertFalse(condition);
	}
	
	public void assertEquals(Object expected, Object actual) throws IOException
	{
		selenium.takeScreenshot();
		Assert.assertEquals(expected, actual);
	}
}
