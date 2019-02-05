/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.com.atel.events;

import java.util.logging.Logger;
import javax.enterprise.context.RequestScoped;
import javax.enterprise.event.Event;
import javax.inject.Inject;
import javax.inject.Named;

/**
 *
 * @author atel
 */
@Named
@RequestScoped
public class EventoProducer {
 
    @Inject
    private Logger logger;
    
    @Inject
    private Event<String> guardarEmpleadoEvento;
    
    public boolean guardarEmpleado(String nombre, String apellido){
        StringBuilder nombreCompleto = new StringBuilder();
        nombreCompleto.append(nombre).append(" ").append(apellido);
        logger.info(nombreCompleto.toString());
        guardarEmpleadoEvento.fire(nombreCompleto.toString());
        return true;
    }
}
