/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.com.atel.assigncar.implementation;

import gt.com.atel.qualifiers.CarAssigner;
import gt.com.atel.qualifiers.TypeOfCars;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

/**
 *
 * @author atel
 */
@Named("bmwCarServiceImpl")
@RequestScoped
@CarAssigner(type = TypeOfCars.BMW)
public class BmwCarServiceImpl implements CarService {

    @Override
    public String assignCarToEmployee() {
        return "You were assigned with a BMW car";
    }
    
}
