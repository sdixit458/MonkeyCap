package com.monkeycap.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.monkeycap.GenericsUlits.ExcelLibrary;
import com.monkeycap.GenericsUlits.IPathConstant;

public class NewServiceRequest implements IPathConstant{
	@FindBy(xpath="//div[@aria-labelledby='Category ']")
	private WebElement category;
	
	@FindBy(xpath="//li[text()='Login']")
	private WebElement login;
	
	@FindBy(xpath="//div[@aria-labelledby='Sub Category ']")
	private WebElement subcategory;
	
	@FindBy(xpath="//li[text()='OTP not received']")
	private WebElement otpnotrecived;
	
	@FindBy(xpath="//input[@type='email']")
	private WebElement emailLink;
	
	@FindBy(xpath="//input[@type='text']")
	private WebElement mob;
	
	@FindBy(xpath="//span[text()='SUBMIT']")
	private WebElement submitButton;
	
	public NewServiceRequest(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void newservicerequestdetails() throws Throwable {
		category.click();
		login.click();
		subcategory.click();
		otpnotrecived.click();
		emailLink.sendKeys(ExcelLibrary.getcellvalue(excel_path, sheet_name, 4, 1));
		mob.sendKeys(ExcelLibrary.getcellvalue(excel_path, sheet_name, 4, 2));
		submitButton.click();
	}


}
