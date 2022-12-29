package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchTest {

	public static String url = "https://cool.club/";

	@Test
	public void browserTest() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		driver.findElement(By.cssSelector(" a[title=\"About Us\"]")).click();
		System.out.println(driver.findElement(By.cssSelector("img[alt='image icon']")).isDisplayed());
		driver.findElement(By.cssSelector("a[title='Payments']")).click();
		System.out.println(driver.findElement(By.cssSelector("p.sub-title.text-center")).getText());
		driver.findElement(By.cssSelector("a[href*='blog']")).click();
		System.out.println("browserTest passed");
		driver.quit();
	}
}
