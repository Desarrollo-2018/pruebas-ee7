/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.com.atel.interceptors;

import java.util.logging.Logger;
import javax.enterprise.context.Dependent;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;
import javax.interceptor.AroundInvoke;
import javax.interceptor.InvocationContext;

/**
 *
 * @author victor
 */
@Named("assignSalary")
@RequestScoped
public class AssignSalary {
    
    @Inject
    private transient Logger loggerEmployees;
 
    public String getSalary(){
        loggerEmployees.info("Calculating salary");
        return "Your salary will be $2,500.00";
    }
    
    @AroundInvoke
    private Object invokeBeforeInvocation(InvocationContext ic) throws Exception{
        loggerEmployees.info("Before invocation");
        loggerEmployees.info(ic.getTarget().toString());
        try{
            return ic.proceed();
        }finally{
            loggerEmployees.info("Finishing the invocation part");
        }
    }
    
    
}
