package com.vaccine;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableEurekaClient
public class Application {

	//vaccin-service
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

//		@Bean
//	    @LoadBalanced
//	    public RestTemplate restTemplate() {
//	        RestTemplate restTemplate = new RestTemplate();
//	  //      restTemplate.setInterceptors(Collections.singletonList(new LoadBalancerInterceptor(loadBalancerClient)));
//	        return restTemplate;
//	    }
	
		@LoadBalanced
		@Bean
		public RestTemplate restTemplate()
		{
			return new  RestTemplate();
		}
		
		
		
}
