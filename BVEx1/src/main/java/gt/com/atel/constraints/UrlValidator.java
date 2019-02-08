/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.com.atel.constraints;

import java.net.MalformedURLException;
import java.net.URL;
import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

/**
 *
 * @author atel
 */
public class UrlValidator implements ConstraintValidator<UrlConstraint, String> {
    
    private String protocol;
    private String host;
    private int port;

    @Override
    public void initialize(UrlConstraint url) {
        this.protocol = url.protocol();
        this.host = url.host();
        this.port = url.port();
    }

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        
        if (value == null || value.length() == 0) return true;
        
        URL url;
        
        //Valida si la URL esta bien formada
        try{
            url = new URL(value);
        }catch(MalformedURLException e){
            return false;
        }
        
        //Valida si se tiene un protocolo válido
        if (protocol != null && protocol.length() > 0 && !url.getProtocol().equals(protocol)) return false;
        
        if (host != null && host.length() > 0 && !url.getHost().startsWith(host)) return false;
        
        return !(port != -1 && url.getPort() != port);
    }

 


   
}
