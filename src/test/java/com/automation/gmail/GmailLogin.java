package com.automation.gmail;
import org.testng.Reporter;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.objectrepository.tests.ObjectRepository;
import com.panels.tests.Panel;

public class GmailLogin extends Panel{
	
	@Test
	@Parameters({"strDatalocation","strDatasheet","Browser"})
	public void TestSetup(String strDatalocation,String strDatasheet,String Browser){
		
		GmailLogin gl=new GmailLogin(); 
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
				
		driver.get("https://www.gmail.com");
		
			textfield.findByXpath(ObjectRepository.emailid);			
			
			data.setActiveSheet("Gmail");
			
			Reporter.log(" gmail user name entered in the text box");
			
			textfield.setValue(data.getIterationData("UserName", 1));
			
			Thread.sleep(2000);
			
			button.findByXpath(ObjectRepository.nextbutton);
						
			button.click();
			
			Thread.sleep(5000);	
			
			Reporter.log("Next button i sclicked");					
			
			textfield.findByXpath(ObjectRepository.gpwd);			
			
			textfield.setValue(data.getIterationData("Password", 1));
			
			Thread.sleep(3000);
			
			Reporter.log("Password entered in the text box");			
			
			button.findByXpath(ObjectRepository.loginnext);		
			
			button.click();
			
			Reporter.log("Clicked on sign in Button");
			
			Thread.sleep(4000);
			
		    		
			
			}
	

		
		}

