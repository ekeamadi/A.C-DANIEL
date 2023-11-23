package za.co.CrudApi.configuration;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@OpenAPIDefinition()
public class OpenAPIConfig {


    @Bean
    public OpenAPI openAPI() {
        return new OpenAPI()
                .components( new Components() )
                .info( getApiInfo() );
    }

    private Info getApiInfo() {
        return new Info()
                .title( " Enviro365 Assessment for DANIEL CHMEZIE" )
                .description( "Application for Scrum Bank Clients Account_Number, First_Name, LastName and SA ID_Number." )
                .version( "2.0.0" )
                .contact( new Contact().name( "Enviro365I.TSolutions@co.za" ).url( "https://enviro365.co.za" ).email( "careers@enviro365.co.za" ) );
    }

}
