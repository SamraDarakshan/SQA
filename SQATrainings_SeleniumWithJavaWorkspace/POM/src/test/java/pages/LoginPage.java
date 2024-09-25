package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

	WebDriver driver;
	//constructor
	
	public LoginPage(WebDriver driver) {
		this.driver=driver;
	}
	
	//Locators-Objects
	
	By usernamefield=By.name("username");
	By passwordfield=By.name("password");
	By loginbutton=By.tagName("button");
	
	//Actions-Method
	
	public void enterUsername(String username) {
		driver.findElement(usernamefield).sendKeys(username);
	}
	
	public void enterPassword(String password ) {
		driver.findElement(passwordfield).sendKeys(password);
	}
	
	public void clickLogin() {
		driver.findElement(loginbutton).click();
	}
	
	
}
