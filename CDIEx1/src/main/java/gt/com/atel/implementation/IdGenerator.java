/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.com.atel.implementation;

import java.util.Random;
import javax.enterprise.inject.Default;
import javax.enterprise.inject.Model;

/**
 *
 * @author atel
 */
@Default
@Model
public class IdGenerator implements IdentificationGenerator {
   
    
    @Override
    public String generateNumber() {
        return "AXCD-" + Integer.toString(new Random().nextInt());
    }
}
