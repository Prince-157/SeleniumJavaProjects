package tutorialsninja;

import java.time.Duration;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TutorialninjaregisterTC1 {

	@Test
	public  void registerWithMandatoryFields() {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo/");
		
		driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[2]/a/span[1]")).click();
		
		driver.findElement(By.linkText("Register")).click();
		
		driver.findElement(By.id("input-firstname")).sendKeys("Hp");
		
		driver.findElement(By.id("input-lastname")).sendKeys("Laptop");

		driver.findElement(By.id("input-email")).sendKeys((""));
		
		driver.findElement(By.id("input-telephone")).sendKeys("1234567890");
		
		driver.findElement(By.id("input-password")).sendKeys("Hp@12345");
		
		driver.findElement(By.id("input-confirm")).sendKeys("Hp@12345");
		
		driver.findElement(By.name("agree")).click();
		
		driver.findElement(By.xpath("//*[@id=\"content\"]/form/div/div/input[2]")).click();	
		
		Assert.assertTrue(driver.findElement(By.linkText("Logout")).isDisplayed());
		
		String expectedHeading = "Your Account Has Been Created!";

		Assert.assertEquals(driver.findElement(By.xpath("//*[@id='content']/h1")).getText(), expectedHeading);
		
		String actual1properDetalsOne = "Congratulations! Your new account has been successfully created!";
		String actual2properDetalsTwo = "You can now take advantage of member privileges to enhance your online shopping experience with us.";
		String actual3properDetalsThree = "If you have ANY questions about the operation of this online shop, please e-mail the store owner.";
		String actual4properDetalsFour = "contact us.";
		
		String expectedProperDetails =  driver.findElement(By.id("content")).getText();
		
		Assert.assertTrue(expectedProperDetails.contains(actual1properDetalsOne));
		Assert.assertTrue(expectedProperDetails.contains(actual2properDetalsTwo));
		Assert.assertTrue(expectedProperDetails.contains(actual3properDetalsThree));
		Assert.assertTrue(expectedProperDetails.contains(actual4properDetalsFour));
		
		driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/a")).click();
		
		Assert.assertTrue(driver.findElement(By.linkText("Edit your account information")).isDisplayed());
		
		driver.quit();
	}
   public  String generateNewEmail() {
			
	        return new Date().toString().replaceAll("\\s", "").replaceAll("\\:", "")+"@gmail.com";
	}	
}