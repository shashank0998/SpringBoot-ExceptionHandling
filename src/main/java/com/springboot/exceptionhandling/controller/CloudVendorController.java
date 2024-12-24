package com.springboot.exceptionhandling.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.exceptionhandling.entity.CloudVendor;
import com.springboot.exceptionhandling.service.CloudVendorService;

@RestController
@RequestMapping("/cloudvendor")
public class CloudVendorController 
{
	CloudVendorService cloudVendorService;
	
	public CloudVendorController(CloudVendorService cloudVendorService)
	{
		this.cloudVendorService = cloudVendorService;
	}
	
	
	//Read specific cloud vendor details from db
	@GetMapping("{vendorId}")
	public CloudVendor getCloudVendorDetails(@PathVariable("vendorId") String vendorId)
	{
		return cloudVendorService.getCloudVendor(vendorId);
	}
	
	
	//Read all cloud vendor details for db
	@GetMapping()
	public List<CloudVendor> getAllCloudVendorDetails()
	{
		return cloudVendorService.getAllCloudVendor();
	}
	
	@PostMapping()
	public String createCloudVendorDetails(@RequestBody CloudVendor cloudVendor)
	{
		cloudVendorService.createCloudVendor(cloudVendor);
		return "Cloud vendor created successfully";
	}
	
	@PutMapping()
	public String updateCloudDetails(@RequestBody CloudVendor cloudVendor)
	{
		cloudVendorService.updateCloudVector(cloudVendor);
		return "cloud vendor updated successfully";
	}
	
	@DeleteMapping("{vendorId}")
	public String deleteCloudVendorDetails(@PathVariable("vendorId") String vendorId)
	{
		cloudVendorService.deleteCloudVendor(vendorId);
		return "cloud vendor deleted successfully";
	}
	
}
