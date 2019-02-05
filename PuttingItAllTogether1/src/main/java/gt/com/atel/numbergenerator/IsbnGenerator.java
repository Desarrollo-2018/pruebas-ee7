/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.com.atel.numbergenerator;

import gt.com.atel.qualifiers.ThirteenDigits;
import java.util.Random;

/**
 *
 * @author atel
 */
@ThirteenDigits
public class IsbnGenerator implements NumberGeneratorService {

    @Override
    public String generateNumber() {
        String isbn = "13-84356" + Math.abs(new Random().nextInt());
        return isbn;
    }
    
}
