package com.bddfinal.steps;

import java.util.List;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.osa.base.Browser;
import com.osa.utilities.Utility;
import com.osa.utilities.WebElementsLocation;

import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class FinalSteps {
	private static Logger log = Utility.getLog(FinalSteps.class);
	public WebDriver dr;

	@Given("^I am on \"([^\"]*)\"$")
	public void i_am_on(String arg1, DataTable table) throws Throwable {
		List<List<String>> data = table.raw();
		dr = Browser.openBrowser(data.get(0).get(1));
		dr.get(data.get(1).get(1));
	}
	@And("^I click on \"([^\"]*)\"$")
	public void i_click_on(String arg1, DataTable table) throws Throwable {
		List<List<String>> data = table.raw();
		WebElementsLocation.myClick(dr, data.get(0).get(0), data.get(0).get(1));
		Thread.sleep(3000);
		}
	
	@When("^I send \"([^\"]*)\"and \"([^\"]*)\"$")
	public void i_send_and(String arg1, String arg2) throws Throwable {
	    System.out.println("************   "+arg1);
	    System.out.println("##############  "+arg2);
	}

	@Then("^I am on Student page$")
	public void i_am_on_Student_page() throws Throwable {
		
	}

	@And("^I enter \"([^\"]*)\"$")
	public void i_enter(String arg1, DataTable table) throws Throwable {
		List<List<String>> data = table.raw();
		WebElementsLocation.typeValue(dr, data.get(0).get(0), data.get(0).get(1), data.get(0).get(2));
		Thread.sleep(3000);
		//WebElementsLocation.typeValue(dr, "xpath", "[//abx]", "friday");
		
		}

	@Given("^I verify \"([^\"]*)\"$")
	public void i_verify(String arg1, DataTable table) throws Throwable {
		List<List<String>> data = table.raw();
		Utility.verifyTitle(dr, data.get(0).get(1));
		System.out.println(data.get(0).get(1));
		log.info("verifing student page");
		Thread.sleep(3000);
	}
	@Given("^I am on osa homepage$")
	public void i_am_on_osa_homepage(DataTable table) throws Throwable {
		List<List<String>> data = table.raw();
		dr = Browser.openBrowser(data.get(0).get(1));
		dr.get(data.get(1).get(1));
	}
	@And("^I enter the email and password$")
	public void i_enter_the_email_and_password(DataTable credentials) throws Throwable {
		List<List<String>> data = credentials.raw();

		// And I enter the email and password
		// |abcd@gmail.com|1234567|
		// driver.findElement(By.id("email")).sendKeys(data.get(0).get(0));
		// driver.findElement(By.id("password")).sendKeys(data.get(0).get(1));
		// fl.textEmail(data.get(0).get(0));
		// Write code here that turns the phrase above into concrete actions
		// For automatic transformation, change DataTable to one of
		// List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
		// E,K,V must be a scalar (String, Integer, Date, enum etc)

	}

}
