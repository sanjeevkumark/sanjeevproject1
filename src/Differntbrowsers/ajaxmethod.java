package Differntbrowsers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ajaxmethod {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver= new FirefoxDriver();
		driver.get("https://in.yahoo.com/?p=us");
		//driver.findElement(By.xpath("//table[@class='W(100%) M(0)! P(0) H(100%)']/tbody/tr/td[1]/input")).sendKeys("maggi");
		//driver.findElement(By.xpath("html/body/div[3]/div[2]/div[3]/table/tbody/tr/td[2]/form/table/tbody/tr/td[1]/input")).sendKeys("maggi");
		driver.findElement(By.xpath("//*[@id='UHSearchBox']")).sendKeys("maggi");
		Thread.sleep(3000);
		try{			
		
		driver.findElement(By.xpath("html/body/div[3]/div[2]/div[3]/table/tbody/tr/td[2]/form/table/tbody/tr[1]/td[1]/input")).getText();
		//System.out.println(val);
		}catch(Exception e)
		{
			System.out.println("catch");
		}
		
		                            //table[@class='batting-table innings']/tbody input
		// "table class="W(100%) M(0)! P(0) H(100%)"
		

	}

}
