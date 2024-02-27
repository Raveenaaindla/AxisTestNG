package TestNg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertion {
	
	@Test
	
	public void testassert() throws InterruptedException{
		
		SoftAssert st = new SoftAssert();
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		Thread.sleep(500);
		
		driver.manage().window().maximize();
		
		String actualTitle = driver.getTitle();
		
		String expectedTitle = "Orange";
		
		Thread.sleep(500);
		
		st.assertEquals(actualTitle, expectedTitle);
            
		driver.findElement(By.xpath("//input[@name = 'username']")).sendKeys("Admin");
			
		Thread.sleep(500);
			
		driver.close();	
		
		
	}
}
