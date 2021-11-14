package seleniumUtilities;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.google.common.io.Files;

public class SeleniumMethods 
{
	static WebDriver driver;

	public void getDriver()
	{	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\Videos\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	
	public void openUrl(String url)
	{
		driver.get(url);
		maximizeWindow();
	}
	
	public String getCurrentUrl()
	{
		return driver.getCurrentUrl();
	}
	
	public String getPageSource()
	{
		return driver.getPageSource();
	}
	
	public String getTitle()
	{
		return driver.getTitle();
	}
	
	public void fullScreen()
	{
		driver.manage().window().fullscreen();
	}
	
	public Point getWindowPosition()
	{
		return driver.manage().window().getPosition();
		
	}
	
	public Dimension getWindowSize()
	{
		return driver.manage().window().getSize();
	}
	
	public void maximizeWindow()
	{
		driver.manage().window().maximize();		
	}
	
	public void navigateBack()
	{
		driver.navigate().back();
	}
	
	public void navigateForward()
	{
		driver.navigate().forward();
	}
	
	public void refreshPage()
	{
		driver.navigate().refresh();
		
	}
	
	public void naviagteTo(String url)
	{
		driver.navigate().to(url);
	}
	
	public void navigateTo() throws MalformedURLException 
	{
		URL url = new URL("https://www.amazon.in/");
		driver.navigate().to(url);
	}
	
	public void closeBrowser()
	{
		driver.close();
	}
	
	public void quitBrowser()
	{
		driver.quit();
	}
	
	public WebElement findElement(String locatorType, String locator)
	{
		if(locatorType.equalsIgnoreCase("xpath"))
		{
			return driver.findElement(By.xpath(locator));
		}
		
		if(locatorType.equalsIgnoreCase("tagname"))
		{
			return driver.findElement(By.tagName(locator));
		}
		return null;
	}
	
	public List<WebElement> findElements(String locatorType, String locator)
	{
		if(locatorType.equalsIgnoreCase("xpath"))
		{
			return driver.findElements(By.xpath(locator));
		}
		if(locatorType.equalsIgnoreCase("tagname"))
		{
			return driver.findElements(By.tagName(locator));
		}
		return null;
	}
	
	public String getWindowHandle()
	{
		return driver.getWindowHandle();
	}
	
	public Set<String> getWindowHandles()
	{
		return driver.getWindowHandles();
	}
	
	public void windowHandling()
	{		
		String parentHandle = getWindowHandle();
		findElement("xpath", "//button[@id='windowButton']").click();
		findElement("xpath", "//button[@id='windowButton']").click();
		findElement("xpath", "//button[@id='windowButton']").click();
	
		Set<String> windows = getWindowHandles();
		
		for(String window : windows)
		{
			if(!window.equals(parentHandle))
			{
				driver.switchTo().window(window);
				driver.close();
			}
		}
		driver.switchTo().window(parentHandle);
		findElement("xpath", "//button[@id='windowButton']").click();
	}
	
	public void popupHandling()
	{
		Alert alt = driver.switchTo().alert();
		findElement("xpath", "//button[@id='promtButton']").click();
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().sendKeys("Test");
		driver.switchTo().alert().accept();
		//driver.switchTo().alert().dismiss();
	}
	
	public void dropDown()
	{
		Select testing = new Select(findElement("xpath", "//select[@name='dropdown']"));
	
		//System.out.println(testing.getOptions().size());
		
		/*for(WebElement wb : testing.getOptions())
		{
			System.out.println(wb.getText());
		}*/
		
		/*System.out.println(testing.isMultiple());
		
		testing.selectByIndex(2);
		testing.selectByValue("ddmanual");
		testing.selectByVisibleText("Performance Testing");*/
		
		Select multiSelect = new Select(findElement("xpath", "//select[@name='multipleselect[]']"));

		multiSelect.selectByIndex(1);
		multiSelect.selectByIndex(2);
		multiSelect.selectByIndex(3);
		
		/*System.out.println("first selected option "+multiSelect.getFirstSelectedOption().getText());
		
		System.out.println("all selected options");
		for(WebElement wb : multiSelect.getAllSelectedOptions())
		{
			System.out.println(wb.getText());
		}*/
		
		/*multiSelect.deselectByIndex(1);
		multiSelect.deselectByValue("msselenium");
		multiSelect.deselectByVisibleText("Agile Methodology");*/
		
		multiSelect.deselectAll();
	}
	
	public void checkbox() throws InterruptedException 
	{
		Thread.sleep(5000);
		findElement("xpath", "//input[@value='cbselenium']").click();
	}
	
	public void radioButton() throws InterruptedException
	{
		Thread.sleep(5000);
		WebElement wb = findElement("xpath", "//p[text()='Click on button to get the selected value']//following-sibling::label/input[@value='Female']");
	
		System.out.println(wb.isSelected());
		System.out.println(wb.isEnabled());
		System.out.println(wb.isDisplayed());
		wb.click();
		System.out.println(wb.isSelected());
	}
	
	public void frameHandling()
	{
		//single frame
		/*driver.switchTo().frame(1);
		System.out.println(findElement("xpath", "//h1[@id='sampleHeading']").getText());*/
		
		/*driver.switchTo().frame("frame1");
		System.out.println(findElement("xpath", "//h1[@id='sampleHeading']").getText());*/
	
		/*driver.switchTo().frame(findElement("xpath", "//iframe[@id='frame1']"));
		System.out.println(findElement("xpath", "//h1[@id='sampleHeading']").getText());*/
		
		//nested Frames
		System.out.println(findElement("xpath", "//div[@id='framesWrapper']/div[1]").getText());
		driver.switchTo().frame("frame1");
		System.out.println(findElement("xpath", "//body").getText());
	
		//List<WebElement> iframes = findElements("tagname", "iframe");
		driver.switchTo().frame(0);
		System.out.println(findElement("xpath", "//body/p").getText());
		
		driver.switchTo().parentFrame();
		System.out.println(findElement("xpath", "//body").getText());
		
		driver.switchTo().defaultContent();
		System.out.println(findElement("xpath", "//div[@id='framesWrapper']/div[1]").getText());
	}
	
	public void webTableHandling()
	{
		// find table
		WebElement table = findElement("xpath", "//table[@class='dataTable']");
		
		//find rows
		List<WebElement> rows = table.findElements(By.tagName("tr"));
	
		// removing table header row
		rows.remove(0);
		
		//traverse rows
		for(WebElement row : rows)
		{
			//get data list
			List<WebElement> data = row.findElements(By.tagName("td"));
			
			if(data.get(0).getText().contains("UCO Bank"))
			{
				//traverse data list
				for(WebElement text : data)
				{
					System.out.println(text.getText());
				}
			}
		}
	}
	
	public void actionsMethods()
	{
		Actions act = new Actions(driver);
		//act.moveToElement(findElement("xpath", "//input[@id='btnLogin']")).click().build().perform();
		//act.click(findElement("xpath", "//input[@id='btnLogin']")).perform();
		//act.clickAndHold(findElement("xpath", "//input[@id='btnLogin']")).release().build().perform();
		//act.contextClick(findElement("xpath", "//input[@id='btnLogin']")).perform();
		//act.doubleClick(findElement("xpath", "//input[@id='btnLogin']")).perform();
		//act.keyDown(Keys.ALT).keyDown(Keys.CONTROL).keyUp(Keys.ALT).keyUp(Keys.CONTROL).perform();
		//act.moveToElement(findElement("xpath", "//input[@id='btnLogin']")).pause(5).click().build().perform();
		//act.sendKeys(findElement("xpath", "//input[@id='txtPassword']"), "admin123").perform();
	}
	
	public void implicitWait(long waitTime)
	{
		driver.manage().timeouts().implicitlyWait(waitTime, TimeUnit.SECONDS);
	}
	
	public void explicitWait(WebElement element)
	{
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(element));
		
	}
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public void fluentWait()
	{
		Wait fluentWait = new FluentWait(driver)
				.pollingEvery(2, TimeUnit.SECONDS)
				.withTimeout(10, TimeUnit.SECONDS)
				.ignoring(NoSuchElementException.class);
		
		WebElement element = (WebElement) fluentWait.until(new Function<WebDriver, WebElement>(){

			public WebElement apply(WebDriver t) {
				
				return findElement("xpath", "//input[@id='btnLogin']");
			}
			
			}
				);
		element.click();
	}
	
