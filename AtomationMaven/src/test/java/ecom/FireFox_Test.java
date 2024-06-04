package ecom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FireFox_Test {

	
	
	
	@Test
	
	public void Firefox()
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.firefoxbikes.com/");
	}

	
	
}


