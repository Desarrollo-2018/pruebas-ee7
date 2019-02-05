/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.com.atel.assigncar.implementation;

import gt.com.atel.interceptors.Loggable;

/**
 *
 * @author atel
 */
public interface CarService {
    
    @Loggable
    public String assignCarToEmployee();
    
}
