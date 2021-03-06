package com.osa.utilities;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
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
			//Assert.assertEquals(actualV, expectedV);
		}

}}
