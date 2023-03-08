package com.saucedemo.TestPack;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.saucedemo.POMPack.HomePagePOMClass;

public class TC03_VerifyAllPrdtAddToCartFunctionality extends testBaseClass
{ 

	@Test
	public void verifyBagPrdtAddToCartFunctionality() throws IOException
	{
	
		HomePagePOMClass hp=new HomePagePOMClass(driver);
		
		hp.clickaddAllPrdt();
		log.info("addAllPrdt is clicked");
		
		String expectedText="6";
		
		String actualPrdtSelected=hp.getText();
		
		SoftAssert sa=new SoftAssert();
		
		sa.assertEquals(expectedText, actualPrdtSelected);
	sa.assertAll();
		
		
		
		
		
		
		
		
		
		
		

	}

}
