package com.ehsproy.msCustomersCompany;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class MsCustomersCompanyApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsCustomersCompanyApplication.class, args);
	}

}
