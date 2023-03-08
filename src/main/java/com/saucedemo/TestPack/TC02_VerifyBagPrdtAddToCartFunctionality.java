package com.saucedemo.TestPack;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.saucedemo.POMPack.HomePagePOMClass;



public class TC02_VerifyBagPrdtAddToCartFunctionality extends testBaseClass
{

	@Test
	public void verifyBagPrdtAddToCartFunctionality() throws IOException
	{
		
		String expectedtittle="Swag Labs";

		HomePagePOMClass hp=new HomePagePOMClass(driver);
		
		hp.clickaddtoCartprdt1();
		log.info("prdt added to cart");
		
		log.info("Applying validation");
		
		String expectedText="1";
		
		String actualPrdtSelected=hp.getText();
		
		Assert.assertEquals(expectedText, actualPrdtSelected);
		
		
		

	}

}
