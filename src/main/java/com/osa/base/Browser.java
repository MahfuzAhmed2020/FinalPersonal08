package com.osa.base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;



public class Browser {
	
	static WebDriver dr=null;
	static String basePath=System.getProperty("user.dir");
	static String os=System.getProperty("os.name");
	public static void main(String[] args) {
		Browser.openBrowser("Edge");
	}
	/**
	 * this method will open web browser on different operating system
	 * @param browser
	 * @return webDriver
	 */
	public static WebDriver openBrowser(String browser) {
		if(os.toLowerCase().contains("windows")) {
			System.out.println("Browser is running on "+ os);
			getBrowserForWindows(browser);
		}else {
			System.out.println("Browser is running on "+ os);
			getBrowserForMac(browser);
		}
		/*WebDriverWait myWait=new WebDriverWait(dr, 1000);
		myWait.until(ExpectedConditions.visibilityOfElementLocated(By.name("userName")));
		*/
		dr.manage().deleteAllCookies();
		dr.manage().window().maximize();
		
		 return dr;
	}
	
	/**
	 * this method will open Web Browser on Windows operating System.
	 * @param browser
	 */
	public static void getBrowserForWindows(String browser) {
		if(browser.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver", basePath+"\\src\\test\\resources\\drivers\\geckodriver.exe");
			 dr=new FirefoxDriver();
		}else if(browser.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", basePath+"\\src\\test\\resources\\drivers\\chromedriver.exe");
			 dr= new ChromeDriver();
			 dr.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		}else if (browser.equals("Edge")) {
			WebDriverManager.edgedriver().setup();
			dr = new EdgeDriver();
		}else {
			System.out.println("You have entered "+ browser+" that does not exist. Please either chrome or firefox");
		}
	}
	
//	public static void getBrowserForMac(String browser) {
//		if(browser.equals("firefox")) {
//			System.setProperty("webdriver.gecko.driver", basePath+"/src/test/resources/drivers/mac/geckodriver");
//			 dr=new FirefoxDriver();
//		}else if(browser.equals("chrome")) {
//			System.setProperty("webdriver.chrome.driver", basePath+"/src/test/resources/drivers/mac/chromedriver");
//			 dr= new ChromeDriver();
//		}else {
//			System.out.println("You have entered "+ browser+" that does not exist. Please either chrome or firefox");
//		}
//	}
	
	/**
	 * this method will open Web Browser on mac operating System.
	 * @param browser
	 */
	public static void getBrowserForMac(String browser) {
		if(browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/src/test/resources/drivers/mac/chromedriver");
			dr = new ChromeDriver();
		}else if(browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"/src/test/resources/drivers/mac/geckodriver");
			dr = new FirefoxDriver();
		}else if (browser.equals("Edge")) {
			WebDriverManager.edgedriver().setup();
			dr = new EdgeDriver();
		}else {
			System.out.println("Please set the executable browser path");
		}
	}
/*//  bonigarcia
	  
	  public static void getBrowserForWindows(String browser) {
		
		if (browser.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			dr = new ChromeDriver();
		}else if (browser.equals("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			dr = new FirefoxDriver();
		}else {
			System.out.println("The browser path is not executeble");
		}
		
	}
	
	public static void getBrowserForMac(String browser) {
		if (browser.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			dr = new ChromeDriver();
		}else if (browser.equals("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			dr = new FirefoxDriver();
		}else {
			System.out.println("The browser path is not executeble");
		}
	}
	<dependency>
			<groupId>io.github.bonigarcia</groupId>
			<artifactId>webdrivermanager</artifactId>
			<version>4.3.1</version>
	</dependency>
	*
	*/


}
