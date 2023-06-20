package selenium.test.steps;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class Emailfill {
	
	public static final WebDriver driver = new FirefoxDriver();
	@Given("^I want to open QR generate website$")
	public void i_want_to_open_QR_generate_website() throws Throwable {
		driver.get("http://zxing.appspot.com/generator/");
		
	}
	
	@Then("^I want to click email section$")
	public void i_want_to_click_email_section() throws Throwable {

		WebElement element = driver.findElement(By.xpath("//select"));
		element.click();
		
		// Choose by select
		Select sel = new Select(element);
		sel.selectByVisibleText("Email address");
		

	}

	@Then("^I fill email \"([^\"]*)\"$")
	public void i_fill_email(String arg1) throws Throwable {

		
		driver.findElement(By.xpath("//input")).sendKeys("random.random@random.com");
		Thread.sleep(10);

	}

	@Then("^I click submit button$")
	public void i_click_submit_button() throws Throwable {
		// click Generate
		
		WebElement element4 = driver.findElement(By.xpath("//button"));
		element4.click();
		Thread.sleep(10);

	}
	@Then("^I Download the QR$")
	public void i_download_the_qr() throws Throwable {
		
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
		
	}
	
}