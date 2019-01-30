/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.com.atel.greeting;

import java.io.Serializable;

/**
 *
 * @author atel
 */
public class GreetingManagerImpl implements GreetingService, Serializable {

    @Override
    public String greetEmployee() {
        return "You were selected to be our next manager";
    }
    
}
