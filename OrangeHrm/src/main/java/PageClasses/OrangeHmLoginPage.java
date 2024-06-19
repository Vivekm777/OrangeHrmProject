package PageClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.PageUtilities;

public class OrangeHmLoginPage {
WebDriver driver;	
@FindBy(name="username")	
WebElement usernamefield;
@FindBy(name="password")
WebElement passwordfield;
@FindBy(xpath="//button[@type='submit']")
WebElement loginbutton;
@FindBy(xpath="//p[@class='oxd-text oxd-text--p orangehrm-login-forgot-header']")
WebElement forgotpasswordlink;
	





public OrangeHmLoginPage(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver,this);
}


public WebElement forgotpasswordlinkbutton() {
	return forgotpasswordlink;
}

public void Login(String usename,String password)
{
	
	//usernamefield.sendKeys(usename);
	//passwordfield.sendKeys(password);
	//loginbutton.click();
	PageUtilities.enterText(usernamefield, usename);
	PageUtilities.enterText(passwordfield, password);
	PageUtilities.clickOnElement(loginbutton);
	
	
	
}



	
	

}
