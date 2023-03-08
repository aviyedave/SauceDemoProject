package com.saucedemo.TestPack;

import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import com.saucedemo.POMPack.HomePagePOMClass;
import com.saucedemo.POMPack.LoginPOMClass;
import com.saucedemo.UtilityPack.UtilityClass;

public class testBaseClass
{
	WebDriver driver;

	Logger log=Logger.getLogger("SauceDemo-15oct-Project");
	
	@Parameters("browserName")
	@BeforeClass
	public void beforeClass(String browserName) throws IOException
	{
		if(browserName.equals("chrome"))
		{
			//chromeDriver
			System.setProperty("webdriver.chrome.driver",
					"D:\\selenium\\chromedriver_win32 (2)\\chromedriver.exe");
			driver =  new ChromeDriver();
		}
		else
		{
			//fireFoxDriver
			System.setProperty("webdriver.gecko.driver",
			         "D:\\selenium\\geckodriver-v0.32.0-win64\\geckodriver.exe");
			driver =  new FirefoxDriver();

		}

		PropertyConfigurator.configure("log4j.properties");
		log.info("Browser is opened");
		
		driver.manage().window().maximize();
		log.info("Browser is maximized");

		driver.get("https://www.saucedemo.com/");
		log.info("URL is Opened");

		UtilityClass.screenShotMethod(driver, "1.TC01_Login_Page");
		log.info("Screenshot is taken");

		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	}



	@BeforeMethod
	public void setUp() throws IOException
	{
		
		LoginPOMClass lp = new LoginPOMClass(driver);

		lp.sendUsername();
		log.info("username is entered");

		lp.sendpassword();
		log.info("Password is entered");

		lp.clicklogInBtn();
		log.info("login btn is clicked");

		log.info("Went to home page");
		UtilityClass.screenShotMethod(driver, "2.TC01_Home_Page");
		log.info("Screenshot is taken");
	}


	@AfterMethod
	public void tearDown()
	{
		HomePagePOMClass hp=new HomePagePOMClass(driver);

		hp.clickMainbtn();
		log.info("Main btn is clicked");

		hp.clicklogOutBtn();
		log.info("LogOut btn is clicked");

		log.info("LoginPage Opened");
			
	}

	@AfterClass
	public void afterClass()
	{
		driver.quit();
		log.info("Browser is closed");
		log.info("End Of Program");
	}






}
