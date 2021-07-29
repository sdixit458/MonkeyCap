package com.monkeycap.TestScripts;
import org.testng.annotations.Test;
import com.monkeycap.GenericsUlits.BaseClass;
import com.monkeycap.ObjectRepository.GetQuotesOfCar;

public class getQuoteOfCarTest extends BaseClass{
	@Test
	public void quote() throws Throwable {
		GetQuotesOfCar GQL=new GetQuotesOfCar(driver);
		GQL.productlist();
	}

}
