package com.pagemanager;

import org.openqa.selenium.WebDriver;

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
public class Pageobjectmanager_automation {
	public WebDriver driver;
	private Homepage1 hp1;
	private Homepage2 hp2;
	private Women_Page1 hp3;
	private Women_Page2 hp4;
	private Women_Product1 p1;
	private Women_Product2 p2;
	private Proceed1 pc1;
	private Proceed2 pc2;
	private Proceed3 pc3;
	private Bank b;
	private Confirm c1;
	private Back b1;
	private Logout lg;
	private Dresses_Product1 dp;
	private Dresses_page dpage;
	private Tshirt_Page ts;
	private Tshirt_Product tp1;
	
	
	
	
	
	public Pageobjectmanager_automation(WebDriver driver2) {
		
		this.driver=driver2;
	}


	public Homepage1 getinstancehp1() {
		if (hp1==null) {
			hp1=new Homepage1(driver);	
		}
		return hp1;
		

	}
	
	public Homepage2 getinstancehp2() {
		if (hp2==null) {
			hp2=new Homepage2(driver);
		}
		
		return hp2;

		
	}
     public Women_Page1 getinstancehp3() {
    	 if (hp3==null) {
    		 hp3= new Women_Page1(driver);
		}
		return hp3;

	}
     public Women_Product1 getinstancep1() {
    	 if (p1==null) {
    		 p1=new Women_Product1(driver);
		}
    	 return p1;
    	 
		

	}
     
     public Women_Page2 getinstancehp4() {
    	if (hp4==null) {
    		 hp4=new Women_Page2(driver);
		}
	  return hp4;

	}
     public Women_Product2 getinstancep2() {
		if (p2==null) {
			p2=new Women_Product2(driver);
		}
		return p2;
}
     public Proceed1 getinstancepc1() {
    	if (pc1==null) {
    		 pc1= new Proceed1(driver);
		}
		return pc1;

	}
   
     public Proceed2 getinstancepc2() {
		if (pc2==null) {
			pc2= new Proceed2(driver);
		}
				return pc2;
		

	}
      public Proceed3 getinstancepc3() {
		if (pc3==null) {
			pc3=new Proceed3(driver);
		}
		return pc3;

	}
      
      public Bank getinstanceb() {
    	 if (b==null) {
    		 b= new Bank(driver);
			
		}
    	  return b;
		

	}
     
     public Confirm getinstancec1() {
		if (c1==null) {
			c1=new Confirm(driver);
		}
		return c1;
	}
     public Back getinstanceb1() {
		if (b1==null) {
			b1=new Back(driver);
			
		}
    	 return b1;

	}
     
     public Logout getinstancelg() {
    	 if (lg==null) {
    		 lg=new Logout(driver);
		}
		return lg;

	}
    
     
     public Dresses_page getinstancedpage() {
    	 if (dpage==null) {
    		 dpage=new Dresses_page(driver)
;
    		 
		}
		return dpage;

	}
     
     
     public  Dresses_Product1 getinstancedp()
     {
    	 if (dp==null) {

    		 dp=new Dresses_Product1(driver);
		}
		return dp;
     }
     
    public Tshirt_Page getinstancets() {
    	if (ts==null) {
    		ts=new Tshirt_Page(driver);
    		
		} 
    	return ts;

	}
     
   public Tshirt_Product getinstancetp1() {
		if (tp1==null) {
			tp1=new Tshirt_Product(driver);			
		}
       return tp1;
	}
}
