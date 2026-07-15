package br.com.samuelsouza.gestao_vagas;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@OpenAPIDefinition(
        info = @Info(
                title = "Gestao de vagas",
                description = "API responsavel pela gestao de vagas",
                version = "1.0"
        )
)
public class GestaoVagasApplication {

    public static void main(String[] args) {
        SpringApplication.run(GestaoVagasApplication.class, args);
    }

}
