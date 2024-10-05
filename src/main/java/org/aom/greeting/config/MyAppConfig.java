package org.aom.greeting.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

@Configuration
@ComponentScan("org.aom.greeting")
//@EnableWebMvc
public class MyAppConfig implements WebMvcConfigurer {
	
	 @Bean
	   public InternalResourceViewResolver resolver() {
	      InternalResourceViewResolver resolver = new InternalResourceViewResolver();
	      resolver.setViewClass(JstlView.class);
	      resolver.setPrefix("/WEB-INF/views/");
	      resolver.setSuffix(".jsp");
	      return resolver;
	   }
	
//	private static final String[] CLASSPATH_RESOURCE_LOCATIONS = { "classpath:/META-INF/resources/",
//	        "classpath:/resources/", "classpath:/static/", "classpath:/public/", "/" };
	
//	/*
//	 * @Override public void addResourceHandlers(ResourceHandlerRegistry registry) {
//	 * registry.addResourceHandler("/**").addResourceLocations(
//	 * CLASSPATH_RESOURCE_LOCATIONS); }
//	 */

//	@Override
//	public void addViewControllers(ViewControllerRegistry registry) {
//	    registry.addRedirectViewController("/", "/home.html");
//	}

//	@Override
//	public void addViewControllers(ViewControllerRegistry registry) {
//		//registry.addViewController("/").setViewName("/index.html");
//		//registry.addViewController("/").setViewName("forward:/index.html");
//		//registry.addViewController("/home").setViewName("myhome");
//		//registry.addViewController("/").setViewName("forward:/public/home.html");
//		//registry.addViewController("/").setViewName("forward:/home.html");
//		//registry.addViewController("/").setViewName("redirect:/home.html");
//		//registry.setOrder(Ordered.HIGHEST_PRECEDENCE);
//		
//		//registry.addRedirectViewController("/", "home.html");
//		//registry.addViewController("/").setViewName("forward:/index.html");
//	}
	
//	@Override
//	public void addResourceHandlers(ResourceHandlerRegistry registry) {
//		// registry.addResourceHandler("/*.html").addResourceLocations("/WEB-INF/html/");
//		//the below is needed to display the home.html page as default instead of index.jsp when accessing the website http://localhost:8080/spring-mvc-maven-web/
//		//http://localhost:8080/spring-mvc-maven-web/
//		registry.addResourceHandler("/*.html").addResourceLocations("/");
//		registry.addResourceHandler("/*.html").addResourceLocations("/WEB-INF/pages/");
//		registry.addResourceHandler("/css/**").addResourceLocations("/css/");
//		registry.addResourceHandler("/js/**").addResourceLocations("/js/");
//		registry.addResourceHandler("/img/**").addResourceLocations("/img/");
//		registry.setOrder(Ordered.HIGHEST_PRECEDENCE);
//	}
}