package com.careerhack.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MarchMGoogleHomePage {

	WebDriver driver;

	public MarchMGoogleHomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	// Page Object Model (POM)
	// It is a concept that separates step definition and web elements
	// to make the web elements and the actions reusable
	// 1. Page Factory 2. without page factory

	// WebElement searchBox = driver.findElement(By.name("q"));
	@FindBy(name="q")
	WebElement searchBox;
	// searchBox.sendKeys(string);
	public void enterSearch(String string) {
		searchBox.sendKeys(string);
	}
	
	
	//WebElement searchButton = driver.findElement(By.name("btnK"));
	@FindBy(name="btnK")
	WebElement searchButton;
	
	//searchButton.click();
	
	public void clickSearch() {
		searchButton.click();
	}
	

}
