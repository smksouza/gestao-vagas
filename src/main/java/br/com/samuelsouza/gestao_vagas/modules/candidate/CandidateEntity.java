package br.com.samuelsouza.gestao_vagas.modules.candidate;

import io.swagger.v3.oas.annotations.media.Schema;
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
@Entity(name = "candidate")
public class CandidateEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Schema(example = "Samuel de Souza", requiredMode = Schema.RequiredMode.REQUIRED)
    private  String name;

    @Pattern(regexp = "^\\S+$", message = "O Campo [username] nao deve conter espaco ")
    @Schema(example = "samuel", requiredMode = Schema.RequiredMode.REQUIRED)
    private  String username;

    @Email( message = "O Campo [e-mail] deve conter um e-mail valido")
    @Schema(example = "samuel@gmail.com", requiredMode = Schema.RequiredMode.REQUIRED)
    private  String email;

    @Length(min = 5, max = 100, message = "A senha deve conter entre 5 a 12 caracteres")
    @Schema(example = "admin@123", minLength = 5, maxLength = 100, requiredMode = Schema.RequiredMode.REQUIRED)
    private  String password;
    @Schema(example = "Desenvolvedor Java")
    private  String description;
    private  String curriculum;

    @CreationTimestamp
    private LocalDateTime createdAt;
}
