package collectionExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class example1 {
public static void main(String[] args) {
	
	
	System.setProperty("WebDriver.chrome.driver", "chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com/");
	WebElement store = driver.findElement(By.xpath("//input[@id='pass']"));
	store.sendKeys("ok");
//	store.getAttribute("value");
	System.out.println(store.getAttribute("value"));
}
}
