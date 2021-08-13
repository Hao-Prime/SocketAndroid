package com.se.thymeleafdemo;

import java.util.logging.Logger;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.hateoas.config.EnableHypermediaSupport;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableHypermediaSupport(type = EnableHypermediaSupport.HypermediaType.HAL)
public class ThymeleafdemoApplication {
private Logger logger = Logger.getLogger(getClass().getName());
	public static void main(String[] args) {
		SpringApplication.run(ThymeleafdemoApplication.class, args);
	}
        @Bean
       public RestTemplate getRestTemplate() {
          return new RestTemplate();
       }

}
