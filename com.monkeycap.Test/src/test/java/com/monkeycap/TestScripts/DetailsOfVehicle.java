package com.monkeycap.TestScripts;

import org.testng.annotations.Test;

import com.monkeycap.GenericsUlits.BaseClass;
import com.monkeycap.ObjectRepository.GetQuotesOfCar;
import com.monkeycap.ObjectRepository.VehicleDetails;

public class DetailsOfVehicle extends BaseClass{
	@Test
	public void detailsofvehicle() throws Throwable {
		GetQuotesOfCar GQC =new GetQuotesOfCar(driver);
		GQC.productlist();
		VehicleDetails VD=new VehicleDetails(driver);
		VD.detailsOfVehicle();
	}

}
