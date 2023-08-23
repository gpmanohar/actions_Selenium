package Programs;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WindowsPopUpHandling {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","C:\\Selenium\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		WebElement element = driver.findElement(By.xpath("//input[@name='q']"));
		element.sendKeys("iphone14");
		element.submit();
		driver.findElement(By.xpath("(//div[@class='_4rR01T'])[1]")).click();
		
	
		String parentid = driver.getWindowHandle();
		Set<String> allchilds = driver.getWindowHandles();
		
		for(String all : allchilds)
		{
			if(!all.equals(parentid))
			{
				driver.switchTo().window(all);
			}
		}
	
		String Pname = driver.findElement(By.xpath("//span[@class='B_NuCI']")).getText();
		System.out.println(Pname);
		

	}

}
