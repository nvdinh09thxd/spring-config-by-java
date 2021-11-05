package edu.vinaenter.configs;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import edu.vinaenter.models.Country;
import edu.vinaenter.models.Student;

@Configuration
@ComponentScans({ @ComponentScan(value = "edu.vinaenter.*") })
public class ApplicationContextConfig {
	@Bean("viewResolver")
	public InternalResourceViewResolver getViewResolver() {
		InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
		viewResolver.setPrefix("/WEB-INF/pages/");
		viewResolver.setSuffix(".jsp");
		return viewResolver;
	}

	@Bean(name = "country1", initMethod = "init", destroyMethod = "destroy")
	@Scope(value = "prototype")
	public Country country11() {
		Country country = new Country("Da Nang 1");
		return country;
	}

	@Bean(name = "country2", initMethod = "init", destroyMethod = "destroy")
	@Scope(value = "prototype")
	public Country country22() {
		Country country = new Country("Da Nang 2");
		return country;
	}

	@Bean
	@Autowired
	public Student student(Country country2) {
		return new Student(country2);
	}

}
