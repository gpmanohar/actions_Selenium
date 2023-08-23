package Programs;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Dropdown_Sqa {

	public static void main(String[] args) {
		
			System.setProperty("webdriver.gecko.driver","C:\\Selenium\\geckodriver.exe");
			
			FirefoxDriver driver = new FirefoxDriver();
			driver.get("https://www.globalsqa.com/demo-site/select-dropdown-menu/");
			
	}

}
