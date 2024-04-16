package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//Amazon login

public class AmazonLogin {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://in.linkedin.com/");
		
		WebElement user= driver.findElement(By.name("session_key"));
		
		user.sendKeys("9876543210");
		
        WebElement pass= driver.findElement(By.id("session_password"));
		
		pass.sendKeys("abcdef");
		
		WebElement button= driver.findElement(By.className("sign-in-form__submit-btn--full-width"));
		
		button.click();
	}

}
