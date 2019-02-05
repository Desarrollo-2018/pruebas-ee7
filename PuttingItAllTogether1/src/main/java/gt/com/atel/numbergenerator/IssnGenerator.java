/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.com.atel.numbergenerator;

import gt.com.atel.qualifiers.EightDigits;
import java.util.Random;

/**
 *
 * @author atel
 */
@EightDigits
public class IssnGenerator implements NumberGeneratorService {

    @Override
    public String generateNumber() {
        String issn = "8-" + Math.abs(new Random().nextInt());
        return issn;
    }
    
}
