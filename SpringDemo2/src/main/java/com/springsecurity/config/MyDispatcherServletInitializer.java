package com.springsecurity.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

//this class is to initilize the dispathcher servlet normally in web.xml file we do this

public class MyDispatcherServletInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getServletConfigClasses() {
		return null;
		
	}

	@Override
	protected Class<?>[] getRootConfigClasses() {
		return new Class[] { com.springsecurity.config.MainConfig.class };
		
	}

	@Override
	protected String[] getServletMappings() {
		return new String[] { "/" };
	}

}
