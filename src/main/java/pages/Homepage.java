package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.shaft.gui.element.ElementActions;

public class Homepage {
	
	public WebDriver driver;
	//constaructor
	public	Homepage(WebDriver driver)
	{
		this.driver=driver;
	}
	//Locator
	private By register=By.linkText("Register");
	//Actions
	public void userpressregister()
	{
	ElementActions.click(driver, register);	
	}

}
