package practice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Popups {

	
	@Test
	public void firstPopup()
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://practice-automation.com/");
		WebElement element=driver.findElement(By.xpath("//a[text()='Popups']"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", element);
		//driver.findElement(By.xpath("//a[text()='Popups']")).click();
		driver.findElement(By.xpath("//button[@id='alert']")).click();
		Alert alert=driver.switchTo().alert();
		alert.accept();
		
		driver.findElement(By.xpath("//button[@id='confirm']")).click();
		Alert alert2=driver.switchTo().alert();
		alert2.dismiss();
		
		driver.findElement(By.xpath("//button[@id='prompt']")).click();
		Alert prompt=driver.switchTo().alert();
		prompt.sendKeys("Hello how are you");
		prompt.accept();
		
		driver.findElement(By.xpath("//div[@onclick='showTooltip()']")).click();
		String text=driver.findElement(By.xpath("//span[@id='myTooltip']")).getText();
		System.out.println(text);
		
		WebElement slider=driver.findElement(By.xpath("//input[@id='slideMe']"));
		Actions action = new Actions(driver);
		action.dragAndDropBy(slider, 200, 0).perform();
		
		
		
		
		
		
		
		
		
		
	}
	
	
}
