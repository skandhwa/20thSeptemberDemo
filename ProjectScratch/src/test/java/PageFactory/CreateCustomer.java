package PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateCustomer {
	
	public CreateCustomer(WebDriver driver)
	{
		
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//a[@href='addcustomerpage.php']")
	WebElement NewCustomerLink;
	
	
	@FindBy(xpath="//input[@name='name']")
	WebElement CustomerName;
	
	@FindBy(xpath="//input[@value='m']")
	WebElement SelectGender;
	
	@FindBy(xpath="//input[@id='dob']")
	WebElement DateOfBirth;
	
	
	public void clickonNewCustomerLink()
	{
		NewCustomerLink.click();
	}
	
	public void AddCustomerName(String text)
	{
		CustomerName.sendKeys(text);
	}
	
	public void selectGender()
	{
		SelectGender.click();
	}
	
	public void addDateOfBirth(String text)
	{
		DateOfBirth.sendKeys(text);
	}
	
	
	
	
	
	

}
