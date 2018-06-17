package Differntbrowsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

public class browsers {

	public static void main(String[] args) {
		
	//	@Test
	//	public void test(String browsername){
		
			String browsername ="Mozilla" ;

		WebDriver driver=null;

		if(browsername.equals("Mozilla"))

		{

		 driver = new FirefoxDriver();
		
		}

//		else if(browsername.equals("ie"))
//		{
//		System.setProperty("webDriver.ie.driver", "D:\\chromedriver.exe");
//
//		 driver = new InternetExplorerDriver();
//
//		}
//		
		


		else if(browsername.equals("chrome"))
				{
		

		System.setProperty("webDriver.chrome.driver","D:\\chromedriver.exe");

		 driver = new ChromeDriver();

		}

		}


		
	}
		
		

	


