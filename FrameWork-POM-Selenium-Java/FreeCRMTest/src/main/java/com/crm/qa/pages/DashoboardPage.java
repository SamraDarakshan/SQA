package com.crm.qa.pages;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class DashoboardPage extends TestBase {
	//@FindBy(xpath="//p[contains(text(),'Forgot your password?')]")
	
	@FindBy(xpath="//p[contains (text(),'Jyotsna Bharti')]")
	WebElement userLabel;
	
	@FindBy(xpath="//a[text()='About']")
	//@FindBy(linkText=("About"))
	WebElement aboutClick;
	
	
	@FindBy(xpath="//span[text()='Admin']")
	WebElement adminClick;

	@FindBy(xpath="//button[@title='Leave List']")
	WebElement leaveList;
	//button[@type='button' and @title='Leave List']
	//button[@title='Leave List']
	
	//Initializing the Page Objects
	public DashoboardPage() {
		PageFactory.initElements(driver, this);
	}
	
	//Actions
		public String verifyDashboardPageTitle() {
			return driver.getTitle();
		}
		
		public boolean varifyeUserLabel() {
			return userLabel.isDisplayed();
		}
		
		public void clickAbout() {
			aboutClick.click();
			
			String title = driver.getTitle();
			System.out.println(title);
			
			Set <String> handle = driver.getWindowHandles();
			Iterator<String> it = handle.iterator();
			String parentWindowid = it.next();
			System.out.println("Parent Windows id is"+parentWindowid);
			String childWindowid = it.next();
			System.out.println("Child Windows id is"+childWindowid);
			
			driver.switchTo().window(childWindowid);
			
			

			
			//driver.switchTo().alert().dismiss();
			//return new AboutPage();
		}
		
		public AdminPage clickAdmin() {
			adminClick.click();
			return new AdminPage();
		}
		public LeavePage clickLeaveList() {
			leaveList.click();
			return new LeavePage();
		}
}
