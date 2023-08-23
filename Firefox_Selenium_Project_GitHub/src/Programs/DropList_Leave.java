package Programs;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DropList_Leave {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","C:\\Selenium\\geckodriver.exe");
		Thread.sleep(3000);
		FirefoxDriver driver = new FirefoxDriver();
		Thread.sleep(3000);
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin",Keys.TAB,"admin123",Keys.ENTER);
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//a[@class='oxd-main-menu-item'])[3]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//div[text()='-- Select --'])[1]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[text()='CAN - Personal']")).click();
		

	}

}
