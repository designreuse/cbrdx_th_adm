package com.ciberdix.th.config;

import com.google.common.base.Predicate;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.ParameterBuilder;
import springfox.documentation.schema.ModelRef;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import static com.google.common.base.Predicates.or;
import static com.google.common.collect.Lists.newArrayList;
import static springfox.documentation.builders.PathSelectors.regex;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

    @Value("${api.version}")
    String apiVersion;

    @Bean
    public Docket postsApi() {
        return new Docket(DocumentationType.SWAGGER_2).groupName("private-api")
                .apiInfo(apiInfo()).select().paths(postPaths()).build()
                .globalOperationParameters(
                        newArrayList(new ParameterBuilder()
                                .name("Authorization")
                                .description("eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJjYXJsb3NfdG9ycmVzIiwiYXVkaWVuY2UiOiJ3ZWIiLCJjcmVhdGVkIjoxNDkzNzUyODc4ODY0LCJ1c3VhcmlvIjp7ImlkVXN1YXJpbyI6MTAsInVzdWFyaW9TaXN0ZW1hIjoiY2FybG9zX3RvcnJlcyIsImNvbnRyYXNlbmEiOiIkMmEkMTAka1FrQkNPN09RYWFKNk1Oemh4aWZUZU0xMDhxSmRwLlFtSkFaNy9Gb0xQRXI5OFNOM1JPZmUiLCJ1c3VhcmlvTGRhcCI6ZmFsc2UsImZlY2hhSW5hY3RpdmFjaW9uIjoiMjAxNy0wNC0xNyIsImlkVGVyY2VybyI6MTI5LCJpbmRpY2Fkb3JIYWJpbGl0YWRvIjp0cnVlLCJhdWRpdG9yaWFVc3VhcmlvIjoyLCJhdWRpdG9yaWFGZWNoYSI6MTQ4MTE1NTIwMDAwMCwiY29ycmVvRWxlY3Ryb25pY28iOiJjYXJsb3N0b3JyZXNAY2liZXJkaXguY29tIn0sImV4cCI6MTQ5NDM1NzY3OCwibm9tYnJlIjoiQ2FybG9zIEVucmlxdWUgVG9ycmVzIEJhcnJpb3MiLCJub21icmVDb3J0byI6IkNhcmxvcyBUb3JyZXMifQ.U-lVvACBRcqTMwrbqfRR7tCKU1tb115XT4Cyah1rrqHi5os3k1fJaJH7hSIZDe6bWfmC5ZJXVDlq8xNBOXn2Ng")
                                .modelRef(new ModelRef("string"))
                                .parameterType("header")
                                .required(true)
                                .build()));
    }

    private Predicate<String> postPaths() {
        return or(regex("/api.*"));
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder().title("TH API")
                .description("API reference for developers")
                .termsOfServiceUrl("http://ciberdix.com")
                .license("License").contact(new Contact("Ciberdix S.A.S", "www.ciberdix.com", "info@ciberdix.com"))
                .licenseUrl("desarrollo@ciberdix.com").version(apiVersion).build();
    }

}
