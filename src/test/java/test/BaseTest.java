package test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class BaseTest {
private WebDriver driver;
	
	public BaseTest(WebDriver driver){
		this.driver = driver;
	}
   public WebDriver chromeDriverConnection()
   {
	   System.setProperty("webdriver.chrome.driver", ".\\driver\\chromedriver.exe");
       driver = new ChromeDriver();
       return driver;
   }

public WebElement findElement(By locator) {
	return driver.findElement(locator);
}

public List<WebElement> findElements(By locator)
{
return driver.findElements(locator);

}

public String getText(WebElement element) {
	return element.getText();
	
}

public String getText(By locator) {
	return driver.findElement(locator).getText();
}

public void type(String inputText, By locator)
{
driver.findElement(locator).sendKeys(inputText+ Keys.ENTER);	
}

public void click(By locator)
{
driver.findElement(locator).click();	
}

public void MovetoElementClick(By locator)
{
	Actions builder = new Actions(driver);
	WebElement element = driver.findElement(locator);
	builder.moveToElement(element).perform();
    element.click();
}

public void MovetoElement(By locator)
{
	Actions builder = new Actions(driver);
	WebElement element = driver.findElement(locator);
	builder.moveToElement(element).perform();   
}

public Boolean isDisplayed(By locator)
{
try {
	return driver.findElement(locator).isDisplayed();
}catch(org.openqa.selenium.NoSuchElementException e) {
	return false;
}
}

public void visit(String url)
{
	driver.get(url);
}
}
