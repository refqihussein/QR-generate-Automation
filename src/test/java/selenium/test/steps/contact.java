package selenium.test.steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.And;

public class contact {
	
	public static final WebDriver driver = new FirefoxDriver();
	@Given("^open site$")
	public void open_site() throws Throwable {
		driver.get("http://zxing.appspot.com/generator/");
		
	}
	
	@And("^I fill Name$")
	public void i_fill_name() throws Throwable {

		  driver.findElement(By.xpath("//input")).sendKeys("John Doe");
	      Thread.sleep(3000);
		

	}

	@And("^I fill company$")
	public void i_fill_company() throws Throwable {

		
		  driver.findElement(By.xpath("//tr[2]/td[2]/input")).sendKeys("Example");
	       Thread.sleep(3000);
	}

	@And("^I Judul $")
	public void judul() throws Throwable {
		// click Generate
		
		  driver.findElement(By.xpath("//tr[3]/td[2]/input")).sendKeys("Test Automation");
	      Thread.sleep(3000);

	}
	@And("^I Phone Number$")
	public void i_Phone_Number() throws Throwable {
		// click Generate
		 driver.findElement(By.xpath("//tr[4]/td[2]/input")).sendKeys("628123456789");
	       Thread.sleep(3000);
}
	@And("^I email$")
	public void email() throws Throwable {
		// click Generate 
		driver.findElement(By.xpath("//tr[5]/td[2]/input")).sendKeys("Random@email.com");
	      Thread.sleep(3000);
}
	@And("^I Address")
	public void i_Address(int arg1) throws Throwable {
		// click Generate
		driver.findElement(By.xpath("//tr[6]/td[2]/input")).sendKeys("Adress1");
	       Thread.sleep(3000);
}
	@And("^I adress2$")
	public void adresses() throws Throwable {
		// click Generate
		  driver.findElement(By.xpath("//tr[8]/td[2]/input")).sendKeys("www.example.com");
	       Thread.sleep(3000);
}
	@And("^I Website$")
	public void i_Website() throws Throwable {
		// click Generate
		  driver.findElement(By.xpath("//tr[9]/td[2]/input")).sendKeys("Memo");
	      Thread.sleep(3000);
}
	@And("^I Memo$")
	public void memos() throws Throwable {
		// click Generate
		   WebElement element4 = driver.findElement(By.xpath("//button"));
		      element4.click();
}

	
}