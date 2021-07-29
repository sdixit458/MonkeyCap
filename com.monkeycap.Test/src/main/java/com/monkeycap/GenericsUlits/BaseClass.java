package com.monkeycap.GenericsUlits;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseClass implements IPathConstant{
	public WebDriver driver;
	
	@BeforeMethod
	public void openbrowser() {
		System.setProperty(chrome_key,chrome_value);
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get(url);
	}
	
	@AfterMethod
	public void closebrowser() {
		driver.quit();
	}

}
