package stepDefinitions;

import org.openqa.selenium.WebDriver;

import PageFactory.CreateCustomer;
import PageFactory.LoginPage;
import Utilities.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition extends BaseClass {
	
	WebDriver driver=BaseClass.InitializeDriver();
	LoginPage obj=new LoginPage(driver);
	CreateCustomer obj1=new CreateCustomer(driver);
	
	@Given("User Login into the Application")
	public void user_login_into_the_application() {
		
		System.out.println("Page is Loaded");
	   
	}
	
	@Given("User will Enter the {string}")
	public void user_will_enter_the(String username) 
	{
	    obj.enterUsername(username);
	}

	@Given("User will provide the {string}")
	public void user_will_provide_the(String password) {
		
		obj.enterPassword(password);//obj.enterpassword(vEnavyt)
		obj.Implicitwaitvalue();
		
		
	    
	}

	@When("User will click on submit button")
	public void user_will_click_on_submit_button() {
		
		obj.ClickOnSubmit();
		
	    
	}

	@Then("User will be navigated to home page of the application")
	public void user_will_be_navigated_to_home_page_of_the_application() {
		
		System.out.println("Landed to Home Page");
		obj.takesscreenshot();
		
	   
	}
	
	
	
	@Then("User will click on New Customer link")
	public void user_will_click_on_new_customer_link() {
		
		obj1.clickonNewCustomerLink();  
		
	}

	@Then("User will enter the details on {string}")
	public void user_will_enter_the_details_on(String customername) {
		
		obj1.AddCustomerName(customername);
	   
	}

	@Then("User will also select the gender")
	public void user_will_also_select_the_gender() {
		
		obj1.selectGender();
	   
	}

	@Then("User will add the {string}")
	public void user_will_add_the(String DateOfBirth) {
		
		obj1.addDateOfBirth(DateOfBirth);
		obj.scrolldown();
		
		
	   
	}
	
	
	@Then("User will Click on Edit Customer Link")
	public void user_will_click_on_edit_customer_link() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("User will Enter the corresponding {string}")
	public void user_will_enter_the_corresponding(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("User will click on Submit")
	public void user_will_click_on_submit() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("User will update the field of City")
	public void user_will_update_the_field_of_city() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("User Will again Click on Submit")
	public void user_will_again_click_on_submit() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}




	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
