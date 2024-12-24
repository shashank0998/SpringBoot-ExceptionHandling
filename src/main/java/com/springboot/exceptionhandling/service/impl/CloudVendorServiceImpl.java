package com.springboot.exceptionhandling.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.springboot.exceptionhandling.entity.CloudVendor;
import com.springboot.exceptionhandling.exception.CloudVendorNotFoundException;
import com.springboot.exceptionhandling.repository.CloudVendorRepository;
import com.springboot.exceptionhandling.service.CloudVendorService;

@Service
public class CloudVendorServiceImpl implements CloudVendorService
{
	
	CloudVendorRepository cloudVendorRepository;

	public CloudVendorServiceImpl(CloudVendorRepository cloudVendorRepository) 
	{
		
		this.cloudVendorRepository = cloudVendorRepository;
	}

	@Override
	public String createCloudVendor(CloudVendor cloudVendor) {
		cloudVendorRepository.save(cloudVendor);
		return "create successfully";
	}

	@Override
	public String updateCloudVector(CloudVendor cloudVendor) {
		cloudVendorRepository.save(cloudVendor);
		return "updated successfully";
	}

	@Override
	public String deleteCloudVendor(String vendorId) {
		cloudVendorRepository.deleteById(vendorId);
		return "deleted successfully";
	}

	@Override
	public CloudVendor getCloudVendor(String vendorId) 
	{
		if(cloudVendorRepository.findById(vendorId).isEmpty())
			throw new CloudVendorNotFoundException("Requested Cloud Vendor Does not Exist");
		return cloudVendorRepository.findById(vendorId).get();
	}

	@Override
	public List<CloudVendor> getAllCloudVendor() {
		
		return cloudVendorRepository.findAll();
	}

}
