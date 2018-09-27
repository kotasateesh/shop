package com.objectrepository.tests;

public class ObjectRepository { 
	
	
//............yahoo Login xpaths.......................	
	
public static String yahooun=".//*[@id='login-username']",
                     yahoopwd=".//*[@id='login-passwd']",
                     next=".//*[@id='login-signin']",
                     signin=".//*[@id='login-signin']",
                     forgotPwd=".//*[@id='mbr-forgot-link']";




//................Facebook login......................


 public static String fbuser=".//*[@id='email']",
                      fbpwd =" .//*[@id='pass']",
                      fblog=".//*[@id='u_0_q']";
 
 
//................Facebook sign up.........................
 
 public static String fbsignup=".//*[@id='reg-link']",
                      firstname=".//*[@id='u_0_1']",
                      surname=".//*[@id='u_0_3']",
                      mobileno=".//*[@id='u_0_6']",
                      newpassword=".//*[@id='u_0_d']",
                      day=".//*[@id='day']",
                      month=".//*[@id='month']",
                      year=".//*[@id='year']",
                      male =".//*[@id='u_0_h']",
                      female=".//*[@id='u_0_j']/span[1]/label",
                     createacc=".//*[@id='u_0_l']";



//..........................Paytm................................

public static String login=".//*[@id='app']/div/div[2]/div[2]/div[3]/div[3]/div", 
                     mobilenum=".//*[@id='input_0']",
                     password=".//*[@id='input_1']",
                     securelogin=".//*[@id='loginForm']/div/md-content/button[1]",
 PrepaidMno=".//*[@id='app']/div/div[3]/div/div[2]/div[1]/div[1]/div/div[1]/div[2]/ul/li[1]/div/div/input",
 Operator=".//*[@id='app']/div/div[3]/div/div[2]/div[1]/div[1]/div/div[1]/div[2]/ul/li[2]/div/div[1]/input";








//.........................chase...............

public static String loanpurpose=".//*[@id='ctl00_CenterContentPlaceHolder_CRQControl_loanTypeList']",
                     propertytype=".//*[@id='ctl00_CenterContentPlaceHolder_CRQControl_propertyTypeList']",
                     useofproperty=".//*[@id='ctl00_CenterContentPlaceHolder_CRQControl_propertyUsageList']",
                     state=".//*[@id='ctl00_CenterContentPlaceHolder_CRQControl_stateList']", 
                    priceofhome=".//*[@id='ctl00_CenterContentPlaceHolder_CRQControl_homePrice']",
                    downpayment=".//*[@id='ctl00_CenterContentPlaceHolder_CRQControl_downPayment']",
                    points=".//*[@id='ctl00_CenterContentPlaceHolder_CRQControl_pointsList']",
                    ficoscore=".//*[@id='ctl00_CenterContentPlaceHolder_CRQControl_ficoScore']",
                    getrate=".//*[@id='ctl00_CenterContentPlaceHolder_RateandPayment']";


//..........................gmail...................

public static String emailid=".//*[@id='identifierId']",
                      nextbutton=".//*[@id='identifierNext']/content/span",
                      gpwd=".//*[@id='password']/div[1]/div/div[1]/input",
                      loginnext=".//*[@id='passwordNext']/content/span";


public static ObjectRepository getConfiguration() {
	// TODO Auto-generated method stub
	return null;
}


public void getPropValues() {
	// TODO Auto-generated method stub
	
}

	 
 

}
