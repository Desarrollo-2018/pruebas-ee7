/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.com.atel.assignofficeimplementation;

import gt.com.atel.qualifiers.ItOffice;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

/**
 *
 * @author victor
 */
@Named("assignItOfficeImpl")
@RequestScoped
@ItOffice
public class AssignItOfficeImpl implements AssignOfficeImplementation {

    @Override
    public String assignOffice() {
        return "You were assign to IT";
    }
    
}
