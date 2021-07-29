package com.monkeycap.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.monkeycap.GenericsUlits.ExcelLibrary;
import com.monkeycap.GenericsUlits.IPathConstant;

public class GetQuotesOfCar implements IPathConstant{
	@FindBy(xpath = "//span[text()='PRODUCTS']")
	private WebElement product;
	
	@FindBy(xpath="//button[.='Car']")
	private WebElement car;
	
	@FindBy(id="homecarno")
	private WebElement vehicleno;
	
	@FindBy(xpath="//button[text()='Get Quotes >']")
	private WebElement getQuoteButton;
	
	public GetQuotesOfCar(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void productlist() throws Exception {
		product.click();
		car.click();
		vehicleno.sendKeys(ExcelLibrary.getcellvalue(excel_path, sheet_name, 1,2));
		getQuoteButton.click();
	}

}
