package tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.shaft.driver.DriverFactory;
import com.shaft.gui.browser.BrowserActions;
import com.shaft.validation.Validations;
import pages.Homepage;
import pages.Registerpage;


public class Registertest {
	public	WebDriver driver;
	public Homepage Homeobj;
	public	Registerpage Registerobj;
	
@BeforeClass
public void useropenurl()
{
	 driver=DriverFactory.getDriver();
	 BrowserActions.navigateToURL(driver,"https://demo.nopcommerce.com/");
	 Homeobj=new Homepage(driver);
	 Registerobj = new Registerpage(driver);
}

@Test
public void usertest()
{
	 Homeobj.userpressregister();
	 Registerobj.userputdata("Ahmed","Mohamed","jkhljkh@gmail.com","1234566");
	 Validations.verifyThat();

}
	
	
}
