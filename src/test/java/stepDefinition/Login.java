package stepDefinition;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

import core.PropertyReader;
import core.Verification;
import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import seleniumUtilities.SeleniumMethods;

public class Login 
{
	SeleniumMethods sm = new SeleniumMethods();
	PropertyReader prop = new PropertyReader();
	Verification verify = new Verification();
	
	@Given("^open url$")
	public void open_url() throws Throwable 
	{
		sm.getDriver();
		sm.openUrl(prop.getProperty("url"));
	}

	/*@When("^user enters valid username$")
	public void user_enters_valid_username() throws Throwable 
	{
		WebElement userName = sm.findElement("xpath", "//input[@id='txtUsername']");
		userName.sendKeys("Admin");
	}

	@And("^user enters valid password$")
	public void user_enters_valid_password() throws Throwable 
	{
		WebElement password = sm.findElement("xpath", "//input[@id='txtPassword']");
		password.sendKeys("admin123");  
	}*/

	@And("^click on login button$")
	public void click_on_login_button() throws Throwable 
	{
		WebElement loginButton = sm.findElement("xpath", prop.getProperty("xpath_inputButton"));
		sm.jsClick(loginButton);  
	}

	@Then("^user is logged in successfully$")
	public void user_is_logged_in_successfully() throws Throwable 
	{	
		verify.assertTrue(sm.getCurrentUrl().contains("dashboard"));  
	}
	
	@When("^user enters valid username \"([^\"]*)\"$")
	public void user_enters_valid_username(String param) throws Throwable 
	{
		WebElement userName = sm.findElement("xpath", "//input[@id='txtUsername']");
		userName.sendKeys(param);
	}

	@And("^user enters valid password \"([^\"]*)\"$")
	public void user_enters_valid_password(String param) throws Throwable 
	{
		WebElement password = sm.findElement("xpath", "//input[@id='txtPassword']");
		password.sendKeys(param); 
	}
	
	@When("^user enters valid username$")
	public void user_enters_valid_username(DataTable arg1) throws Throwable 
	{
		List<List<String>> data = arg1.raw();
		
		/*String st = data.get(1).get(0);
		System.out.println("Username " + st);*/
		
		WebElement userName = sm.findElement("xpath", "//input[@id='txtUsername']");
		userName.sendKeys(data.get(1).get(0));
	}

	@When("^user enters valid password$")
	public void user_enters_valid_password(DataTable arg1) throws Throwable 
	{
		List<List<String>> data = arg1.raw();
		
		WebElement password = sm.findElement("xpath", "//input[@id='txtPassword']");
		password.sendKeys(data.get(1).get(0)); 
	}
}
