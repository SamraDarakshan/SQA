package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
	
	WebDriver driver;
	//constructor
	
	public HomePage(WebDriver driver) {
		this.driver=driver;
	}
	
	//Locators-Objects
	
	By linkcap=By.linkText("OrangeHRM, Inc");
	
	//Actions-Method
	public String getlinkheading() {
		String head=driver.findElement(linkcap).getText();
		return head;
	}
	
}
