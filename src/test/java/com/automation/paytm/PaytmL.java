package com.automation.paytm;

import org.testng.Reporter;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.objectrepository.tests.ObjectRepository;
import com.panels.tests.Panel;

public class PaytmL extends Panel{
	
	@Test
	@Parameters({"strDatalocation","strDatasheet","Browser"})
	public void TestSetup(String strDatalocation,String strDatasheet,String Browser){
		
		PaytmL gl=new PaytmL(); 
		try{
			gl.setup(strDatalocation, strDatasheet, Browser);
			gl.test();
			driver.quit();
			Reporter.log("Test Script pass");
		}catch(Exception e){
			e.printStackTrace();
			Reporter.log(" Test Script fail");
		}
}
	
	public void test()  throws Exception {
		
		driver.get("https://www.paytm.com");		
      
		button.findByXpath(ObjectRepository.login);
		
		Reporter.log("login button is clicked");
		
		button.click();
		
		Thread.sleep(5000);		
		
		textfield.findByXpath(ObjectRepository.mobilenum);	
		
		textfield.setValue(data.getIterationData("mobileno", 1));		
		
		Reporter.log("mobileno entered in the text box");		
		
		Thread.sleep(3000);
		
		
        textfield.findByXpath(ObjectRepository.password);	
		
		textfield.setValue(data.getIterationData("paytmpwd",1));		
		
		Reporter.log("paytmpwd entered in the text box");		
		
		Thread.sleep(3000);		
		
		button.findByXpath(ObjectRepository.securelogin);	
		
		button.click();
		
		Reporter.log("Clicked on sign in Button");
		
		Thread.sleep(4000);
		
	    
		
		}
}
