/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.com.atel.idgeneratorimplementation;

import gt.com.atel.qualifiers.EmployeeIdGeneretor;
import java.util.Random;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

/**
 *
 * @author atel
 */
@Named("employeeIdGeneratorImpl")
@RequestScoped
@EmployeeIdGeneretor
public class EmployeeIdGeneratorImpl implements IdentificationGenerator {
   
    
    @Override
    public String generateNumber() {
        return "EMPAXCD-" + Integer.toString(new Random().nextInt());
    }
}
