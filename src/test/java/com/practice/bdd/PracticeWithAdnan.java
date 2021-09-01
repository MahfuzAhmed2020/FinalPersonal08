package com.practice.bdd;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PracticeWithAdnan {
	static WebDriver dr;

	public static void main(String args[]) {
		testOsa();
		scrollPage(dr, "300");
	}

	public static void testOsa() {
		WebDriverManager.chromedriver().setup();
		dr.get("http://www.osaconsultingtech.com/");
		WebDriverWait check = new WebDriverWait(dr, 100);
		check.until(ExpectedConditions.elementToBeClickable(dr.findElement(By.id(""))));
	}

	public static void javaScriptPro() {
		// Initialize the JS object.
		JavascriptExecutor js = (JavascriptExecutor) dr;
		// Get the current site title.
		String sitetitle = (String) js.executeScript("return document.title");
		System.out.println("My Site Title: " + sitetitle);

	}

	// Scrollpage
	public static void scrollPage(WebDriver dr, String pixel) {
		JavascriptExecutor se = (JavascriptExecutor) dr;
		se.executeScript("window.scrollBy(0," + pixel + ")");
		// Vertical scroll down by 600 pixels
		// js.executeScript("window.scrollBy(0,600)");
		
		// Javascript command
         se.executeScript("document.getElementsById('some_id').value='Avinash Mishra';");

	}

}
