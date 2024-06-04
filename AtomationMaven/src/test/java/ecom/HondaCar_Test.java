package ecom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HondaCar_Test {

	
	

		
		@Test
		
		public void HondaCar()
		{
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.hondacarindia.com/");
		}

		
		
	}

