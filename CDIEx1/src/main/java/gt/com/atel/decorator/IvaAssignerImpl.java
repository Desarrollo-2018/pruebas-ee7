/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.com.atel.decorator;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

/**
 *
 * @author atel
 */
@Named("IvaAssignerImpl")
@RequestScoped
public class IvaAssignerImpl implements IvaAssignerService {

    @Override
    public String getIVA() {
        return "Your IVA is $13.00";
    }
    
}
