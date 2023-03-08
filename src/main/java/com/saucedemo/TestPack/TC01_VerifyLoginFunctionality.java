package com.saucedemo.TestPack;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;




public class TC01_VerifyLoginFunctionality extends testBaseClass
{

	@Test(priority=1)
	public void verifyLoginFunctionality() throws IOException
	{



		log.info("Apply verification");

		String expectedtittle="Swag Labs";

		String actualtittle= driver.getTitle();

		//HardAssertion-->Assert Class-->All method are static
	 //  Assert.assertEquals(expectedtittle, actualtittle);

	//SoftAssertion-->SoftAssert Class-->All method are Non-static

		SoftAssert sa=new SoftAssert();
		sa.assertEquals(expectedtittle, actualtittle);
		sa.assertAll();










	}

}
