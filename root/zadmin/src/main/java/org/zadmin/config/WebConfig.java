package org.zadmin.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import lombok.extern.log4j.Log4j;

@Log4j
public class WebConfig extends AbstractAnnotationConfigDispatcherServletInitializer   {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		
		log.info("ZAdmin getRootConfigClasses......................");
		
	    return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		
		log.info("ZAdmin getServletConfigClasses......................");
		
		return new Class[] {ServletConfig.class};
	}

	@Override
	protected String[] getServletMappings() {
		return new String[] { "/" };
	}

}
