//package stepDefinitions;
//
//import java.util.List;
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
//public class DealStepDefinitions
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
//		Thread.sleep(5000);
//		List<List<String>> data = credentials.raw();
//		driver.findElement(By.name("username")).sendKeys(data.get(0).get(0));
//		Thread.sleep(5000);
//		driver.findElement(By.name("password")).sendKeys(data.get(0).get(1));
//		
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
//	public void user_enters_deal_details(DataTable dealData) 
//	{
//		List<List<String>> dealValues =  dealData.raw();
//		 driver.findElement(By.id("title")).sendKeys(dealValues.get(0).get(0));
//		 driver.findElement(By.id("amount")).sendKeys(dealValues.get(0).get(1));
//		 driver.findElement(By.id("probability")).sendKeys(dealValues.get(0).get(2));
//		 driver.findElement(By.id("commission")).sendKeys(dealValues.get(0).get(3));
//	}
//
//	@Then("^Close the browser$")
//	public void close_the_browser() 
//	{
//		driver.quit();
//	}
//
//
//
//}
