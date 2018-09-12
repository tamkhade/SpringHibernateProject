package com.jarvis.validation.model;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.model.Samplemodel;

public class Samplevalidator implements Validator {	
 public boolean supports(Class<?> cls) {

		return Samplemodel.class.isAssignableFrom(cls);
	}

	public void validate(Object object, Errors errors) {
		
		Samplemodel user = (Samplemodel) object;
		System.out.println("hiiii dear");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "firstname", "firstname.required");
		
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "lastname", "lastname.required");
	}		
}
