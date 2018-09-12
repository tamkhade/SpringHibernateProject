package com.kcs.validator;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.kcs.model.Employee;

public class EmployeeFormValidator implements Validator {
	// which objects can be validated by this validator
	// method of Validator interface
	// validates objects with class type

	/*
	 * EmployeeFormValidator is the validator implementation that is specific to
	 * Spring Framework. supports() method implementation by Spring Framework to
	 * know objects on which this validation can be used.
	 */
	public boolean supports(Class<?> paramClass) 
	{
		return Employee.class.isAssignableFrom(paramClass);
	}

	// method to valdiate all fields of form

	/*
	 * We implement validate() method and add errors if any field validation
	 * fails. Spring provides org.springframework.validation.ValidationUtils
	 * utility class for basic validations such as null or empty. Once this
	 * method returns, spring framework binds the Errors object to the
	 * BindingResult object that we use in our controller handler method.
	 * 
	 * Notice that ValidationUtils.rejectIfEmptyOrWhitespace() last argument
	 * takes the key name for message resources. This way we can provide
	 * localized error messages to the user.
	 */
	public void validate(Object obj, Errors errors) {

		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "empName", "empName.required");

		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "empSalary", "empSalary.required");
		
		Employee employee = (Employee) obj;
		System.out.println("in validate");

		if (employee.getEmpSalary() < 0) {
			errors.rejectValue("empSalary", "negativeValue", new Object[] { "Salary" }, "Salary can't be Negative");
		}
	}

}
