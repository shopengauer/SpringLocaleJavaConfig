/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.pavlov.springlocalejavaconfig.config;

import javax.servlet.Filter;
import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.web.filter.CharacterEncodingFilter;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

/**
 *
 * @author pavlov
 */
public class Config extends AbstractAnnotationConfigDispatcherServletInitializer{

    @Override
    protected Class<?>[] getRootConfigClasses() {
        return null;//new Class<?>[]{RootConfig.class}; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class<?>[]{WebConfig.class}; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"}; //To change body of generated methods, choose Tools | Templates.
    }
   
    @Override
    protected Filter[] getServletFilters() {
        
        CharacterEncodingFilter cef = new CharacterEncodingFilter();
        cef.setEncoding("UTF-8");
        Filter[] filters = new Filter[]{cef};      
        return filters; //To change body of generated methods, choose Tools | Templates.
    } 

    

}
