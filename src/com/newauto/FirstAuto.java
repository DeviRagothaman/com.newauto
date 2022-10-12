package com.newauto;

//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirstAuto {
	
	public static void main(String[] args) {
		
		///Users/SenthilKumar/eclipse-workspace/com.nithin.lunchmenu/src/lib/selenium-server-4.4.0.jar
		
	//System.setProperty("webdriver.chrome.driver", "/Users/SenthilKumar/WebDrivers/chromedriver");
		
	//ChromeDriver driver=new ChromeDriver();
		
	//	driver.get("http://www.google.com");
		
		//Firefox launch
		
	FirefoxDriver driver=new FirefoxDriver();
		
		
	System.setProperty("WebDriver.gecko.driver", "/Users/SenthilKumar/WebDrivers/geckodriver");	
		
	driver.get("https://www.google.com/");

		
	}
	
}
