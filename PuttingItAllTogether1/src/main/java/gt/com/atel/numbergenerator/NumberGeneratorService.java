/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.com.atel.numbergenerator;

import gt.com.atel.qualifiers.Loggable;

/**
 *
 * @author atel
 */
public interface NumberGeneratorService {
    
    @Loggable
    public String generateNumber();
}
