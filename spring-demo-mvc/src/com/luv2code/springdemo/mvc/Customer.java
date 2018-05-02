package com.luv2code.springdemo.mvc;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.Length;
import org.springframework.lang.NonNull;

import com.sun.istack.internal.NotNull;

public class Customer {
	@javax.validation.constraints.NotNull(message = "field should be populated")
	@Length(min = 1, max = 20, message = "enter between 1 and 20 characters")
	String firstName;

	@javax.validation.constraints.NotNull(message = "field should be populated")
	@Length(min = 1, max = 20, message = "enter between 1 and 20 characters")
	String lasttName;

	@javax.validation.constraints.NotNull(message = "required field")
	@Min(value = 0, message = "the number can't be lower than 0")
	@Max(value = 10, message = "the number can't be higher  than 10")
	Integer passes;

	@NotBlank()
	// @javax.validation.constraints.NotNull(message="required field")
	@Pattern(regexp = "^[a-zA-Z0-9] {5}", message = "only 5 digts/numbers allowed")
	String postalCode;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLasttName() {
		return lasttName;
	}

	public void setLasttName(String lasttName) {
		this.lasttName = lasttName;
	}

	public Integer getPasses() {
		return passes;
	}

	public void setPasses(Integer passes) {
		this.passes = passes;
	}

	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

}
