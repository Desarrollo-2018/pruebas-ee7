/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.com.atel.logger;

import java.io.Serializable;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.enterprise.context.Dependent;
import javax.enterprise.context.RequestScoped;
import javax.enterprise.inject.Produces;
import javax.enterprise.inject.spi.InjectionPoint;
import javax.inject.Named;

/**
 *
 * @author victor
 */
@Named("loggerEmployees")
@Dependent
public class LoggerEmployees implements Serializable {
    
    @Produces
    public Logger getEmployeeLogger(InjectionPoint injectionPoint){
        Logger logger = Logger.getLogger(injectionPoint.getMember().getDeclaringClass().getName());
        logger.setLevel(Level.ALL);
        return logger;
    }
    
}
