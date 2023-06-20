package selenium.test.steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.And;

public class decoder {
	
	public static final WebDriver driver = new FirefoxDriver();
	@Given("^open site decode$")
	public void open_site_decode() throws Throwable {
		driver.get("https://m28dev.github.io/qrdecoder/");
		
	}
	
	@Given("^I Upload QR$")
	public void i_Upload_QR() throws Throwable {

		   WebElement element = driver.findElement(By.id("qrcode"));
	         element.sendKeys("/Users/refqihussein/Desktop/qr.png");
	         Thread.sleep(2000, 0);
	      //submit
	      WebElement element2 = driver.findElement(By.xpath("//button[contains(.,'Submit')]"));
	      element2.click();
	      Thread.sleep(2000);
	      // Close the browser
	      Thread.sleep(10000);

	}

	
}
