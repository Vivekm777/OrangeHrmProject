package Utilities;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitUtility {
public static final long Explicit_Wait=5;	
	
public static void WaitForElementToBeClickable(WebDriver driver,WebElement target)	
{
	WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(Explicit_Wait));
	wait.until(ExpectedConditions.elementToBeClickable(target));
	
	
}
	
public static void WaitForTextToBePresent(WebDriver driver,WebElement target,String text)
{
	WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(Explicit_Wait));
	wait.until(ExpectedConditions.textToBePresentInElement(target, text));
	
	
	}

public static void waitForAnElementToBeVisible(WebDriver driver,WebElement target)
{
WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(Explicit_Wait));
wait.until(ExpectedConditions.visibilityOf(target));
	
}

public static void waitForAnAlert(WebDriver driver)
{
WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(Explicit_Wait));
wait.until(ExpectedConditions.alertIsPresent());
	
}

}
