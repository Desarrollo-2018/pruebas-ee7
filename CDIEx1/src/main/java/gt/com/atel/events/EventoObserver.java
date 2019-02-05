/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.com.atel.events;

import java.util.logging.Logger;
import javax.enterprise.context.RequestScoped;
import javax.enterprise.event.Event;
import javax.enterprise.event.Observes;
import javax.inject.Inject;
import javax.inject.Named;

/**
 *
 * @author atel
 */
@Named
@RequestScoped
public class EventoObserver {
    
    @Inject
    private Logger logger;
    
    private Event<String> guardarEmpleadoEvento;
    
    public void checkEmployee(@Observes String nombre){
        logger.info("Se ejecuto evento");
        logger.info(nombre);
    }
    
}
