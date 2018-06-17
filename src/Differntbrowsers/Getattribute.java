package Differntbrowsers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Getattribute {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		WebDriver driver=new FirefoxDriver();
		
		driver.get("https://in.yahoo.com");
		
		driver.findElement(By.xpath("//*[@id='UHSearchBox']")).sendKeys("Indian");
		
		String str =driver.findElement(By.xpath("//*[@id='UHSearchBox']")).getAttribute("name");
		
		System.out.println(str);
		
		
		

	}

}
