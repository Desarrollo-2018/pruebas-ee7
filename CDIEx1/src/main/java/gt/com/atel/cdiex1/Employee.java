/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.com.atel.cdiex1;

import gt.com.atel.assignofficeimplementation.AssignItOfficeImpl;
import gt.com.atel.assignofficeimplementation.AssignOfficeImplementation;
import gt.com.atel.idgeneratorimplementation.IdentificationGenerator;
import gt.com.atel.interceptors.AssignSalary;
import gt.com.atel.qualifiers.AccountingOffice;
import gt.com.atel.qualifiers.PersonIdGenerator;
import java.io.Serializable;
import java.util.logging.Logger;
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
    private String officeAssigned;
    private String salaryAssigned;
    
    @Inject
    @PersonIdGenerator
    private IdentificationGenerator idGenerator;
    
    @Inject
    @AccountingOffice
    private AssignOfficeImplementation assignOfficeImpl;
    
    @Inject
    private transient Logger loggerEmployees;
    
    @Inject
    private AssignSalary assignSalary;
    
    @PostConstruct
    public void init(){
        this.employeeId = this.idGenerator.generateNumber();
        this.officeAssigned = this.assignOfficeImpl.assignOffice();
        this.salaryAssigned = this.assignSalary.getSalary();
        loggerEmployees.info("This is a test");
    }

    public String getSalaryAssigned() {
        return salaryAssigned;
    }

    public void setSalaryAssigned(String salaryAssigned) {
        this.salaryAssigned = salaryAssigned;
    }
    
    public String getOfficeAssigned() {
        return officeAssigned;
    }

    public void setOfficeAssigned(String officeAssigned) {
        this.officeAssigned = officeAssigned;
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
