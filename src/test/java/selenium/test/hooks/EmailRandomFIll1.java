package selenium.test.hooks;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.OutputType;
import java.io.File;
import org.openqa.selenium.support.ui.Select;
import java.io.IOException;
import org.apache.commons.io.FileUtils;




public class EmailRandomFIll1 {
  public static void main (String[] args) throws Exception {

       // Create a new instance of the Firefox driver
       WebDriver driver = new FirefoxDriver();

       // Navigate to Google Homepage
       driver.get("http://zxing.appspot.com/generator/");

      //Choose Listbox
       WebElement element = driver.findElement(By.xpath("//select"));
         element.click();
         Thread.sleep(10);
      // Choose by select
      Select sel= new Select(element);
          sel.selectByVisibleText("Email address");
          Thread.sleep(10);
      //Fill email address
      driver.findElement(By.xpath("//input")).sendKeys("random.random@random.com");
      Thread.sleep(10);
      //click Generate
      WebElement element4 = driver.findElement(By.xpath("//button"));
      element4.click();
      Thread.sleep(10);
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
     Thread.sleep(10);
     //close 
     driver.close();
 }
}