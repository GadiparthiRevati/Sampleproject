package sample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Sammpleclass {
	@Test
	public void loginfb() {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
	}

}
