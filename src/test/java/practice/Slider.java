package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Slider {
	
	@Test
	public void mySlider()
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://practice-automation.com/");
		
		WebElement element=driver.findElement(By.xpath("//a[normalize-space()='Sliders']"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", element);
		//driver.findElement(By.xpath("//a[normalize-space()='Sliders']")).click();
		WebElement slider=driver.findElement(By.xpath("//input[@id='slideMe']"));
		Actions action = new Actions(driver);
		action.dragAndDropBy(slider, 200, 0).perform();
		
	}

}
