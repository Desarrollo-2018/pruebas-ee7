/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.com.atel.cdiex1;

import gt.com.atel.assigncar.implementation.CarService;
import gt.com.atel.assignofficeimplementation.AssignItOfficeImpl;
import gt.com.atel.assignofficeimplementation.AssignOfficeImplementation;
import gt.com.atel.bossassigner.implementation.BossAssignerService;
import gt.com.atel.decorator.IvaAssignerDecorator;
import gt.com.atel.decorator.IvaAssignerService;
import gt.com.atel.events.EventoProducer;
import gt.com.atel.greeting.GreetingService;
import gt.com.atel.greeting.Position;
import gt.com.atel.greeting.TypeOfPosition;
import gt.com.atel.idgeneratorimplementation.IdentificationGenerator;
import gt.com.atel.interceptors.AssignSalary;
import gt.com.atel.qualifiers.AccountingOffice;
import gt.com.atel.qualifiers.CarAssigner;
import gt.com.atel.qualifiers.PersonIdGenerator;
import gt.com.atel.qualifiers.TypeOfCars;
import java.io.Serializable;
import java.util.logging.Logger;
import javax.annotation.PostConstruct;
import javax.decorator.Decorator;
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
    private String carAssigned;
    private String bossAssigned;
    private String greeting;
    private String salaryAssigned;
    private String ivaAssignment;

    
    @Inject
    @PersonIdGenerator
    private IdentificationGenerator idGenerator;
    
    @Inject
    @AccountingOffice
    private AssignOfficeImplementation assignOfficeImpl;
    
    @Inject

    @CarAssigner(type = TypeOfCars.MAZDA)
    private CarService carService;
    
    @Inject
    private BossAssignerService bossAssignerService;
    
    @Inject
    @Position(type = TypeOfPosition.MANAGER)
    private GreetingService greetingServiceManager;
    
    @Inject
    @Position(type = TypeOfPosition.SUPERVISOR)
    private GreetingService greetingServiceSupervisor;
    
    @Inject
    private transient Logger loggerEmployees;
  
    @Inject
    private AssignSalary assignSalary;
    
    @Inject
    private IvaAssignerService ivaAssigner;
    
    @Inject
    private EventoProducer eventoProducer;
    
    /*@Inject
    private IvaAssignerDecorator ivaAssignerDecorator;*/
    
    @PostConstruct
    public void init(){
        this.employeeId = this.idGenerator.generateNumber();
        this.officeAssigned = this.assignOfficeImpl.assignOffice();
        this.carAssigned = this.carService.assignCarToEmployee();
        loggerEmployees.info("Before assigning boss for employee");
        this.bossAssigned = this.bossAssignerService.assignBoss();
        this.loggerEmployees.info(this.bossAssigned);
        loggerEmployees.info("After boss assignment");
        this.greeting = this.greetingServiceSupervisor.greetEmployee();
        //this.salaryAssigned = this.assignSalary.getSalary();
        this.salaryAssigned = "$3,000.00";
        this.ivaAssignment = ivaAssigner.getIVA();
        eventoProducer.guardarEmpleado("Victor Manuel", "Pinzon Reyes");
        loggerEmployees.info("After save employee");
        
    }
    
    

    public String getBossAssigned() {
        return bossAssigned;
    }

    public String getIvaAssignment() {
        return ivaAssignment;
    }

    public void setIvaAssignment(String ivaAssignment) {
        this.ivaAssignment = ivaAssignment;
    }

    public void setBossAssigned(String bossAssigned) {
        this.bossAssigned = bossAssigned;
    }
    
    
    public String getCarAssigned() {
        return carAssigned;
    }

    
    public void setCarAssigned(String carAssigned) {
        this.carAssigned = carAssigned;
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

    public String getGreeting() {
        return greeting;
    }

    public void setGreeting(String greeting) {
        this.greeting = greeting;
    }
    
    

}
