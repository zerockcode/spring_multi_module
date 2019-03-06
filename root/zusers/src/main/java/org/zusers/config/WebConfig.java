package org.zusers.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import lombok.extern.log4j.Log4j;

@Log4j
public class WebConfig extends AbstractAnnotationConfigDispatcherServletInitializer   {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		
		log.info("ZUsers getRootConfigClasses......................");
		
	    return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		
		log.info("ZUsers getServletConfigClasses......................");
		
		return new Class[] {ServletConfig.class};
	}

	@Override
	protected String[] getServletMappings() {
		return new String[] { "/" };
	}

}
