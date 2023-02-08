import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

class TC1001Test {

	@Test
	void TC1001Test() throws Exception
									{
		WebDriver driver = null;

		System.setProperty("webdriver.chrome.driver", "D:\\webdriver\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.get("https://nxtgenaiacademy.com/demo-site/");
		
		driver.findElement(By.id("vfb-5")).sendKeys("Perawich");
		driver.findElement(By.id("vfb-7")).sendKeys("Sirisopon");
		
		
		
		driver.findElement(By.id("vfb-13-address")).sendKeys("99/299");
		driver.findElement(By.id("vfb-13-address-2")).sendKeys("13");
		driver.findElement(By.id("vfb-13-city")).sendKeys("Mueng");
		
		driver.findElement(By.id("vfb-13-zip")).sendKeys("13000");
		

		
		driver.findElement(By.id("vfb-14")).sendKeys("644259039@webmail.npru.ac.th");
		driver.findElement(By.id("vfb-18")).sendKeys("02/08/2023");
		
		driver.findElement(By.id("vfb-19")).sendKeys("0943212862");
		Thread.sleep(5000);
		driver.findElement(By.id("vfb-20-0")).click();
		driver.findElement(By.id("vfb-20-1")).click();
		driver.findElement(By.id("vfb-20-2")).click();
		driver.findElement(By.id("vfb-20-3")).click();
		driver.findElement(By.id("vfb-20-4")).click();
		driver.findElement(By.id("vfb-20-5")).click();
		
		driver.findElement(By.id("vfb-23")).sendKeys("How to Eat");
		
		driver.findElement(By.id("vfb-3")).sendKeys("99");
		
		driver.findElement(By.id("vfb-4")).click();
		

		String result = driver.findElement(By.id("main")).getText();
		
		assertEquals("Registration Form is Successfully Submitted. The Transaction ID : NXTGEN", result);
		
		Thread.sleep(5000);
		driver.quit();
	}

}

