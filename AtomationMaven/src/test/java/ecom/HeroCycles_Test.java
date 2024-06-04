package ecom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HeroCycles_Test {
	
	
	
	

	@Test
	
	public void herocycles()
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.herocycles.com/");
	}

	
	
}



