package com.springmvc.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CourseCodeConstraintValidator
        implements ConstraintValidator<CourseCode, String> {

    private String coursePrefix;

    @Override
    public void initialize(CourseCode constraintAnnotation) {
        this.coursePrefix = constraintAnnotation.value();
    }

    @Override
    public boolean isValid(String enteredCode,
                           ConstraintValidatorContext constraintValidatorContext) {

        boolean result;

        if(enteredCode != null){
            result = enteredCode.startsWith(coursePrefix);
        }else{
            result = true;
        }

        return result;
    }
}
