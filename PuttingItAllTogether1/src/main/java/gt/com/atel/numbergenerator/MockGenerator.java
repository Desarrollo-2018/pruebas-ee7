/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.com.atel.numbergenerator;

import gt.com.atel.qualifiers.ThirteenDigits;
import java.util.Random;
import java.util.logging.Logger;
import javax.enterprise.inject.Alternative;
import javax.inject.Inject;

/**
 *
 * @author atel
 */
@ThirteenDigits
@Alternative
public class MockGenerator implements NumberGeneratorService {
    
    @Inject
    private Logger logger;

    @Override
    public String generateNumber() {
        String mock = "MOCK-" + Math.abs(new Random().nextInt());
        logger.info("logg test");
        return mock;
    }
    
}
