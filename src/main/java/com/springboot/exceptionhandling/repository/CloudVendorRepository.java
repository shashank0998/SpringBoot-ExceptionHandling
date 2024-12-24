package com.springboot.exceptionhandling.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.exceptionhandling.entity.CloudVendor;

public interface CloudVendorRepository extends JpaRepository<CloudVendor, String>{

}
