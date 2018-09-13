package com.model;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;


public class EmployeeValidation implements Validator 
{
	
	private Pattern pattern;  
	private Matcher matcher;  

	private static final String EMAIL_PATTERN = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@" + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";  	
	String STRING_PATTERN = "[a-zA-Z]+";  
	String MOBILE_PATTERN = "[0-9]{10}";  
  	

	public boolean supports(Class<?> class1)
	{
		return Employee.class.equals(class1);
	}

	public void validate(Object object, Errors errors) 
	{

		Employee employee = (Employee) object;

		ValidationUtils.rejectIfEmptyOrWhitespace(errors,"name","name.required");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "address","address.required");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "mobile","mobile.required");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "emailid","emailid.required");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "gender", "required.gender");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "favLanguages","required.favLanguages");
		
		
		/*if (employee.getMobileNo().length() < 10 || employee.getMobileNo().length() > 10) 
		{
			errors.rejectValue("mobileNo", "mobileNo.numbervalidation");
	
		}
	*/	

	
        if(employee.getName()!=null)
        {
        	
        	 pattern = Pattern.compile(STRING_PATTERN);  
        	 matcher = pattern.matcher(employee.getName());  
        	   
        	 if (!matcher.matches())
        	 {  
        	
                  errors.rejectValue("name", "name.containNonChar",  
        	      "Enter a valid name");  
        	
        	 }  
        	 
        }
	
	
        
        
        if (employee.getMobile() != null)
        {  
        	   
        	   pattern = Pattern.compile(MOBILE_PATTERN);  
        	   matcher = pattern.matcher(employee.getMobile());  
        	   
        	   if (!matcher.matches()) 
        	   {  
            	    errors.rejectValue("mobile", "mobile.incorrect",  
         	      "Enter a correct mobile number");  
        	   
        	   }  
        	  
        
        }  
        	  
                if(employee.getEmailid()!=null)
        		{  
        	   pattern = Pattern.compile(EMAIL_PATTERN);  
        	   matcher = pattern.matcher(employee.getEmailid());  
        	   if (!matcher.matches()) {  
        	    errors.rejectValue("emailid", "email.incorrect",  
        	      "Enter a correct email");  
        	   }  
        	  }  
                
         
                if("NONE".equals(employee.getCountry()))
                {
            		errors.rejectValue("country", "required.country","Select country please!");
                }
           
                
	}

}
