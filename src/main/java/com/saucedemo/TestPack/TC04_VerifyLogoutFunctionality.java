package com.saucedemo.TestPack;


import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;



public class TC04_VerifyLogoutFunctionality extends testBaseClass
{

	@Test
	public void verifyLogoutFunctionality() 
	{
		
		
		log.info("Applying validation");
		
		String ExpectedResult ="https://www.saucedemo.com/inventory.html";
		//String ExpectedResult ="https://www.saucedemo.com/";//wrong result
		
		String actualResult=driver.getCurrentUrl();
		System.out.println("Actual URL-->"+actualResult);
		
		Assert.assertEquals(ExpectedResult, actualResult,"Why we are getting error-->");
		
		

	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