	public void jsClick(WebElement element)
	{
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", element);
	}
	
	public void jsScroll()
	{
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0, 500)");
		
		js.executeScript("window.scrollBy(0, -500)");
	}

	public void takeScreenshot() throws IOException
	{
		 SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");  
		    Date date = new Date();  
		    String today = formatter.format(date).toString();
		    
		    today = today.replace("/", ".").replace(":", ".");
		//10.10.2021 12.23.12
		
		TakesScreenshot sc = (TakesScreenshot)driver;
		File source = sc.getScreenshotAs(OutputType.FILE);
		
		File destination = new File("Screenshots/"+ today +".png");
		
		Files.copy(source, destination);
	}
	
	public static void main(String[] args) throws InterruptedException, IOException 
	{
		SeleniumMethods seleniumMethods = new SeleniumMethods();
		seleniumMethods.getDriver();
		seleniumMethods.openUrl("https://opensource-demo.orangehrmlive.com/");
		//seleniumMethods.openUrl("https://demoqa.com/browser-windows");
		//seleniumMethods.openUrl("https://demoqa.com/alerts");
		//seleniumMethods.openUrl("https://www.softwaretestingmaterial.com/sample-webpage-to-automate/");
		//seleniumMethods.openUrl("https://www.seleniumeasy.com/test/basic-radiobutton-demo.html");
		//seleniumMethods.openUrl("https://demoqa.com/frames");
		//seleniumMethods.openUrl("https://demoqa.com/nestedframes");
		//seleniumMethods.openUrl("http://demo.guru99.com/test/web-table-element.php");
		//seleniumMethods.closeBrowser();
		//seleniumMethods.quitBrowser();
		//System.out.println(seleniumMethods.getCurrentUrl());
		//System.out.println(seleniumMethods.getPageSource());
		//System.out.println(seleniumMethods.getTitle());
		//seleniumMethods.fullScreen();
		//seleniumMethods.getWindowSize();
		/*seleniumMethods.openUrl("https://www.amazon.in/");
		seleniumMethods.navigateBack();
		seleniumMethods.navigateForward();
		seleniumMethods.refreshPage();*/
		//seleniumMethods.naviagteTo("https://www.amazon.in/");
		//seleniumMethods.navigateTo();
		//seleniumMethods.implicitWait(3);
		WebElement userName = seleniumMethods.findElement("xpath", "//input[@id='txtUsername']");
		userName.sendKeys("Admin");
		WebElement password = seleniumMethods.findElement("xpath", "//input[@id='txtPassword']");
		password.sendKeys("admin123");
		//seleniumMethods.explicitWait(seleniumMethods.findElement("xpath", "//input[@id='btnLogin']"));
		//seleniumMethods.fluentWait();
		WebElement loginButton = seleniumMethods.findElement("xpath", "//input[@id='btnLogin']");
		seleniumMethods.jsClick(loginButton);
		//seleniumMethods.jsScroll();
		//loginButton.click();
		/* String currentUrl = seleniumMethods.getCurrentUrl();
		currentUrl.contains("dashboard");*/
		/*
		List<WebElement> ele = seleniumMethods.findElements("xpath", "//form[@id='frmLogin']//input");
		
		System.out.println(ele.size());*/
		
		//seleniumMethods.windowHandling();
		//seleniumMethods.popupHandling();
		//seleniumMethods.dropDown();
		//seleniumMethods.checkbox();
		//seleniumMethods.radioButton();
		//seleniumMethods.frameHandling();
		//seleniumMethods.webTableHandling();
		//seleniumMethods.actionsMethods();
		seleniumMethods.takeScreenshot();
	}

}
