package qaTest;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.*;

import org.openqa.selenium.firefox.FirefoxDriver;

public class TestExample {
	private static WebDriver driver;
public static void main(String[] args) {
	String driverPath = "/Users/dvitalii/Desktop/geckodriver";
	System.setProperty("webdriver.gecko.driver", driverPath);
	
	driver = new FirefoxDriver();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); driver.navigate().to("http://www.google.com");
	driver.manage().window().maximize(); driver.findElement(By.xpath(".//*[@id='menu']/div[3]/a")).click(); driver.findElement(By.xpath(".//*[@id='menu']/div[4]/div[3]/a")).click(); driver.findElement(By.id("cpar1")).sendKeys("testing"); driver.findElement(By.xpath(".//*[@id='content']/table/tbody/tr/td[2]/input")).click();
			//String result = driver.findElement(By.xpath(".//*[@id='content']/p[2]/span/font/b")).getText(); System.out.println(" The Result is " + result);
			driver.close();
	}
}
