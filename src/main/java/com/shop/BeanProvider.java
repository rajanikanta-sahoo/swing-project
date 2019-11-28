/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.shop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

/**
 *
 * @author Lulu
 */
@Component
public class BeanProvider {
    private static ApplicationContext applicationContext;

    /**
     * Autowires the specified object in the spring context
     * 
     * @param object
     */
    public static void autowire(Object object) {
        applicationContext.getAutowireCapableBeanFactory().autowireBean(object);
    }

    @Autowired
    private void setApplicationContext(ApplicationContext applicationContext) {
        BeanProvider.applicationContext = applicationContext;
    }

}
