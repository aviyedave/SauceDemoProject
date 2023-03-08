package com.saucedemo.POMPack;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class HomePagePOMClass 
{

	private WebDriver driver;
	//private Select s;
	
	
	//singlePrdtAddToCart
	@FindBy(xpath="//button[text()='Add to cart']")
	WebElement addtoCartprdt1 ;

	public void clickaddtoCartprdt1()
	{
		addtoCartprdt1.click();
	}
	
	@FindBy(xpath="//span[@class='shopping_cart_badge']")
	WebElement addtoCartprdtbtn ;
	
	public String getText()
	{
		String actualPrdtSelected=addtoCartprdtbtn.getText();
		return actualPrdtSelected;
	}
//------------------------	
	
	
	//allPrdtAddToCart
	@FindBy(xpath="//button[text()='Add to cart']")
	private List<WebElement> addAllPrdt;
	
	public void clickaddAllPrdt()
	{
		for(WebElement x:addAllPrdt)
		{
			x.click();
		}
		
	}

	
	
//--------------------------------------------	
	//logoutFunctionality
	@FindBy(xpath="//button[text()='Open Menu']")
	private WebElement mainBtn;

	public void clickMainbtn()
	{
		mainBtn.click();
	}

	@FindBy(xpath="//a[text()='Logout']")
	private WebElement logOutBtn;

	public void clicklogOutBtn()
	{
		
		logOutBtn.click();
	}

//-------------------------------	
	//Dropdowm Actions
	@FindBy(xpath="//select[@class='product_sort_container']")
	private WebElement dropDown;
	
	public void clickdropDown()
	{
		dropDown.click();
			
	//	s.selectByValue("lohi");
	}
//-------------------------------
	
	//constructor
	public HomePagePOMClass(WebDriver driver )
	{
		this.driver=driver;
		
		PageFactory.initElements(driver, this);
		//s=new Select(dropDown);
	}


	













}
