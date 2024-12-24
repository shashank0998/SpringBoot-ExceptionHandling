package com.springboot.exceptionhandling.service;

import java.util.List;

import com.springboot.exceptionhandling.entity.CloudVendor;

public interface CloudVendorService {

	public String createCloudVendor(CloudVendor cloudVendor);

	public String updateCloudVector(CloudVendor cloudVendor);

	public String deleteCloudVendor(String vendorId); 

	public CloudVendor getCloudVendor(String vendorId);

	public List<CloudVendor> getAllCloudVendor();
	
}
