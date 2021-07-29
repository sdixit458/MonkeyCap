package com.monkeycap.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.monkeycap.GenericsUlits.WebDriverUtility;

public class VehicleDetails{
	WebDriver driver;
	@FindBy(xpath="//button[@class='Button__ButtonStyle-sc-1yeohzz-0 fdEjCU editbutton']")
	private WebElement editbutton;
	
	@FindBy(xpath="//button[text()='Clear']")
	private WebElement clearlink;
	
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
	
	@FindBy(xpath="//span[text()='NEXT']")
	private WebElement rdnextButton;
	
	@FindBy(xpath="//span[text()='NEXT']")
	private WebElement ednextButton;
	
	@FindBy(xpath="//label[@class='Label-h8duey-0 RadioBtnLabel__CheckBoxLabel-sc-5eqyud-0 RadioBtn__StyledRadioBtnLabel-yj8hcp-0 lglQuc isClaimed_yes']")
	private WebElement yescheckbox;
	
	@FindBy(xpath="(//label[@class='Label-h8duey-0 RadioBtnLabel__CheckBoxLabel-sc-5eqyud-0 RadioBtn__StyledRadioBtnLabel-yj8hcp-0 lglQuc ncbProt_radiobtn'])[1]")
	private WebElement ncbyescheckbox;
	
	@FindBy(xpath="//label[@class='Label-h8duey-0 RadioBtnLabel__CheckBoxLabel-sc-5eqyud-0 RadioBtn__StyledRadioBtnLabel-yj8hcp-0 lglQuc Ownership_yes']")
	private WebElement ownership;
	
	@FindBy(xpath="//span[text()='SUBMIT']")
	private WebElement submitButton;
	
	public VehicleDetails(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void editVehicleDetail() {
		
		editbutton.click();
		clearlink.click();
	}
	public void detailsOfVehicle() throws Throwable {
		vehicleName.click();
		hondacity.click();
		fuletype.click();
		petrol.click();
		carVarient.click();
		vMTinspire.click();
		mfgyear.click();
		year.click();
		nextButton.click();
		rdnextButton.click();
		ednextButton.click();
		yescheckbox.click();
		ncbyescheckbox.click();
		ownership.click();
		submitButton.click();
	}

}
