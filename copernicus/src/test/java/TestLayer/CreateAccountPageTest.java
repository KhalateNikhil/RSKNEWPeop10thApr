package TestLayer;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import BaseLayer.BaseClass;
import PageLayer.CreateAccountPage;

public class CreateAccountPageTest extends BaseClass{
	private static CreateAccountPage createaccountpage;
	@BeforeTest
	public void setUp()
	{
		BaseClass.initialization();
		
	}
	
	@Test
	public void validateCreateNewUser()
	{
		 createaccountpage= new CreateAccountPage();
		 createaccountpage.createnewuserFunctionality("nk@gmail.com", "Rushi", "Khalate", "India", "Public sector/Governmental", "SoftTech");
		
	}
	
	@AfterTest
	public void teaeDown()
	{
		driver.quit();
	}
	
	
	


}
