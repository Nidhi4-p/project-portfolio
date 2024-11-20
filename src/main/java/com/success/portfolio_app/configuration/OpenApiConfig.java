package com.success.portfolio_app.configuration;


import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springdoc.core.models.GroupedOpenApi;


@OpenAPIDefinition(
        info = @Info(
                title = "Portfolio-app API",
                version = "v1",
                description = "Backend services to create User Portfolios"
        )
)
@Configuration
public class OpenApiConfig {

}
