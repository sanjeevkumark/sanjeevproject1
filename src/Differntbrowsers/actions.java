package Differntbrowsers;

import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class actions {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver =new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.get("https://spiproject.com/");
		driver.findElement(By.xpath("//*[@id='Login1_UserName']")).sendKeys("sanjeev.krishnappa");
		driver.findElement(By.xpath("//*[@id='Login1_Password']")).sendKeys("donmaggi");
		driver.findElement(By.xpath("//*[@id='Login1_LoginButton']")).click();
		//driver.findElement(By.xpath("//*[@id='mega-menu-2']/li[3]/div/ul/div/li[3]/ul/li/a")).click();
		
		 WebElement element = driver.findElement(By.xpath("//*[@id='mega-menu-2']/li[1]/a"));
		 
	        Actions action = new Actions(driver);
	 
	       action.moveToElement(element).build().perform();
	       
//	       WebElement project = driver.findElement(By.xpath("//*[@id='mega-menu-2']/li[1]/div/ul"));
//	       List<WebElement> alllinks = project.findElements(By.tagName("a"));
//	       
//	       int links = alllinks.size();
//	       System.out.println(links);
//	       
//	       Random total = new Random();
//	       int ranmdamnum = total.nextInt(alllinks.size());
//	       WebElement ran = alllinks.get(ranmdamnum);
//	       System.out.println(ran.getText());
//	       ran.click();
	       
	       
	       
	     //  Thread.sleep(1000);
//	       
	       WebDriverWait wait= new WebDriverWait(driver,50);
	       wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//*[@id='mega-menu-2']/li[3]/div/ul/div/li[3]/ul/li/a")));
	       driver.findElement(By.xpath("//*[@id='mega-menu-2']/li[3]/div/ul/div/li[3]/ul/li/a")).click();
	       
	 
	      //  driver.findElement(By.linkText("iPads")).click();
	      //  action.moveToElement(element).click().perform();
	}
	
	

}
