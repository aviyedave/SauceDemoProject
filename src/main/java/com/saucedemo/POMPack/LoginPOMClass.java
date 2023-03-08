package com.saucedemo.POMPack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPOMClass 
{
    //1.WebDriver Globally declared
	//2.find element by @FindBy
	//3.Element Action perform in method
	//4.constructor create
	
	private WebDriver driver;
	@FindBy(xpath="//input[@id='user-name']")
	private WebElement username;
	
	public void sendUsername()
	{
		username.sendKeys("standard_user");
	}
	
	
	@FindBy(xpath="//input[@id='password']")
	private WebElement password;
	
	public void sendpassword()
	{
		password.sendKeys("secret_sauce");
	}
	
	
	@FindBy(xpath="//input[@id='login-button']")
	private WebElement logInBtn;
	
	public void clicklogInBtn()
	{
		logInBtn.click();
	}
	
	public LoginPOMClass(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		

	}
	
	
	
	
	
}
