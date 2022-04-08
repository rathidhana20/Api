package com.pom_for_automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Women_Page1 {
	public WebDriver driver;
	
	@FindBy(xpath="//a[@title='Women']")
	private WebElement home2;

	public Women_Page1(WebDriver driver) {
		this.driver=driver;

   PageFactory.initElements(driver, this);
	}

	public WebElement getHome2() {
		return home2;
	}
	

}
