package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class partialLinkText {
	public static void main(String[] args) throws InterruptedException {

		// to launch the browser
		WebDriver driver = new ChromeDriver();

		// to maximize
		driver.manage().window().maximize();

		// to launch the web application
		driver.get("https://www.instagram.com/");

		Thread.sleep(3000);
		
		//click on forgot password
		driver.findElement(By.partialLinkText("Forgot")).click();
	}

}
