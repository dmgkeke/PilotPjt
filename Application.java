package com.sds.anyframe.mobile.amplt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.context.embedded.FilterRegistrationBean;
import org.springframework.boot.orm.jpa.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.sds.anyframe.mobile.amplt.filter.CORSFilter;

@EnableAutoConfiguration
@EntityScan("com.sds.anyframe.mobile.amplt.rest.vo")
@EnableJpaRepositories("com.sds.anyframe.mobile.amplt.rest.service.dao")
@ComponentScan({"com.sds.anyframe.mobile.amplt.controller", "com.sds.anyframe.mobile.amplt.rest", "com.sds.anyframe.mobile.amplt.db.hsql", "com.sds.anyframe.mobile.amplt.filter", "com.sds.anyframe.mobile.amplt.rest.service.dao"})
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
	
	@Bean
    public FilterRegistrationBean filterRegistrationBean() {
        FilterRegistrationBean registrationBean = new FilterRegistrationBean();
        CORSFilter corsFilter = new CORSFilter();
        registrationBean.setFilter(corsFilter);
        registrationBean.setOrder(1);
        return registrationBean;
    }
}