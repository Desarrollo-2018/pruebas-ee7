/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.com.atel.interceptors;

import java.util.logging.Logger;
import javax.inject.Inject;
import javax.interceptor.AroundConstruct;
import javax.interceptor.AroundInvoke;
import javax.interceptor.Interceptor;
import javax.interceptor.InvocationContext;

/**
 *
 * @author atel
 */
@Interceptor
@Loggable
public class LoggerInterceptorBinding {
    
    @Inject
    private Logger logger;
    
    @AroundConstruct
    private void init(InvocationContext ic) throws Exception{
        logger.info("Init del interceptor");
        try{
            ic.proceed();
        }finally{
            logger.info("Fin del interceptor");
        }
    }
    
    @AroundInvoke
    private Object logMethod(InvocationContext ic) throws Exception{
        logger.info("Init de la invocacion del interceptor");
        try{
            return ic.proceed();
        }finally{
            logger.info("Fin de la invaocacioón del interceptor");
        }
    }
    
}
