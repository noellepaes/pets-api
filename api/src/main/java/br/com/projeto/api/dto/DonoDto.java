package br.com.projeto.api.dto;

import br.com.projeto.api.modelo.Dono;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DonoDto {
    
    private Long id;
    private String nome;
    private String email;
    private String telefone;

    public DonoDto(Dono dono) {

        this.id = dono.getId();
        this.nome = dono.getNome();
        this.email = dono.getEmail();
        this.telefone = dono.getTelefone();
    }
}
