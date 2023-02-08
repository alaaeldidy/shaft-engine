package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.shaft.gui.element.ElementActions;

public class Registerpage {
	
	public WebDriver driver;
	
	public	Registerpage(WebDriver driver)
	{
		this.driver=driver;
	}
	//locators
	private By gender=By.id("gender-female");
	private By firstname=By.id("FirstName");
	private By lastname=By.id("LastName");
	private By email=By.id("Email");
	private By password=By.id("Password");
	private By confpassword=By.id("ConfirmPassword");
	private By submit=By.id("register-button");

	//actions
	public void userputdata(String fn,String ln,String mail,String pass)
	{
		new ElementActions (driver)
		.click(gender)
		.type(firstname,fn)
		.type(lastname,ln)
		.type(email,mail)
		.type(password,pass)
		.type(confpassword,pass)
		.click(submit);
		
	}
	
	
	
	

}
