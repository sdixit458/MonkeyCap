package com.monkeycap.TestScripts;

import org.testng.annotations.Test;

import com.monkeycap.GenericsUlits.BaseClass;
import com.monkeycap.ObjectRepository.InsureNewCar;

public class InsureNewCarTest extends BaseClass {
	@Test
	public void newcar() throws Throwable {
		InsureNewCar INC=new InsureNewCar(driver);
		INC.insurecarDetails();
	}

}
