package com.springboot.exceptionhandling.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="cloud_vendor_info")
/* @ApiModel(description = "this table holds cloud vendor information") */
public class CloudVendor 
{
	@Id
	/*
	 * @ApiModelProperty(notes = "this is a cloud vendor id. it shall be unique.")
	 */
	private String vendorId;
	private String vendroeName;
	private String vendorAddress;
	private String vendorPhoneNumber;
}
