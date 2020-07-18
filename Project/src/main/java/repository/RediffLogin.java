package repository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RediffLogin 
{

	WebDriver driver;
	
	public RediffLogin (WebDriver driver)
	{
		this.driver=driver;
	}
	
	//xpath  $x("//input[@id='login1']") or $x("//*[@id='login1']")
	By username = By.xpath(".//input[@id='login1']");
	By password = By.name("passwd");
	By go = By.name("proceed");
	
	public WebElement EmailId()
	{
		return driver.findElement(username);
	}
	
	public WebElement Password()
	{
		return driver.findElement(password);
	}
	
	public WebElement Go()
	{
		return driver.findElement(go);
	}
}
