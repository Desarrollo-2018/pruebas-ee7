/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.com.atel.greeting;

import java.io.Serializable;
import javax.enterprise.context.RequestScoped;
import javax.enterprise.inject.Produces;
import javax.inject.Named;

/**
 *
 * @author atel
 */
@Named("greetingCardFactory")
@RequestScoped
public class GreetingCardFactory implements Serializable {
    
    @Produces
    @Position(type = TypeOfPosition.SUPERVISOR)
    public GreetingService getGreetingSupervisor(){
        return new GreetingSupervisorImpl();
    }
    
    @Produces
    @Position(type = TypeOfPosition.MANAGER)
    public GreetingService getGreetingManager(){
        return new GreetingManagerImpl();
    }
}
