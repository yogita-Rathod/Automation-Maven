package food;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LaunchingKFC_Test {

	
	



		
		@Test
		
		public void KFC()
		{
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://online.kfc.co.in/");
		}

		
		
	}

