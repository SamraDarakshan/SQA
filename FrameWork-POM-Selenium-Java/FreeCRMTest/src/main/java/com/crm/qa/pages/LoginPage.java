package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class LoginPage extends TestBase {

	//Page Factory - (OR) Object repository 
	//basic syntax for csss selector
	@FindBy(css="input[name='username']")
//	@FindBy(name="username")
	WebElement username;
	
	@FindBy(name="password")
	WebElement password;
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement loginBtn;
	
	//@FindBy(xpath="//p[contains(text(),'Forgot your password?')]")
	@FindBy(xpath="//p[text()='Forgot your password?']")
	WebElement ForgetPasswrdLink;
	
	//@FindBy(tagName="img")
	//@FindBy(xpath="//*[@id="app"]/div[1]/div/div[1]/div/div[1]/img")
	//@FindBy(cssSelector="#app > div.orangehrm-login-layout > div > div.orangehrm-login-container > div > div.orangehrm-login-branding > img")
	//@FindBy(xpath="//img[contains(@src,'https://opensource-demo.orangehrmlive.com/web/images/ohrm_branding.png?v=1689053487449')]")
//	@FindBy(xpath="//img[contains(@class,'classname')]")
	
	
	//@FindBy(xpath="//img[@src='/web/images/ohrm_branding.png?v=1689053487449']")
	//@FindBy(css="img[src='/web/images/ohrm_branding.png?v=1689053487449']")
	//@FindBy(css="img[src='/web/images/ohrm_branding.png?v=1689053487449']")
	//@FindBy(css="img[alt='company-branding']")
	
	//xpath
	//@FindBy(xpath="//img[@alt='company-branding']")
	
	//bsic cssselector
	@FindBy(css="img[alt='company-branding']")
	
	//by id
	//img#idvalue
	
	//by class
	//img.classvalue
	
	WebElement hrmLogo;
	
	
	@FindBy(css="div.oxd-alert.oxd-alert--error")
	//@FindBy(xpath="//div[contains(@class, 'oxd-alert') and contains(@class, 'oxd-alert--error')]")
	//div[contains(@class, 'oxd-alert') and contains(@class, 'oxd-alert--error')]

	//@FindBy(xpath="//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/div/div[1]/div[1]/p")
	WebElement errorMsg;
	//Initializing the Page Objects
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	//Actions
	public String validateLoginPageTitle() {
		return driver.getTitle();
	}
	
	public boolean validateHRMImage() {
		return hrmLogo.isDisplayed();
	}
	
	public DashoboardPage login(String un, String pwd) {
		username.sendKeys(un);
		password.sendKeys(pwd);
		loginBtn.click();
		
		return new DashoboardPage();
	}
	
	public LoginPage invalidlogin(String un, String pwd) {
		username.sendKeys(un);
		password.sendKeys(pwd);
		loginBtn.click();
		
		return new LoginPage();
	}
	
	public String actualErrorMessageWithAttribute() {
		return errorMsg.getAttribute("innerHTML");
	}
	public String actualErrorMessage() {
		return errorMsg.getText();
	}
	public String expectedErrorMessage(String error) {
	    return error;
	}
}
