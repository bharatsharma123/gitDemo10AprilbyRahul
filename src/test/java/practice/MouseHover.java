package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseHover {
	
	@Test
	public void myMouseHover()

	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://practice-automation.com/modals/");
		driver.findElement(By.xpath("//button[@id='simpleModal']")).click();
		//driver.switchTo().frame("frame2");
		//driver.findElement(By.xpath("//button[@class='Button Button--default UserMenu__Link'][normalize-space()='Login']")).click();
		driver.findElement(By.xpath("//div[@id='popmake-1318']//button[@aria-label='Close'][normalize-space()='×']")).click();
		
		
		
		//driver.findElement(By.xpath("//a[normalize-space()='OK']")).click();
		
		//driver.findElement(By.xpath("//button[@id='12345-next']")).click();
		/*WebElement mainMenu=driver.findElement(By.xpath("//a[@class='sf-with-ul'][normalize-space()='Horse Care']"));//found using multiple attribute
		Actions act=new Actions(driver);
		act.moveToElement(mainMenu);
		WebElement subMenu=driver.findElement(By.xpath("//li[@class='menu-item menu-item-type-taxonomy menu-item-object-category menu-item-has-children menu-item-first menu-item-858914']//a[normalize-space()='Horse Deworming']"));
		act.moveToElement(subMenu);
		act.click().build().perform();
		*/
		
		
		
		
}
}