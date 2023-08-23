package Programs;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Popup_Alert {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","C:\\Selenium\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		Thread.sleep(3000);
		driver.get("https://demo.actitime.com/login.do");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("admin", Keys.TAB, "manager", Keys.ENTER);
		Thread.sleep(9000);
		driver.findElement(By.xpath("(//div[@class='menu_icon'])[2]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()='Types of Work']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='Create Type of Work']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='name']")).sendKeys("Manohar");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@value='      Cancel      ']")).click();
		Thread.sleep(3000);
		Alert alt = driver.switchTo().alert();
		String msg = alt.getText();
		System.out.println(msg);
		//alt.accept();
		alt.dismiss();
		
	    
		
		
	
		

	}

}
