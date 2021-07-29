package com.monkeycap.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InsureNewCar {
	@FindBy(xpath="//a[text()='Insure New CAR']")
	private WebElement insurecar;
	
	@FindBy(xpath="//input[@placeholder='Enter City']")
	private WebElement entercity;
	
	@FindBy(xpath="//button[text()='AN-01 - Port Blair']")
	private WebElement selectcity;
	
	@FindBy(id="input")
	private WebElement vehicleName;
	
	@FindBy(xpath="//button[text()='HONDA CITY']")
	private WebElement hondacity;
	
	@FindBy(id="input")
	private WebElement fuletype;
	
	@FindBy(xpath="//button[text()='PETROL']")
	private WebElement petrol;
	
	@FindBy(id="input")
	private WebElement carVarient;
	
	@FindBy(xpath="//button[text()='1.5 V MT INSPIRE 1497']")
	private WebElement vMTinspire;
	
	@FindBy(id="input")
	private WebElement mfgyear;
	
	@FindBy(xpath="//button[text()='2020']")
	private WebElement year;
	
	@FindBy(xpath="//span[text()='NEXT']")
	private WebElement nextButton;
	
	/*
	 * @FindBy(xpath="//span[text()='NEXT']") private WebElement rdnextButton;
	 */
	
	@FindBy(xpath="//span[text()='SUBMIT']")
	private WebElement submitButton;
	
	public InsureNewCar(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void insurecarDetails() throws Throwable {
		insurecar.click();
		entercity.click();
		selectcity.click();
		vehicleName.click();
		hondacity.click();
		fuletype.click();
		petrol.click();
		carVarient.click();
		vMTinspire.click();
		mfgyear.click();
		year.click();
		nextButton.click();
		submitButton.click();
	}

}
