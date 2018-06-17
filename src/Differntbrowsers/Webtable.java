package Differntbrowsers;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Webtable {
	//second commit

	public static void main(String[] args) {

		WebDriver driver =new FirefoxDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		String companynamess ="MMTCs Ltd.";
		
		driver.get("http://money.rediff.com/gainers/bse/daily/groupa?src=gain_losegainers/bse/daily/groupa?src=gain_lose/");
		List<WebElement> companyname= driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr/td[1]"));
		List<WebElement> prize= driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr/td[4]"));
		
	 System.out.println(companyname.size());
	 System.out.println(prize.size());
		
	 
	 for (int i=0;i<companyname.size();i++){
		 
		 if(companyname.equals(companyname.get(i).getText()))
		 
		 System.out.println(companyname.get(i).getText()+ "---------"+ prize.get(i).getText());
		 
		 else{
			 System.out.println(companyname.get(i).getText()+ "---------"+ prize.get(i).getText());
		 
		 
	 }
		
//for (int j=0;j<prize.size();j++){
//		 
//		 System.out.println(prize.get(j).getText());
//	 }

	}

}
}

