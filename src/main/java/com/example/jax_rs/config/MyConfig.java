package com.example.jax_rs.config;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.example.jax_rs.CompteRestJaxRSAPI;
import com.example.jax_rs.JaxRsJerseyApplication;

@Configuration
@Primary
public class MyConfig extends ResourceConfig{
	  public MyConfig() {
	
	        register(CompteRestJaxRSAPI.class);
	    }
    @Bean
    public ResourceConfig resourceConfig() {
        ResourceConfig jerseyServlet = new ResourceConfig();
        jerseyServlet.register(JaxRsJerseyApplication.class);
        return jerseyServlet;
    }
}
