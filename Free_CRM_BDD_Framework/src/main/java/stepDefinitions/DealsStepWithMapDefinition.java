//package stepDefinitions;
//
//import java.util.List;
//import java.util.Map;
//
//import org.junit.Assert;
//import org.openqa.selenium.By;
//import org.openqa.selenium.JavascriptExecutor;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.interactions.Actions;
//
//import cucumber.api.DataTable;
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//
//public class DealsStepWithMapDefinition
//{
//WebDriver driver;
//	
//	@Given("^user is already on Login Page$")
//	public void User_is_already_on_Login_Page()
//	{
//		
//		driver = new FirefoxDriver();
//				
//		driver.get("https://www.freecrm.com/index.html");
//	}
//	
//	@When("^title of login page is Free CRM$")
//	public void title_of_Login_Page_is_Free_CRM() 
//	{
//		String title = driver.getTitle();
//		System.out.println(title);
//		Assert.assertEquals("Free CRM software in the cloud powers sales and customer service",title);
//	}
//
//	@Then("^user enters username and password$")
//	public void user_enters_username_and_password(DataTable credentials) throws InterruptedException
//	{
//		for (Map<String, String> data : credentials.asMaps(String.class, String.class))
//		{
//						driver.findElement(By.name("username")).sendKeys(data.get("username"));
//						driver.findElement(By.name("password")).sendKeys(data.get("password"));
//		}
//	}
//	
//	@Then("^user clicks on login button$")
//	public void user_Clicks_on_Login_Button() 
//	{
//		WebElement loginBtn = driver.findElement(By.xpath("//input[@type='submit']"));
//		JavascriptExecutor js = (JavascriptExecutor)driver;
//		js.executeScript("arguments[0].click();", loginBtn);
//	}
//
//	@Then("^user is on home page$")
//	public void user_is_on_home_page() throws InterruptedException
//	{
//		String logintitle = driver.getTitle();
//		 System.out.println("Home Page title ::"+ logintitle);
//		 Thread.sleep(5000);
//		Assert.assertEquals(logintitle,"CRMPRO");
//		 Thread.sleep(5000);
//	}
//
//	@Then("^user moves to new deal page$")
//	public void user_moves_to_new_deal_page()
//	{
//		driver.switchTo().frame("mainpanel");
//		Actions action = new Actions(driver);
//		action.moveToElement(driver.findElement(By.xpath("//a[contains(text(),'Deals')]"))).build().perform();
//	driver.findElement(By.xpath("//a[contains(text(),'New Deal')]")).click();
//		
//	}
//
//	@Then("^user enters deal details$")
//	public void user_enters_deal_details(DataTable dealData) throws InterruptedException 
//	{
//		for (Map<String, String> data : dealData.asMaps(String.class, String.class))
//		{
//			
//						driver.findElement(By.id("title")).sendKeys(data.get("title"));
//						driver.findElement(By.id("amount")).sendKeys(data.get("amount"));
//						driver.findElement(By.id("probability")).sendKeys(data.get("probability"));
//						driver.findElement(By.id("commission")).sendKeys(data.get("commission"));
//						
//						driver.findElement(By.xpath("//input[@type='submit' and @value='Save']")).click(); //save button
//						Thread.sleep(5000);
//						//move to new deal page:
//						Actions action = new Actions(driver);
//						action.moveToElement(driver.findElement(By.xpath("//a[contains(text(),'Deals')]"))).build().perform();
//						driver.findElement(By.xpath("//a[contains(text(),'New Deal')]")).click();
//						Thread.sleep(5000);
//			
//		}
//			
//	}
//
//	@Then("^Close the browser$")
//	public void close_the_browser() 
//	{
//		driver.quit();
//	}
//
//}
