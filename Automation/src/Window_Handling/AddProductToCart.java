package Window_Handling;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddProductToCart {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.flipkart.com");
		
		//Search water bottle
		driver.findElement(By.name("q")).sendKeys("water bottle",Keys.ENTER);
		
		//Click on any water bottle
		driver.findElement(By.xpath("(//a[text()='NIRLON Summer Cool Single Wall Stainless Steel Fridge W...'])[1]")).click();
		
		//fetch parent window id
		String parentWindowId = driver.getWindowHandle();
		System.out.println("parentWindowId :- "+ parentWindowId);
		
		//Fetch parent as well as child window id
		Set<String> allwindowId = driver.getWindowHandles();
		
		for(String id:allwindowId)
		{
			driver.switchTo().window(id);
			if(driver.getTitle().contains("NIRLON Summer Cool Single Wall Stainless Steel Fridge Water Bottle"))
			{
				break;
			}
			
		}
		Thread.sleep(2000);
		
		//Click on addToCart button
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2U9uOA _3v1-ww']")).click();
		Thread.sleep(2000);
		
		//Switch to parent window 
		driver.switchTo().window(parentWindowId);
		Thread.sleep(2000);
		
		//Click on cart
		driver.findElement(By.xpath("//span[text()='Cart']")).click();
	}

}
