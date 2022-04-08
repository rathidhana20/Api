package com.pom_for_automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Tshirt_Page {
	public WebDriver driver;

	@FindBy(xpath="(//a[@title='T-shirts'])[2]")
	private WebElement tshirt;

	public Tshirt_Page(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getTshirt() {
		return tshirt;
	}
	
}
