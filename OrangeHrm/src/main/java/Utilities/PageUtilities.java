package Utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class PageUtilities {

public static void clickOnElement(WebElement element)
{
	
	element.click();
}
public static void enterText(WebElement element,String value)
{
	
	
	element.sendKeys(value);
}

public static String getElementText(WebElement element)
{
	
	return(element.getText());
		}

public static void clearText(WebElement element)
{
	
	element.clear();
	
}

public static void navigateToBack(WebDriver driver)
{
	driver.navigate().back();
	
}

public static String getAttributeValue(WebElement element,String attribute)
{
	return(element.getAttribute(attribute));
	
}

public static void moveToWebElement(WebElement element,WebDriver driver)
{
	Actions actions=new Actions(driver);
	actions.moveToElement(element).build().perform();
	
	
}
public static void doubleClickWebElement(WebElement element,WebDriver driver)
{
Actions actions=new Actions(driver);
actions.doubleClick().build().perform();
	
}

public static boolean WebElementTextIsDisplayed(WebElement element)
{
	return(element.isDisplayed());
	
}

}
