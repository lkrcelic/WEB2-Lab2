package web2.lab2.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class QueryValidator implements ConstraintValidator<QueryValidation, String> {


    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {

        return true; // Replace with your own logic
    }
}

