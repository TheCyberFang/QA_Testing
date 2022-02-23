package testing;

import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class CPF_testNg15 {
	@BeforeTest
	public void beforeAnyTests() {
		System.setProperty("webdriver.chrome.driver", // key or property
				"C:\\Selenium\\chromedriver.exe");

	}

	@Test(priority=1)
	public void cpf15() {
		WebDriver driver = new ChromeDriver();

		driver.get("http://localhost:8081/signin");
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(100, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@id='uname']")).sendKeys("Tester1");
		driver.findElement(By.xpath("//input[@id='pwd']")).sendKeys("Tester@0");
		driver.findElement(By.xpath("//strong[contains(text(),'Sign In')]")).click();
		driver.get("http://localhost:8081");
		driver.findElement(By.xpath("//a[contains(text(),'Log Out')]")).click();
		driver.close();
	}
	

}
