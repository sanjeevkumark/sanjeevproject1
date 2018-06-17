package Differntbrowsers;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Webtablesespn {
//second commits
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		WebDriver driver =new FirefoxDriver();
		driver.manage().window().maximize();
		
		driver.get("http://www.espncricinfo.com/icc-womens-championship-2014-16/engine/match/946549.html");
		driver.findElement(By.xpath("//*[@id='st_1']")).click();
		List<WebElement> element=driver.findElements(By.xpath("//table[@class='batting-table innings']/tbody/tr"));
		List<WebElement> elements1=driver.findElements(By.xpath("//table[@class='batting-table innings']/tbody/tr[2]/td"));
		
		System.out.println(element.size());
		System.out.println(elements1.size());
		
		for(int i=1;i<elements1.size();i++){
			
			System.out.println(elements1.get(i).getText());
		}
		System.out.println();
		
		
//		int row = driver.findElements(By.xpath("//table[@class='batting-table innings']/tbody/tr")).size();
//		int col=driver.findElements(By.xpath("//table[@class='batting-table innings']/tbody/tr/td")).size();
		
//		for(int i=1;i<row;i++){
//			
//			System.out.println(row);
//			System.out.println(col);
			
			
		//}
		

	}

}
