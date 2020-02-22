package com.luv2code.springdemo.mvc.validation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;
//20.1.1_
 //CourseCodeConstraintValidator is the helper class that contains business rules
@Constraint(validatedBy = CourseCodeConstraintValidator.class)

// in the line below we are basically saying that these are the places where we want to apply these annotations(on methods of fields)
@Target({ ElementType.METHOD, ElementType.FIELD } )

//the line below will say how long the annotation wil be stored or used?
@Retention(RetentionPolicy.RUNTIME)
public @interface CourseCode {
	
		//define default course code
		public String value() default "LUV";
	//define default error message 
		public String message() default "must start with LUV";
		
	//define default groups
		public Class<?>[] groups() default{};
		
	// define default payloads
		public Class<? extends Payload>[] payload() default{};
	
	
	
	

}
