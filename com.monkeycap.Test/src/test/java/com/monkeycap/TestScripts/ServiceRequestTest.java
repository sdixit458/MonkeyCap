package com.monkeycap.TestScripts;

import org.testng.annotations.Test;

import com.monkeycap.GenericsUlits.BaseClass;
import com.monkeycap.ObjectRepository.NewServiceRequest;
import com.monkeycap.ObjectRepository.ServiceRequest;

public class ServiceRequestTest extends BaseClass {
	@Test
	public void servicerequestDetails() throws Throwable {
		ServiceRequest SR=new ServiceRequest(driver);
		SR.servicerequestdetails();
		NewServiceRequest NSR=new NewServiceRequest(driver);
		NSR.newservicerequestdetails();
	}
}
