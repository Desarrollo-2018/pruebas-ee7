/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.com.atel.logger;

import gt.com.atel.qualifiers.Loggable;
import java.util.logging.Logger;
import javax.inject.Inject;
import javax.interceptor.AroundInvoke;
import javax.interceptor.Interceptor;
import javax.interceptor.InvocationContext;

/**
 *
 * @author atel
 */
@Loggable
@Interceptor
public class LogInterceptor {
    
    @Inject
    private Logger logger;
    
    @AroundInvoke
    public Object logMethod(InvocationContext ic) throws Exception{
        logger.info("Llamando interceptor Around Invoke");
        logger.entering(ic.getTarget().getClass().getName(), ic.getMethod().getName());
        try{
            return ic.proceed();
        }finally{
            logger.info("Finalizando llamada a interceptor");
            logger.exiting(ic.getTarget().getClass().getName(), ic.getMethod().getName());
        }
    }
}
