package Tests;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;


public class Test1 {

	
	@Test
	public void testHello() throws InterruptedException {
		System.out.println("Hello");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
//		driver.get("https://www.youtube.com/");
//		System.out.println("Driver execution started...");
//		driver.manage().window().maximize();
//		Thread.sleep(10000);
//		assertTrue(driver.findElement(By.xpath("//yt-formatted-string[text()=\"Home\"]")).isDisplayed());
		//assertEquals(4, 4);
	}
}
