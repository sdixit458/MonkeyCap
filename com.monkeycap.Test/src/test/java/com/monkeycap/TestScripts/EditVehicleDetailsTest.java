package com.monkeycap.TestScripts;

import org.testng.annotations.Test;

import com.monkeycap.GenericsUlits.BaseClass;
import com.monkeycap.ObjectRepository.GetQuotesOfCar;
import com.monkeycap.ObjectRepository.VehicleDetails;

public class EditVehicleDetailsTest extends BaseClass{
	@Test
	public void editvehicle() throws Exception {
		GetQuotesOfCar GQC=new GetQuotesOfCar(driver);
		GQC.productlist();
		VehicleDetails VD=new VehicleDetails(driver);
		VD.editVehicleDetail();
		GQC.productlist();
	}

}
