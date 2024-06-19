package PageClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class OrangeHrmAdminPage {
	
	WebDriver driver;
	By SystemUserWebElement=By.xpath("//h5[text()='System Users']");
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public OrangeHrmAdminPage(WebDriver driver) {

	this.driver=driver;
	}
















	public boolean SystemUsersWebElementVerification()
	{
		
		
		return(driver.findElement(SystemUserWebElement)).isDisplayed();
		
	}

}
