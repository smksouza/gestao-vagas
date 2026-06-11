package br.com.samuelsouza.gestao_vagas.modules.candidate;


import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Pattern;
import lombok.Data;
import org.hibernate.validator.constraints.Length;

import java.util.UUID;
@Data
public class CandidateEntity {

    private UUID id;
    private  String name;

    @Pattern(regexp = "^(?!\\\\s*$).+", message = "O Campo [username] nao deve conter espaco ")
    private  String username;

    @Email( message = "O Campo [e-mail] deve conter um e-mail valido")
    private  String email;

    @Length(min = 5, max = 12)
    private  String password;
    private  String description;
    private  String curriculum;
}
