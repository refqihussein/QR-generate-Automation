package selenium.test.hooks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebElement;
import java.io.IOException;
import org.openqa.selenium.By;


public class Decodeqr1 {
    public static void main(String[] args) throws IOException, InterruptedException {

       // Create a new instance of the Chrome Driver
       WebDriver driver = new FirefoxDriver();
 
       // Navigate to Google Homepage
       driver.get("https://m28dev.github.io/qrdecoder/ ");
      
       //Choose Click CHoose file
       WebElement element = driver.findElement(By.id("qrcode"));
         element.sendKeys("/Users/refqihussein/Desktop/qr.png");
         Thread.sleep(2000, 0);
      //submit
      WebElement element2 = driver.findElement(By.xpath("//button[contains(.,'Submit')]"));
      element2.click();
      Thread.sleep(2000);
      // Close the browser
      Thread.sleep(10000);
      // driver.close();
    }
 }