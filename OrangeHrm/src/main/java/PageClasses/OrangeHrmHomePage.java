package PageClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class OrangeHrmHomePage {
	WebDriver driver;
	By searchtab=By.xpath("//input[@placeholder='Search']");
	By Admintab=By.xpath("//span[text()='Admin']");
	By PimTab=By.xpath("//span[text()='PIM']");
	By LeaveTab=By.xpath("//span[text()='Leave']");
	By TimeTab=By.xpath("//span[text()='Time']");
	By RecruitmentTab=By.xpath("//span[text()='Recruitment']");
	By MyInfoTab=By.xpath("//span[text()='My Info']");
	
	
	
	
	
	
	public OrangeHrmHomePage(WebDriver driver) {
		// TODO Auto-generated constructor stub
	this.driver=driver;
	
	}

    
	








	public WebElement SearchTabOption()
	{
		
		return(driver.findElement(searchtab));
	}
	public WebElement AdminTabOption()
	{
		
		return(driver.findElement(Admintab));
		
		
	}
	
	public WebElement PimTabTabOption()
	{
		
		return(driver.findElement(PimTab));
		
	}
	
	public boolean LeaveTabOptionVerification()
	{
	 return(driver.findElement(LeaveTab)).isDisplayed();
	}
	public WebElement TimeTabOptionVerification()
	{
		
		return(driver.findElement(TimeTab));
	}
	public boolean recruitmentTabVerification()
	{
		
		return(driver.findElement(RecruitmentTab)).isDisplayed();
	}
	public WebElement MyInfoTabVerification()
	{
		
		
		return(driver.findElement(MyInfoTab));
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
