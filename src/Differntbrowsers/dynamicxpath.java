package Differntbrowsers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class dynamicxpath {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver =new FirefoxDriver();
		
		driver.get("https://in.yahoo.com");
		
		driver.findElement(By.xpath("//*[@id='UHSearchBox']")).sendKeys("Indian");
		Thread.sleep(10000);
		
		
	//	String str =driver.findElement(By.xpath("//*[starts-with(@id,'yui_3_12_0')]/li[1]/a")).getText();
		
		String str =driver.findElement(By.xpath("//*[starts-with(@id='yui_3_12_0')]/a")).getText();
		
		
		                                       //    /*[@id='yui_3_12_0_1_1458551101466_898']/a
		
		//String str = driver.findElement(By.xpath("html/body/div[3]/div[2]/div[3]/table/tbody/tr/td[2]/form/table/tbody/tr/td[1]/div/div/ul/li[6]/a")).getText();
		
		System.out.println(str);
		//1_1458546793958_1217'
		//button[starts-with(@id, 'continue-')] 
		
		
		
		
		
		
	}

}
