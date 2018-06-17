package Differntbrowsers;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class action {
	
	public static void main(String []args) throws InterruptedException{
		
		
		WebDriver driver =new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://www.americangolf.co.uk/");
		
	//	driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		
//		driver.findElement(By.xpath("//*[@id='navigation']/nav/ul/li[1]/a")).click();
		System.out.println("bbbbbbbbbbbbbbbb");
		
//		Actions actions = new Actions(driver);
//		WebElement mainMenu = driver.findElement(By.xpath(".//*[@id='CLUBS_1']/div[1]/ul[2]/li/ul/li[2]/ul/li[1]/a"));
//		//actions.moveToElement(mainMenu);
//		
//		action.moveToElement(mainMenu).build().perform();
//		driver.findElement(By.xpath(".//*[@id='CLUBS_1']/div[1]/ul[2]/li/ul/li[2]/ul/li[1]/a")).click();
//		
	System.out.println("vvvvvvvvvvv");

//		WebElement subMenu = driver.findElement(By.cssSelector("subLinklocator"));
//		actions.moveToElement(subMenu);
//		actions.click().build().perform();
//		
//		driver.findElement(By.xpath(".//*[@id='CLUBS_1']/div[1]/ul[2]/li/ul/li[2]/ul/li[1]/a")).click();
//		
	
	//*[@id='CLUBS_1']/div[1]/ul[2]/li/ul/li[2]/ul/li[1]
	//*[@id='CLUBS_1']/div[1]/ul[2]/li/ul/li[2]/ul/li[1]/a
	WebElement mainMenu = driver.findElement(By.xpath("//*[@id='CLUBS_1']/div[1]/ul[2]/li/ul/li[2]/ul/li[1]/a"));
	Actions action = new Actions(driver);
	                                                   //*[@id='CLUBS_1']/div[1]/ul[2]/li/ul/li[2]/ul/li[1]/a
    action.moveToElement(mainMenu).build().perform();
    


    WebDriverWait wait = new WebDriverWait(driver, 50);

    wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//*[@id='CLUBS_1']/div[1]/ul[2]/li/ul/li[2]/ul/li[1]/a")));
  

    driver.findElement(By.xpath("//*[@id='CLUBS_1']/div[1]/ul[2]/li/ul/li[2]/ul/li[1]/a")).click();
		System.out.println("working");
		
		
		
	}

}
