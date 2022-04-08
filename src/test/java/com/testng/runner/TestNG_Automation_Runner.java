package com.testng.runner;

import java.io.File;
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
import org.testng.annotations.BeforeSuite;

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

public class TestNG_Automation_Runner extends Base_class{
	public static WebDriver driver= browser_configuration("chrome");
	public static Pageobjectmanager_automation pom= new Pageobjectmanager_automation(driver);	
	public static Logger log=Logger.getLogger(TestNG_Automation_Runner.class);
	
	public static void main(String[] args) throws Throwable  {
		PropertyConfigurator.configure("log4j.properties");
		
		
		 String url = File_Reader_Automation.get_instance_FRM().get_instance_CR().get_config_url();
		 geturl(url);
		
		
		 implicitwait(10, TimeUnit.SECONDS);
		 driver.manage().window().maximize();
		 log.info("URL Succesfully launched");
		 
		 ClickonElement(pom.getinstancehp1().getHome1());
		
		 String email = File_Reader_Automation.get_instance_FRM().get_instance_CR().get_config_email();
		 invalueelement(pom.getinstancehp2().getMail(),email);
		 
		 String pass = File_Reader_Automation.get_instance_FRM().get_instance_CR().get_config_pass();
         invalueelement(pom.getinstancehp2().getPass(),pass);
		
		 String signin = File_Reader_Automation.get_instance_FRM().get_instance_CR().get_config_signin();
		 ClickonElement(pom.getinstancehp2().getSignin());
		 
		 log.info("Login credentials entered successfully");
		
		 sleep(2000);
		 ClickonElement(pom.getinstancehp3().getHome2());
	   
	     //product1
	     ClickonElement(pom.getinstancep1().getDress1());
	     ClickonElement(pom.getinstancep1().getQuan1());
	     dropdown("byvalue","2" , 0, pom.getinstancep1().getSize1());
	     ClickonElement(pom.getinstancep1().getColor1());
	     ClickonElement(pom.getinstancep1().getCart1());
	     ClickonElement(pom.getinstancep1().getClose());
	     log.info("Women Dress1 purchased");	    
	   //Homepage4
	   
	     ClickonElement(pom.getinstancehp4().getHome3());
	    
	   sleep(1000);
	   //product2
	  
	     ClickonElement(pom.getinstancep2().getDress2());
	     dropdown("byvalue", "3", 0, pom.getinstancep2().getSize2());
	     ClickonElement(pom.getinstancep2().getColor());
	     ClickonElement(pom.getinstancep2().getCart2());
	     ClickonElement(pom.getinstancep2().getProceed1());
	    log.info("Women Dress2 purchased");
	    
	    //proceed1 
	    ClickonElement(pom.getinstancepc1().getProceed1());
	   
	    //proceed2 
	     sleep(2000);
	  
	    invalueelement(pom.getinstancepc2().getMess(), Automation_test_data(30, 5));
	      
	    ClickonElement(pom.getinstancepc2().getProceed2());
	   
	   //proceed3
	  
	   ClickonElement(pom.getinstancepc3().getCheck());
	   ClickonElement(pom.getinstancepc3().getProceed3());
	   
	   //bank
		
	   ClickonElement(pom.getinstanceb().getBank());
		
		screenshot("E:\\Users\\pc-com\\eclipse-workspace\\Maven1\\Screenshotmaven\\snap2.png");
		
	   //confirm
		
	   ClickonElement(pom.getinstancec1().getConfirm());
	   log.info("Order confirmed");
		
	   //back
		
	    ClickonElement(pom.getinstanceb1().getBack());
		
		//logout
		
		action(pom.getinstancelg().getMove(), "moveToElement");
		screenshot("E:\\Users\\pc-com\\eclipse-workspace\\Maven1\\Screenshotmaven\\snap3.png");
		 
		ClickonElement(pom.getinstancelg().getLogout());
		log.info("Successfully logged out");
		
		//sign in
		 invalueelement(pom.getinstancehp2().getMail(),email);
        invalueelement(pom.getinstancehp2().getPass(),pass);
		ClickonElement(pom.getinstancehp2().getSignin());
        log.info("Signin For Dresses");
		
		//dress_page
		
	    ClickonElement(pom.getinstancedpage().getDresspage());
	   
	    
	   //dress_product
	     ClickonElement(pom.getinstancedp().getDress());
	     ClickonElement(pom.getinstancedp().getQuantity());
	     dropdown("byvalue","2", 0, pom.getinstancedp().getSize());
	     ClickonElement(pom.getinstancedp().getCart());
	     ClickonElement(pom.getinstancedp().getProceed());
	     log.info("Dress purchased");
	     
	    //dress proceed1
	     ClickonElement(pom.getinstancepc1().getProceed1());
	    		
	   //dress proceed2 
		  sleep(2000);
		  
		  invalueelement(pom.getinstancepc2().getMess(),"Get As Soon As Possible");
		      
		  ClickonElement(pom.getinstancepc2().getProceed2());
		   
		  //dress proceed3
		  
		  ClickonElement(pom.getinstancepc3().getCheck());
		  ClickonElement(pom.getinstancepc3().getProceed3());
		   
		  //dress bank
			
		  ClickonElement(pom.getinstanceb().getBank());
			
			//dress confirm
			
	      ClickonElement(pom.getinstancec1().getConfirm());
		  log.info("dress product Order confirmed");
			
			//dress back
			
		  ClickonElement(pom.getinstanceb1().getBack());
				
		  ClickonElement(pom.getinstancelg().getLogout());
		  log.info("logged out for dress product");
	   
	
	
	      //signin for tshirt
	      invalueelement(pom.getinstancehp2().getMail(),email);
          invalueelement(pom.getinstancehp2().getPass(),pass);
	      ClickonElement(pom.getinstancehp2().getSignin());
          log.info("Signin For Tshirts");
	
          //tshirt_page
         
          ClickonElement(pom.getinstancets().getTshirt());
          
          
          //tshirt_product
          ClickonElement(pom.getinstancetp1().getTshirt());
          ClickonElement(pom.getinstancetp1().getQuan());
          dropdown("byvalue", "2", 0, pom.getinstancetp1().getSize());
          ClickonElement(pom.getinstancetp1().getColor());
          ClickonElement(pom.getinstancetp1().getCart());
          ClickonElement(pom.getinstancetp1().getProceed());
          log.info("Tshirt purchased");
          
          //tshirt proceed1
 	      ClickonElement(pom.getinstancepc1().getProceed1());
 	    		
 	      //tshirt proceed2 
 		   sleep(2000);
 		  
 		  invalueelement(pom.getinstancepc2().getMess(),"Immediate Requirement");
 		      
 		  ClickonElement(pom.getinstancepc2().getProceed2());
 		   
 		  //tshirt proceed3
 		  
 		  ClickonElement(pom.getinstancepc3().getCheck());
 		  ClickonElement(pom.getinstancepc3().getProceed3());
 		   
 		  //tshirt bank
 			
 		  ClickonElement(pom.getinstanceb().getBank());
 			
 			//tshirt confirm
 			
 		  ClickonElement(pom.getinstancec1().getConfirm());
 		  log.info("Tshirt product Order confirmed");
 			
 		  //tshirt back
 			
 	      ClickonElement(pom.getinstanceb1().getBack());
 		  ClickonElement(pom.getinstancelg().getLogout());
 		log.info("logged out for Tshirt product");
 	   
 	
          
          
          
}}
