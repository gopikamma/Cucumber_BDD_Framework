// package stepDefinitions;
//
//import org.junit.Assert;
//import org.openqa.selenium.By;
//import org.openqa.selenium.JavascriptExecutor;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.interactions.Actions;
//
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//
//public class LoginStepDefinition 
//{
//	WebDriver driver;
//	
//	@Given("^User is already on Login Page$")
//	public void User_is_already_on_Login_Page()
//	{
//		
//		driver = new FirefoxDriver();
//				
//		driver.get("https://www.freecrm.com/index.html");
//	}
//	
//	@When("^Title of Login Page is Free CRM$")
//	public void title_of_Login_Page_is_Free_CRM() 
//	{
//		String title = driver.getTitle();
//		System.out.println(title);
//		Assert.assertEquals("Free CRM software in the cloud powers sales and customer service",title);
//	}
//
//	@Then("^User enters \"(.*)\" and \"(.*)\"$")
//	public void user_enters_username_and_password(String username,String password) throws InterruptedException
//	{
//		Thread.sleep(5000);
//		driver.findElement(By.name("username")).sendKeys(username);
//		Thread.sleep(5000);
//		driver.findElement(By.name("password")).sendKeys(password);
//		
//	}
//
//	@Then("^User Clicks on Login Button$")
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
//	@Then("^user moves to new contact page$")
//	public void user_moves_to_new_contact_page() 
//	{
//	   driver.switchTo().frame("mainpanel");
//	   Actions action = new Actions(driver);
//	   action.moveToElement(driver.findElement(By.xpath("//a[contains(text(),'Contacts')]"))).build().perform();
//	   driver.findElement(By.xpath("//a[contains(text(),'New Contact')]")).click();
//	}
//
//	@Then("^user enters \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\"$")
//	public void user_enters_and_and(String firstname, String lastname, String position)
//	{
//		driver.findElement(By.id("first_name")).sendKeys(firstname);
//		 driver.findElement(By.id("surname")).sendKeys(lastname);
//		 driver.findElement(By.id("company_position")).sendKeys(position);
//		 driver.findElement(By.xpath("//input[@type='submit' and @value='Save']")).click();
//	}
//
//	@Then("^Close the browser$")
//	public void close_the_browser() 
//	{
//		driver.quit();
//	}
//
//
//}
