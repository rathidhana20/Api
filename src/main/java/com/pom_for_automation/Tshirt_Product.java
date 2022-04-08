package com.pom_for_automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Tshirt_Product {
	public WebDriver driver;
	@FindBy(xpath="(//a[@title='Faded Short Sleeve T-shirts'])[2]")
	private WebElement tshirt;
	
	@FindBy(xpath="//i[@class='icon-plus']")
	private WebElement quan;
	
	@FindBy(id="group_1")
	private WebElement size;
	
	@FindBy(xpath="//a[@class='color_pick']")
	private WebElement color;
	
	@FindBy(xpath="//span[text()='Add to cart']")
	private WebElement cart;
	
	@FindBy(xpath="(//i[@class='icon-chevron-right right'])[2]")
	private WebElement proceed;

	public Tshirt_Product(WebDriver driver2) {
		
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getTshirt() {
		return tshirt;
	}

	public WebElement getQuan() {
		return quan;
	}

	public WebElement getSize() {
		return size;
	}

	public WebElement getColor() {
		return color;
	}

	public WebElement getCart() {
		return cart;
	}

	public WebElement getProceed() {
		return proceed;
	}
	

}
