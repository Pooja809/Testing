package repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class LoginApp 
{
	@Test
	public void login()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Java\\software_testing\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); 
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		 RediffLogin rd =  new RediffLogin(driver); 
		 rd.EmailId().sendKeys("Hello");
		 rd.Password().sendKeys("Hello");
		 rd.Go().click();
		 
	}
	
}
