package tests;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchTest3 {

	public static String url = "https://cool.club/";

	@Test
	public void browserTest() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(url);
		driver.findElement(By.cssSelector(" a[title=\"About Us\"]")).click();
		System.out.println(driver.findElement(By.cssSelector("img[alt='image icon']")).isDisplayed());
		driver.findElement(By.cssSelector("a[title='Payments']")).click();
		System.out.println(driver.findElement(By.cssSelector("p.sub-title.text-center")).getText());
		driver.findElement(By.cssSelector("a[href*='blog']")).click();
		System.out.println(driver.findElement(By.cssSelector("a[title*='Powerful Hacks']")).getText());
	
		System.out.println(driver.findElement(By.cssSelector("div.entry-meta")).getText());
		
		List<WebElement> elements=	driver.findElements(By.cssSelector("h5.widget-title+ul>li"));

		for(WebElement ele:elements) {
		System.out.println(ele.getText());
		}
	
		Thread.sleep(4500);
		driver.quit();
		
		
	}
}
