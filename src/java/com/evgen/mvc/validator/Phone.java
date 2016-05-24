package com.evgen.mvc.validator;

import javax.validation.Constraint;
import java.lang.annotation.*;
import javax.validation.Payload;
 
@Documented
@Constraint(validatedBy = PhoneConstraintValidator.class)
@Target( { ElementType.METHOD, ElementType.FIELD })
@Retention(RetentionPolicy.RUNTIME)
public @interface Phone {
 String message() default "{Phone}";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};    
}
