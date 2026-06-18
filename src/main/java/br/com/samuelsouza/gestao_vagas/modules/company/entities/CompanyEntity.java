package br.com.samuelsouza.gestao_vagas.modules.company.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Pattern;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.validator.constraints.Length;

import java.time.LocalDateTime;
import java.util.UUID;

@Data
@Entity(name = "company")
public class CompanyEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Pattern(regexp = "^\\S+$", message = "O Campo [username] nao deve conter espaco ")
    private String username;

    @Email( message = "O Campo [e-mail] deve conter um e-mail valido")
    private String email;

    @Length(min = 5, max = 100, message = "A senha deve conter entre 5 a 12 caracteres")
    private String password;
    
    private String name;
    private String website;
    private String description;

    @CreationTimestamp
    private LocalDateTime createdAt;
}
