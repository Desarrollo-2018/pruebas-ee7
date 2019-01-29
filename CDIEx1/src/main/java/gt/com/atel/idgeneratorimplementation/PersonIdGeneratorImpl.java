/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.com.atel.idgeneratorimplementation;

import java.util.Random;
import gt.com.atel.qualifiers.EmployeeIdGeneretor;
import gt.com.atel.qualifiers.PersonIdGenerator;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

/**
 *
 * @author victor
 */
@Named("personIdGeneratorImpl")
@RequestScoped
@PersonIdGenerator
public class PersonIdGeneratorImpl implements IdentificationGenerator {

    @Override
    public String generateNumber() {
        return "PERTEW-" + Integer.toString(new Random().nextInt());
    }
    
}
