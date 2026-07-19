package br.com.samuelsouza.gestao_vagas.modules.company.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ProfileCandidateResponseDTO {

    @Schema(example = "Desenvolvedor Java")
    private String description;
    @Schema(example = "Samuel_Souza")
    private String username;
    @Schema(example = "samuel@gmail.com")
    private String email;
    private UUID id;
    @Schema(example = "Samuel Souza")
    private String name;
}
