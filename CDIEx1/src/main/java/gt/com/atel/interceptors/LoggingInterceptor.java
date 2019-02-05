/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.com.atel.interceptors;

import java.util.logging.Logger;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;
import javax.interceptor.AroundConstruct;
import javax.interceptor.AroundInvoke;
import javax.interceptor.InvocationContext;

/**
 *
 * @author atel
 */
@Named("loggingInterceptor")
@RequestScoped
public class LoggingInterceptor {
    
    @Inject
    private Logger logger;
    
    @AroundConstruct
    private void init(InvocationContext ic)throws Exception{
        logger.info("Entering constructor");
        try{
            ic.proceed();
        }finally{
            logger.info("Exiting constructor");
        }
    }
    
    @AroundInvoke
    private Object logMethod(InvocationContext ic) throws Exception{
        logger.info("Entering invocation interceptor");
        try{
            return ic.proceed();
        }finally{
            logger.info("Exiting invocation interceptor");
        }
    }
}
