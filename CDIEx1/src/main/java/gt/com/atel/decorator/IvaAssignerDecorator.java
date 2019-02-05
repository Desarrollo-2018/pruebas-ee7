/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.com.atel.decorator;

import java.util.logging.Logger;
import javax.decorator.Decorator;
import javax.decorator.Delegate;
import javax.inject.Inject;

/**
 *
 * @author atel
 */
@Decorator
public class IvaAssignerDecorator implements IvaAssignerService {
    
    @Inject
    @Delegate
    private IvaAssignerService ivaAssigner;
    
    @Inject
    private Logger logger;

    @Override
    public String getIVA() {
        logger.info("Before decorator");
        return ivaAssigner.getIVA() + " starting at the end of the month";
    }
    
}
