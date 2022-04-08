package com.testng.features;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.ClickAction;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import com.baseclass.Base_class;
import com.configuration.helper.File_Reader_Automation;
import com.pagemanager.Pageobjectmanager_automation;
import com.pom_for_automation.Back;
import com.pom_for_automation.Bank;
import com.pom_for_automation.Confirm;
import com.pom_for_automation.Dresses_Product1;
import com.pom_for_automation.Dresses_page;
import com.pom_for_automation.Homepage1;
import com.pom_for_automation.Homepage2;
import com.pom_for_automation.Women_Page1;
import com.pom_for_automation.Women_Page2;
import com.pom_for_automation.Logout;
import com.pom_for_automation.Proceed1;
import com.pom_for_automation.Proceed2;
import com.pom_for_automation.Proceed3;
import com.pom_for_automation.Tshirt_Page;
import com.pom_for_automation.Tshirt_Product;
import com.pom_for_automation.Women_Product1;
import com.pom_for_automation.Women_Product2;

public class TestNG_Implementation extends Base_class{
	private static final String[] womenproduct1 = null;
	public static WebDriver driver= browser_configuration("chrome");
	public static Pageobjectmanager_automation pom= new Pageobjectmanager_automation(driver);	
	public static Logger log=Logger.getLogger(TestNG_Implementation.class);
	
	
	@BeforeClass 
	
	private void browser_launch() throws IOException {
	    PropertyConfigurator.configure("log4j.properties");
	    String url = File_Reader_Automation.get_instance_FRM().get_instance_CR().get_config_url();
		geturl(url);
		Assert.assertEquals(url, url);
		implicitwait(10, TimeUnit.SECONDS);
		 driver.manage().window().maximize();
		 log.info("URL Succesfully launched");
		 
	}
		@BeforeMethod
	   private void login() throws Throwable {
		ClickonElement(pom.getinstancehp1().getHome1());
		
		 String email = File_Reader_Automation.get_instance_FRM().get_instance_CR().get_config_email();
		 invalueelement(pom.getinstancehp2().getMail(),email);
		 
		 String pass = File_Reader_Automation.get_instance_FRM().get_instance_CR().get_config_pass();
         invalueelement(pom.getinstancehp2().getPass(),pass);
		
		 String signin = File_Reader_Automation.get_instance_FRM().get_instance_CR().get_config_signin();
		 ClickonElement(pom.getinstancehp2().getSignin());
		 
		 log.info("Login credentials entered successfully");
		 
	   }
	
		@Test(groups="Women",priority = -2)
	private void womenproduct1() throws Throwable {
	
		{
			
			 ClickonElement(pom.getinstancehp3().getHome2());
		   
		     //product1
		     ClickonElement(pom.getinstancep1().getDress1());
		     ClickonElement(pom.getinstancep1().getQuan1());
		     dropdown("byvalue","2" , 0, pom.getinstancep1().getSize1());
		     ClickonElement(pom.getinstancep1().getColor1());
		     ClickonElement(pom.getinstancedp().getCart());
		     ClickonElement(pom.getinstancedp().getProceed());
		     log.info("Women Dress1 purchased");	    
		   //Homepage4
		   
		   //proceed
			  ClickonElement(pom.getinstancepc1().getProceed1());
			   invalueelement(pom.getinstancepc2().getMess(), "Deliver as soon as possible");
			   ClickonElement(pom.getinstancepc2().getProceed2());
			   ClickonElement(pom.getinstancepc3().getCheck());
			   ClickonElement(pom.getinstancepc3().getProceed3());
			   ClickonElement(pom.getinstanceb().getBank());
			   ClickonElement(pom.getinstancec1().getConfirm());
			   log.info("Order confirmed");
			    ClickonElement(pom.getinstanceb1().getBack());
		     ClickonElement(pom.getinstancehp4().getHome3());
		    
		   sleep(1000);

	}}
		@Ignore
		@Test
	  private void womenproduct() {
		  {
			   //product2
			  
			     ClickonElement(pom.getinstancep2().getDress2());
			     dropdown("byvalue", "3", 0, pom.getinstancep2().getSize2());
			     ClickonElement(pom.getinstancep2().getColor());
			     ClickonElement(pom.getinstancep2().getCart2());
			     ClickonElement(pom.getinstancep2().getProceed1());
			    log.info("Women Dress2 purchased");
				}
			    
         //proceed
		  ClickonElement(pom.getinstancepc1().getProceed1());
		   invalueelement(pom.getinstancepc2().getMess(), "Deliver as soon as possible");
		   ClickonElement(pom.getinstancepc2().getProceed2());
		   ClickonElement(pom.getinstancepc3().getCheck());
		   ClickonElement(pom.getinstancepc3().getProceed3());
		   ClickonElement(pom.getinstanceb().getBank());
		   ClickonElement(pom.getinstancec1().getConfirm());
		   log.info("Order confirmed");
		    ClickonElement(pom.getinstanceb1().getBack());
		  
		  
	}
		
		//proceed1 
	   
	  
		
	  
	  
	  @AfterMethod
	  private void logout() {
	    ClickonElement(pom.getinstancelg().getLogout());
		log.info("Successfully logged out");
		
		
		
		
	  }
	  @Test(dependsOnMethods = "womenproduct1")
	 //dress
	  private void dressproduct() {
		  
	    ClickonElement(pom.getinstancedpage().getDresspage());
	   
	    
	   //dress_product
	     ClickonElement(pom.getinstancedp().getDress());
	     ClickonElement(pom.getinstancedp().getQuantity());
	     dropdown("byvalue","2", 0, pom.getinstancedp().getSize());
	     ClickonElement(pom.getinstancedp().getCart());
	     ClickonElement(pom.getinstancedp().getProceed());
	     log.info("Dress purchased");
	     
	     //proceed
	   //proceed
		  ClickonElement(pom.getinstancepc1().getProceed1());
		   invalueelement(pom.getinstancepc2().getMess(), "Immediate requirement");
		   ClickonElement(pom.getinstancepc2().getProceed2());
		   ClickonElement(pom.getinstancepc3().getCheck());
		   ClickonElement(pom.getinstancepc3().getProceed3());
		   ClickonElement(pom.getinstanceb().getBank());
		   ClickonElement(pom.getinstancec1().getConfirm());
		   log.info("Order confirmed");
		    ClickonElement(pom.getinstanceb1().getBack());
		  
	     
	  }
	  @Test(priority =-1 )
	  private void tshirtproduct() {
          ClickonElement(pom.getinstancets().getTshirt());
          ClickonElement(pom.getinstancetp1().getTshirt());
          ClickonElement(pom.getinstancetp1().getQuan());
          dropdown("byvalue", "2", 0, pom.getinstancetp1().getSize());
          ClickonElement(pom.getinstancetp1().getColor());
          ClickonElement(pom.getinstancetp1().getCart());
          ClickonElement(pom.getinstancetp1().getProceed());
          log.info("Tshirt purchased");
          
          //proceed
        //proceed
		  ClickonElement(pom.getinstancepc1().getProceed1());
		   invalueelement(pom.getinstancepc2().getMess(), "Bring it safe");
		   ClickonElement(pom.getinstancepc2().getProceed2());
		   ClickonElement(pom.getinstancepc3().getCheck());
		   ClickonElement(pom.getinstancepc3().getProceed3());
		   ClickonElement(pom.getinstanceb().getBank());
		   ClickonElement(pom.getinstancec1().getConfirm());
		   log.info("Order confirmed");
		    ClickonElement(pom.getinstanceb1().getBack());
		  
	  }
   
}

