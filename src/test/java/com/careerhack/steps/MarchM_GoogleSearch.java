package com.careerhack.steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import com.careerhack.common.MarchMGoogleBase;
import com.careerhack.pages.MarchMGoogleHomePage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MarchM_GoogleSearch extends MarchMGoogleBase {
	
	MarchMGoogleHomePage m1;

	@Given("I am on google homepage")
	public void i_am_on_google_homepage() {

		launchBrowser();

	}

	@When("I enter the search {string}")
	public void i_enter_the_search(String string) {

		// step 1: identify the web element
		// 8 different locators to identify an element
		// id, name, class name, html tag, link text, partial link text, css selector,
		// and xpath
		m1 = new MarchMGoogleHomePage(driver);
		m1.enterSearch(string);
	}

	@When("I click on google search button")
	public void i_click_on_google_search_button() {

		m1.clickSearch();

	}

	@Then("I receive related search result")
	public void i_receive_related_search_result() {

		WebElement result = driver.findElement(By.id("result-stats"));

		String numberOfResult = result.getText();

		System.out.println("*********************************************************");
		System.out.println(numberOfResult);
		System.out.println("*********************************************************");

		closeBrowser();

	}

}
