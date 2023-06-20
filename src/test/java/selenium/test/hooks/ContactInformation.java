package selenium.test.hooks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.OutputType;
import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;

public class ContactInformation {
  public static void main (String[] args) throws Exception {

       // Create a new instance of the Firefox driver
       WebDriver driver = new FirefoxDriver();

       // Navigate to Google Homepage
       driver.get("http://zxing.appspot.com/generator/");

      
      //Fill Name
      driver.findElement(By.xpath("//input")).sendKeys("John Doe");
      Thread.sleep(3000);
       //Fill Company
       driver.findElement(By.xpath("//tr[2]/td[2]/input")).sendKeys("Example");
       Thread.sleep(3000);
        //Fill Title
      driver.findElement(By.xpath("//tr[3]/td[2]/input")).sendKeys("Test Automation");
      Thread.sleep(3000);
       //Fill Phonenumber
       driver.findElement(By.xpath("//tr[4]/td[2]/input")).sendKeys("628123456789");
       Thread.sleep(3000);
        //Fill Email
      driver.findElement(By.xpath("//tr[5]/td[2]/input")).sendKeys("Random@email.com");
      Thread.sleep(3000);
       //Fill Adress
       driver.findElement(By.xpath("//tr[6]/td[2]/input")).sendKeys("Adress1");
       Thread.sleep(3000);
        //Fill Adress2
      driver.findElement(By.xpath("//tr[7]/td[2]/input")).sendKeys("Adress2");
      Thread.sleep(3000);
       //Fill Website
       driver.findElement(By.xpath("//tr[8]/td[2]/input")).sendKeys("www.example.com");
       Thread.sleep(3000);
        //Fill Memo
      driver.findElement(By.xpath("//tr[9]/td[2]/input")).sendKeys("Memo");
      Thread.sleep(3000);
      //click Generate
      WebElement element4 = driver.findElement(By.xpath("//button"));
      element4.click();
      //save QR
      WebElement QR = driver.findElement(By.xpath("//a"));
      QR.click();
       //call function 
       File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
       try {
         FileUtils.copyFile(screenshot, new File("/Users/refqihussein/Desktop/qr.png"));
     } catch (IOException e) {
         System.out.println(e.getMessage());
     }
     Thread.sleep(5000);
     //close 
     driver.close();
 }
}