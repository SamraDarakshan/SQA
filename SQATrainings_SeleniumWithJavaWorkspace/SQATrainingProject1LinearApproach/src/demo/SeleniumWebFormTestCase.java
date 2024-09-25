package demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SeleniumWebFormTestCase {

	public SeleniumWebFormTestCase() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws InterruptedException, SQLException {
		// TODO Auto-generated method stub
		//Handling Elements
		System.setProperty("webdriver.chrome.driver", "D:\\Personal\\Automation-Prac\\SQA_Trainings_SeleniumJava\\SQATrainings_Softwares\\Browser\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.selenium.dev/selenium/web/web-form.html");
		
		driver.manage().window().maximize();
		//Read the title
		System.out.println("Tittle of page:"+ driver.getTitle());
		Thread.sleep(5000);
		
		//TextBox can be
		//-Enter Value
		//Clear
		//Enable
		//Display
		//Storing object reference
		WebElement textbox= driver.findElement(By.xpath("//input[@id='my-text-id']"));
		textbox.clear();
		textbox.sendKeys("FAST UNIVERSITY");
		System.out.println("Text Input is Enable "+ textbox.isEnabled());
		System.out.println("Text Input is Enable "+ textbox.isDisplayed());;
		driver.navigate().back();
		driver.navigate().forward();
		
		//check box multipple selection hoskta h
		// one time click again click uncheck
		
		//for deelected of 
//		WebElement checkbox1 = driver.findElement(By.id("my-check-1"));
//        // Check if the checkbox is selected
//        if (checkbox1.isSelected()) {
//            // Uncheck the checkbox by clicking it
//            checkbox1.click();
//            System.out.println("Checkbox is unchecked.");
//        } else {
//            System.out.println("Checkbox is already unchecked.");
//        }
//        
//        
//        // to select one checkbox
//        
//        WebElement checkbox2 = driver.findElement(By.id("my-check-2"));
//        boolean selected1= checkbox1.isSelected();
//        System.out.println("Default checkbox button is " + selected1);
//        checkbox1.click();
//        boolean selected2= checkbox2.isSelected();
//        System.out.println("Default checkbox button is " + selected2);
//        
        
        List<WebElement> checkboxes = driver.findElements(By.cssSelector("input[type='checkbox']"));

        // Iterate over the list of checkboxes and interact with them
        for (WebElement checkbox : checkboxes) {
            boolean isSelected = checkbox.isSelected();
            System.out.println("Checkbox is selected: " + isSelected);

            if (!isSelected) {
                checkbox.click(); // Click to select if not already selected
                System.out.println("Checkbox has been selected.");
            } else {
                System.out.println("Checkbox is already selected.");
            }
        }

        // Optionally verify states again or perform additional assertions
        for (WebElement checkbox : checkboxes) {
            boolean isSelected = checkbox.isSelected();
            System.out.println("Checkbox state after interaction: " + isSelected);
        }


		//radio only one select
		// only one time select we cant unselect we can select any other one 
		
		//Radiobox
		//checked/selected
		//uncheck
		//enable
		//display
		
		WebElement radiobtn= driver.findElement(By.xpath("//input[@id='my-radio-2']"));
		//Selected
		boolean selected=radiobtn.isSelected();
		System.out.println("Default radio button is " + selected);
		radiobtn.click();
		boolean selectedd=radiobtn.isSelected();
	    System.out.println("Default checkbox button is " + selectedd);
	    
	    
	    //for dropdown we will use Select Class
	   // SelectByIndex
	   // SelectByValue
	   // SelectByVisibleText
	    //we need to create object to use the select class
	    //wehen ever error in right side constructor mein kch pass honi h
	    Select obj = new Select(driver.findElement(By.name("my-select")));
	    //obj.selectByVisibleText("Two");
	    Thread.sleep(3000);
	    //obj.deselectByIndex(2);
	    //obj.selectByIndex(1);
	    obj.selectByValue("3");
	    
	 // Locate the date input field
	    WebElement dateField = driver.findElement(By.name("my-date"));

	    // Clear any pre-filled value
	    dateField.clear();

	    // Enter the desired date (format might vary based on the date picker)
	    dateField.sendKeys("09/07/2024");
	  //  driver.navigate().refresh();
	 // Locate the color input field
	    WebElement colorPicker = driver.findElement(By.name("my-colors"));

	    // Clear the field if necessary and input the desired color value
	    colorPicker.clear();
	    colorPicker.sendKeys("#ff5733"); // Example hex color code
	    
        // Locate the file input element (e.g., <input type="file" id="fileInput">)
        WebElement fileInput = driver.findElement(By.cssSelector
        		("input[name='my-file'] ")); // Replace with the actual ID or locator of the file input

        // Provide the absolute path of the file to be uploaded // provide forward slash
        String filePath = "D:/APIPostmanProject-SamraDarakshan/data.csv"; // Replace with the actual path to your file

        // Upload the file by sending the file path to the input element
        fileInput.sendKeys(filePath);

        System.out.println("File uploaded successfully.");
       // input[name='my-file'] cssSelector
        
        //input[@name='my-file'] xpath
     
        //switch to 
  //      driver.switchTo().frame("iframe_a");
        //findelement which is in the frame
        
        //for outside to the frame
 //       driver.switchTo().defaultContent();
        
        //read data 
        
        
        //screenshot
        
        
        //db connection
//       Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo", "root", "root");
//        
//        if(connection.isClosed()) {
//        	System.out.println("We ar enot connected to dataase");
//        }
//        else {
//        	System.out.println("We have succesfully connected to the database");
//        }
//      Statement statement = connection.createStatement();
//      ResultSet resultSet = statement.executeQuery("select * from employees where id=3;");
//      
//      while(resultSet.next()) {
//    	  final int  myid = resultSet.getInt("id");
//    	  System.out.println(resultSet.getInt("id"));
//    	  System.out.println(resultSet.getString("name"));
//    	  System.out.println(resultSet.getString("place"));
////add mysqljava in mvn pom.xml
//      }
//      //Assertions
//      if(myid==3) {
//    	  System.out.println("Test Case passed");
//
//      }
//      else {
//    	  System.out.println("Test Case failed");
//
//      }
      
   // Static variable to hold the value of ID
      
          // Initialize database connection
          int myid = -1;
          try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/yourdb", "user", "password");
               Statement statement = connection.createStatement()) {
              
              // Execute query
              ResultSet resultSet = statement.executeQuery("select * from employees where id=3;");

              // Process results
              //db fields
              while (resultSet.next()) {
                  myid = resultSet.getInt("id");
                  System.out.println("ID: " + myid);
                  System.out.println("Name: " + resultSet.getString("name"));
                  System.out.println("Place: " + resultSet.getString("place"));
              }

              // Assertions or further processing
              if (myid == 3) {
                  System.out.println("Test Case passed");
              } else {
                  System.out.println("Test Case failed");
              }

          } catch (Exception e) {
              e.printStackTrace();
          }
	}

}
