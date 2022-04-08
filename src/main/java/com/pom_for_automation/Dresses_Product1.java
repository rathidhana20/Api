package com.pom_for_automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Dresses_Product1 {
	public WebDriver driver;
	@FindBy(xpath="(//a[@class='product-name'])[4]")
	private WebElement dress;
	
	@FindBy(xpath="//i[@class='icon-plus']")
	private WebElement Quantity;
	
  @FindBy(id = "group_1")
  private WebElement size;
  
 @FindBy(xpath="//span[text()='Add to cart']")
 private WebElement cart;
 
 @FindBy(xpath="//span[contains(text(),'Proceed')]")
 private WebElement proceed;



public Dresses_Product1(WebDriver driver2) {
	this.driver=driver2;
	
	PageFactory.initElements(driver, this);
}

public WebElement getDress() {
	return dress;
}

public WebElement getQuantity() {
	return Quantity;
}

public WebElement getSize() {
	return size;
}

public WebElement getCart() {
	return cart;
}

public WebElement getProceed() {
	return proceed;
}
 
 
	
}
