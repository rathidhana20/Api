package com.testng.features;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class Retry_Class implements IRetryAnalyzer {

   int start =1;
   int stop =4;
   
	@Override
	public boolean retry(ITestResult result) {
			
		if (start<=stop) {
			
			start++;
			return true;
			
		}
		return false;
	}
	

}
