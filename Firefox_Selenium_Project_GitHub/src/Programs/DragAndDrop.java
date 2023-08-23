package Programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","C:\\Selenium\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.flipkart.com/");
		
		
		Thread.sleep(4000);
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		Thread.sleep(4000);
		WebElement element = driver.findElement(By.xpath("//input[@name='q']"));
		element.sendKeys("i phone14");
		element.submit();
		Thread.sleep(4000);
		
		WebElement left = driver.findElement(By.xpath("(//div[@class='_3FdLqY'])[1]"));
		WebElement right = driver.findElement(By.xpath("(//div[@class='_3FdLqY'])[2]"));
		Actions act = new Actions(driver);
		Thread.sleep(4000);
		act.dragAndDropBy(left, 40, 0).perform();
		Thread.sleep(4000);
		act.dragAndDropBy(right, -40, 0).perform();
		

	}

}
