package com.pom_for_automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Dresses_page {
	public WebDriver driver;

	@FindBy(xpath="(//a[@title='Dresses'])[2]")
	private WebElement dresspage;

	public Dresses_page(WebDriver driver2) {
		this.driver=driver2;
		 
		PageFactory.initElements(driver, this);
	}

	public WebElement getDresspage() {
		return dresspage;
	}
	
	
	
}
