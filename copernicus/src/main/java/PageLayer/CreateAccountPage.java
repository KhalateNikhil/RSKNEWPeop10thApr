package PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import BaseLayer.BaseClass;

public class CreateAccountPage extends BaseClass{
	
	//create OR using @FindBy annotation
	
	@FindBy(name="mail")
	private WebElement email;
	

	@FindBy(name="field_first_name[0][value]")
	private WebElement fname ;


	@FindBy(name="field_surname[0][value]")
	private WebElement lname;


	@FindBy(name="field_country")
	private WebElement country;


	@FindBy(name="field_sector")
	private WebElement sector;


	@FindBy(name="field_reg_behalf_of[value]")
	private WebElement cbox;
	
	@FindBy(name="field_organisation[0][value]")
	private WebElement org;
	
	//initialize OR by using PageFactory.initElements()method in constructor
	
	public CreateAccountPage()
	{
		PageFactory.initElements(driver, this);
	}

	//create associated methods for each and every OR without passing test data
	
	public void createnewuserFunctionality(String Email,String firstname,String lastname,String nation,String Sector,String Organiztion)
	{
		email.sendKeys(Email);
		fname.sendKeys(firstname);
		lname.sendKeys(lastname);
		
	Select sel=new Select(country);
	sel.selectByVisibleText(nation);
	
	Select sel1= new Select(sector);
	sel1.selectByVisibleText(Sector);
	
	cbox.click();
	
	org.sendKeys(Organiztion);
	
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	

}
