package br.com.accounts;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableSwagger2
@Configuration
@ComponentScan(basePackages = {"br.com.accounts", "br.com.accounts.controller", "br.com.accounts.model"})
public class SwaggerConfig {

	ApiInfo apiInfo() {
		return new ApiInfoBuilder().title("API for registering new accounts in 'MyContas'")
				.description("API for registering new accounts in 'MyContas'").license("Apache 2.0")
				.licenseUrl("http://www.apache.org/licenses/LICENSE-2.0.html").termsOfServiceUrl("").version("1.0.0")
				.contact(new Contact("", "", "adilson.ro.silva@gamil.com")).build();
	}

	@Bean
	public Docket customImplementation() {
		return new Docket(DocumentationType.SWAGGER_2).select()
				.apis(RequestHandlerSelectors.any()).build().apiInfo(apiInfo());
	}

}
