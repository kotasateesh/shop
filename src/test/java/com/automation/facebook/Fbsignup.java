package com.automation.facebook;

import java.io.IOException;

import org.testng.Reporter;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.objectrepository.tests.ObjectRepository;
import com.panels.tests.Panel;

public class Fbsignup extends Panel{
	
	@Test
	@Parameters({"strDatalocation","strDatasheet","Browser"})
	public void TestSetup(String strDatalocation,String strDatasheet,String Browser){
		
		Fbsignup fb=new Fbsignup(); 
		try{
			fb.setup(strDatalocation, strDatasheet, Browser);
			fb.facebookSignup();
			driver.quit();
			Reporter.log("Test Script pass");
		}catch(Exception e){
			e.printStackTrace();
			Reporter.log(" Test Script fail");
		}
	}

	public void facebookSignup() throws IOException, InterruptedException {
		{
			driver.get("https://www.facebook.com/");
			
//button.findByXpath(ObjectRepository.fbsignup);
			
			data.setActiveSheet("facebook");
			
//			Reporter.log(" Sign up is clicked"); 			
						
			textfield.findByXpath(ObjectRepository.firstname);		
					
            textfield.setValue(data.getIterationData("firstname",1));
            
            Reporter.log("firstname  entered in the text box");
            
            Thread.sleep(2000);
		
            textfield.findByXpath(ObjectRepository.surname);
			
			textfield.setValue(data.getIterationData("surname",1));	
			
			Reporter.log("surname  entered in the text box");
			
			Thread.sleep(2000);
			
            textfield.findByXpath(ObjectRepository.mobileno);
			
			textfield.setValue(data.getIterationData("MobileorEmail",1));	
			
			Reporter.log("mobile no  entered in the text box");
			
			Thread.sleep(2000);
			
            textfield.findByXpath(ObjectRepository.newpassword);
			
			textfield.setValue(data.getIterationData("Newpassword",1));	
			
			Reporter.log("Newpassword entered in the text box");
			
			Thread.sleep(2000);		
			
			select.findByXpath(ObjectRepository.day);

			select.selectDropdownValueBasedOnValue(data.getIterationData("day",1));
			
			Thread.sleep(2000);			
			
			select.findByXpath(ObjectRepository.month);

			select.selectDropdownValueBasedOnValue(data.getIterationData("month",1));
			
			Thread.sleep(2000);	
			
			select.findByXpath(ObjectRepository.year);

			select.selectDropdownValueBasedOnValue(data.getIterationData("year",1));
			
			Thread.sleep(2000);	
			
			button.findByXpath(ObjectRepository.male);
			
			button.click();
			
			Thread.sleep(2000);
			
//            button.findByXpath(ObjectRepository.female);
//			
//			button.click();
//			
//			Thread.sleep(2000);
			
			
            button.findByXpath(ObjectRepository.createacc);
			
			button.click();
			
			Thread.sleep(2000);
			
			Reporter.log("Newpassword entered in the text box");
			
			Thread.sleep(2000);
			
			
			
		}
	}
}	
	
	
	
	
	
	