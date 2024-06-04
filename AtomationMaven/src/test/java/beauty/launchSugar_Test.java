package beauty;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class launchSugar_Test {
	
		
		@Test
		
		public void Sugar()
		{
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://in.sugarcosmetics.com/");
		}

		
		
	}


