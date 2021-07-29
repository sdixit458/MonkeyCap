package com.monkeycap.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ServiceRequest {
	@FindBy(xpath="//div[@class='Div-sc-1k1pj6y-0 Grid-sc-77ibbl-0 dKvaug myaccountlogo']")
	private WebElement profile;
	
	@FindBy(xpath="//button[text()='Service Request']")
	private WebElement servicerequestlink;
	
	public ServiceRequest(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void servicerequestdetails() throws Throwable {
		profile.click();
		servicerequestlink.click();

	}

}
