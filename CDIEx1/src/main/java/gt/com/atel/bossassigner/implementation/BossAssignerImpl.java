/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.com.atel.bossassigner.implementation;

import gt.com.atel.interceptors.LoggingInterceptor;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
import javax.interceptor.Interceptors;

/**
 *
 * @author atel
 */
@Named("bossAssignerImpl")
@RequestScoped
public class BossAssignerImpl implements BossAssignerService{

    @Override
    @Interceptors(LoggingInterceptor.class)
    public String assignBoss() {
        return "Your boss will be John";
    }
    
}
