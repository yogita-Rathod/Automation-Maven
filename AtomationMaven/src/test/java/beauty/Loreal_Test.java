package beauty;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Loreal_Test {

	
	

	
		
		@Test
		
		public void loreal()
		{
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.lorealparis.co.in/");
		}

		
		
	}




