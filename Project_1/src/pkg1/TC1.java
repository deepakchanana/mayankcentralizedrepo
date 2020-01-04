package pkg1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC1 
{
  public static void main(String[] args)
  {
	System.setProperty("webdriver.chrome.driver","");
	ChromeDriver driver=new ChromeDriver();
	driver.get("");
	driver.manage().window().maximize();
	WebElement login=driver.findElement(By.id("werg"));
	if(login.isSelected())
	{
		
	}
	
	
  }	
	

}
