package com.cg.m1.question1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class M2AssessmentQuestion1Application {

	public static void main(String[] args) {
		SpringApplication.run(M2AssessmentQuestion1Application.class, args);
	}
	@Bean
	public Docket generateApi()
	{
		return new Docket(DocumentationType.SWAGGER_2).select().apis(RequestHandlerSelectors.basePackage("com.cg.m1.question1")).build();
	}
}
