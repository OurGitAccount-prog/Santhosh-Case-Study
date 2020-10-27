package org.hcl.config;




import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class MyDispatcherServletInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
    @Override
	protected Class<?>[] getRootConfigClasses() {
	return new Class[] {ApplicationContext.class};
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
	return new Class[] {SpringMvcConfig.class};
	}

	@Override
	protected String[] getServletMappings() {
		return new String[] {"/"};
	}

}