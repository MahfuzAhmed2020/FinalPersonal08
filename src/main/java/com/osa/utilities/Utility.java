package com.osa.utilities;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
//import org.testng.Assert;

public class Utility {
	private static Logger log=Utility.getLog(Utility.class);
	//Example:
	//log.info("This will add as a log in your execution.log file under target directory");
	
	public static Logger getLog(Class clazz) {
		Logger log=Logger.getLogger(clazz);
		PropertyConfigurator.configure("\\src\\test\\resources\\properties\\log4j.properties");
		return log;
		}
	public static void verifyTitle(WebDriver dr,String expectedV) {
		String actualV=	dr.getTitle();
		if (expectedV.equals(actualV)) {
			System.out.println("**********The test is passed**************");
			log.info("**********The test is passed**************");
		} else {
			log.info("The test is Failed");
			log.info("Expected value is : " + expectedV); 
			log.info("Actual value is : " + actualV);
			Assert.assertEquals(actualV, expectedV);
		}

}
/*
	
	//Scrollpage
public static void scrollPage(WebDriver dr,String pixel) {
	JavascriptExecutor se=(JavascriptExecutor)dr;
	se.executeScript("window.scrollBy(0,"+pixel+")");
	
}	
	
	
	

	// screenshot
	public static String takeScreenShot(WebDriver dr, String failurmethodname) {
		TakesScreenshot ts = (TakesScreenshot) dr;
		File source = ts.getScreenshotAs(OutputType.FILE);
		String destination = System.getProperty("user.dir") + "\\screenshot\\" + System.currentTimeMillis()
				+ failurmethodname + ".png";
		try {
			FileUtils.copyFile(source, new File(destination));
		} catch (IOException e) {
			log.info("ScreenShot not possible" + e.getMessage());
		}
		return destination;
	}
*/
	
}
