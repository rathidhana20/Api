package com.pom_for_automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Women_Page2 {
	public WebDriver driver;
	
	
	@FindBy(xpath="//a[@title='Women']")
	private WebElement home2;
	
	

	public Women_Page2(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}



	public WebElement getHome3() {
		return home2;
	}
	
	
	
	

}
