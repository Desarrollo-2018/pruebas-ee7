/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.com.atel.constraints;

import static java.lang.annotation.ElementType.ANNOTATION_TYPE;
import static java.lang.annotation.ElementType.CONSTRUCTOR;
import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.ElementType.PARAMETER;
import static java.lang.annotation.ElementType.TYPE;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import javax.validation.Constraint;
import javax.validation.Payload;

/**
 *
 * @author atel
 */
@Constraint(validatedBy = {})
@Target({METHOD, TYPE, PARAMETER, FIELD, CONSTRUCTOR, ANNOTATION_TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface UrlConstraint {
    
    String message() default "Url Constraint has happened";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};

    String protocol() default "";
    String host() default "";
    int port() default -1;
}
