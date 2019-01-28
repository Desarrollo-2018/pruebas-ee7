/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.com.atel.cdiex1;

import gt.com.atel.implementation.IdGenerator;
import gt.com.atel.implementation.IdentificationGenerator;
import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;

/**
 *
 * @author atel
 */
@Named
@SessionScoped
public class Employee implements Serializable {
    
    private String name;
    private String lastName;
    private String employeeId;
    
    @Inject
    private IdentificationGenerator identificationGenerator;
    
    @PostConstruct
    public void init(){
        this.employeeId = this.identificationGenerator.generateNumber();
    }
    
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

}
