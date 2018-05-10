package stepDefinitions;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Hooks_stepDefinitions
{
	@Before
	public void setUP()
	{
		System.out.println("Launch FF");
		System.out.println("Enter Url for FREECRM Application");
	}
	
	@After
	public void tearDown()
	{
		System.out.println("Close The Browser");
	}
	
	@Given("^user is on deal page$")
	public void user_is_on_deal_page() 
	{
	    System.out.println("user is on deal page");
	}

	@When("^user fills the deals form$")
	public void user_fills_the_deals_form()
	{
	  System.out.println("user fills the details");
	}

	@Then("^deal is created$")
	public void deal_is_created() 
	{
	   System.out.println("deal is created");
	}

	@Given("^user is on contact page$")
	public void user_is_on_contact_page() 
	{
		System.out.println("user is on contact page");
	}

	@When("^user fills the contact form$")
	public void user_fills_the_contact_form() 
	{
		System.out.println("user fills the contact form");
	}

	@Then("^contact is created$")
	public void contact_is_created() 
	{
		System.out.println("Contact is created");
	}


}
