package com.automation.facebook;
import org.testng.Reporter;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.objectrepository.tests.ObjectRepository;
import com.panels.tests.Panel;

public class FBLogin extends Panel{

	@Test
	@Parameters({"strDatalocation","strDatasheet","Browser"})
	public void TestSetup(String strDatalocation,String strDatasheet,String Browser){
		
		FBLogin fl=new FBLogin(); 
		try{
			fl.setup(strDatalocation, strDatasheet, Browser);
			fl.test();
			fl.test1();
			driver.quit();
			Reporter.log("Test Script pass");
		}catch(Exception e){
			e.printStackTrace();
			Reporter.log(" Test Script failed");
		}
}
	
	public void test()  throws Exception {
		
		driver.get("https://www.facebook.com");
		
       textfield.findByXpath(ObjectRepository.fbuser);		
		
		data.setActiveSheet("Yahoo");
		
		Reporter.log(" facebook user name entered in the text box");
		
		textfield.setValue(data.getIterationData("UserName", 1));
		
		Thread.sleep(5000);		
		
		textfield.findByXpath(ObjectRepository.fbpwd);		
		
		textfield.setValue(data.getIterationData("Password", 1));		
		
		Reporter.log("Password entered in the text box");		
		
		Thread.sleep(3000);
		
		button.findByXpath(ObjectRepository.fblog);		
		
		button.click();
		
		Reporter.log("Clicked on sign in Button");
		
		Thread.sleep(4000);
//		
//	    button.findByXpath(ObjectRepository.forgotPwd);	    
//	   
//	    button.click();
//	    
//	    Reporter.log("forgot pwd link is clicked");		
//		
		}	
public void test1()  throws Exception {
		
		driver.get("https://www.facebook.com");
		
       textfield.findByXpath(ObjectRepository.fbuser);		
		
		data.setActiveSheet("Yahoo");
		
		Reporter.log(" facebook user name entered in the text box");
		
		textfield.setValue(data.getIterationData("UserName", 1));
		
		Thread.sleep(5000);		
		
		textfield.findByXpath(ObjectRepository.fbpwd);		
		
		textfield.setValue(data.getIterationData("Password", 1));		
		
		Reporter.log("Password entered in the text box");		
		
		Thread.sleep(3000);
		
		button.findByXpath(ObjectRepository.fblog);		
		
		button.click();
		
		Reporter.log("Clicked on sign in Button");
		
		Thread.sleep(4000);
//		
//	    button.findByXpath(ObjectRepository.forgotPwd);	    
//	   
//	    button.click();
//	    
//	    Reporter.log("forgot pwd link is clicked");		
//		
		}		
		
		
		}

