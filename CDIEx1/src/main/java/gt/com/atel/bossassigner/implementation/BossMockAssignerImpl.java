/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.com.atel.bossassigner.implementation;

import javax.enterprise.context.RequestScoped;
import javax.enterprise.inject.Alternative;
import javax.inject.Named;

/**
 *
 * @author atel
 */
@Named("bossMockAssignerImpl")
@RequestScoped
@Alternative
public class BossMockAssignerImpl implements BossAssignerService {

    @Override
    public String assignBoss() {
        return "This is a mock test";
    }
    
}
