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
import gt.com.atel.greeting.GreetingService;
import gt.com.atel.greeting.Position;
import gt.com.atel.greeting.TypeOfPosition;
import gt.com.atel.idgeneratorimplementation.IdentificationGenerator;
import gt.com.atel.qualifiers.AccountingOffice;
import gt.com.atel.qualifiers.CarAssigner;
import gt.com.atel.qualifiers.PersonIdGenerator;
import gt.com.atel.qualifiers.TypeOfCars;
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
    private String officeAssigned;
    private String carAssigned;
    private String bossAssigned;
    private String greeting;
    
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
    
    @PostConstruct
    public void init(){
        this.employeeId = this.idGenerator.generateNumber();
        this.officeAssigned = this.assignOfficeImpl.assignOffice();
        this.carAssigned = this.carService.assignCarToEmployee();
        this.bossAssigned = this.bossAssignerService.assignBoss();
        this.greeting = this.greetingServiceSupervisor.greetEmployee();
    }

    public String getBossAssigned() {
        return bossAssigned;
    }

    public void setBossAssigned(String bossAssigned) {
        this.bossAssigned = bossAssigned;
    }
    
    
    public String getCarAssigned() {
        return carAssigned;
    }

    
    public void setCarAssigned(String carAssigned) {
        this.carAssigned = carAssigned;
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
