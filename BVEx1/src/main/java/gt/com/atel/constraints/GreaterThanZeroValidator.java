/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.com.atel.constraints;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

/**
 *
 * @author atel
 */
public class GreaterThanZeroValidator implements ConstraintValidator<GreaterThanZero, Integer> {

    @Override
    public void initialize(GreaterThanZero constraintAnnotation) {}

    @Override
    public boolean isValid(Integer value, ConstraintValidatorContext context) {
        System.out.println("**** SE LANZO CONSTRAINT");
        System.out.println("**** VALOR: " + value.toString());
        return value > 0;
    }
    
}
