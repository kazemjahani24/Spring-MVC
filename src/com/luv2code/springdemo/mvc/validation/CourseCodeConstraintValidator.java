package com.luv2code.springdemo.mvc.validation;
import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

/*
 20.1.2_ 
after creating the CourseCode Annotation, then we will come  here to add the unimplemented
methods for our this class so that we can use them laster
 * */
//ConstrainValidator is an interface from javax package
public class CourseCodeConstraintValidator implements ConstraintValidator<CourseCode,String> { 
	
	private String coursePrefix;
	
	@Override
	public void initialize(CourseCode theCourseCode) {
		coursePrefix = theCourseCode.value();
	}
	
	//in the line below, theCode is actually the HTML form data entered by the user
	//and theConstraintValidatorContext the place where we can place additional error massages
	//here
	/*
	  so again in the isValid method below we can do anything that we want, we can talk to a 
	  database, we can all a web service, do some special number crunching, or do whateever 
	  we want.
	 */
	
	@Override
	public boolean isValid(String theCode, ConstraintValidatorContext theConstraintValidatorContext) {
			boolean result;
			if(theCode !=null) {
				result = theCode.startsWith(coursePrefix);
			}
			else {
				result = true;
			}
		return result;
	}}
