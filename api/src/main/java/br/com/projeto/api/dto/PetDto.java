package br.com.projeto.api.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import br.com.projeto.api.modelo.Dono;
import br.com.projeto.api.modelo.Pet;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;

import java.util.List;
import java.util.stream.Collectors;

import org.hibernate.validator.constraints.Length;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class PetDto {
 
    private Long codigo;

    private String nome;
    private String apelido;
    private String raca;
    private String especie;
    private String nomeDono;
    private Number telefoneDono;
    private Dono dono;
    
    public PetDto(Pet pet) {
        this.codigo = pet.getCodigo();
        this.nome = pet.getNome();
        this.apelido = pet.getApelido();
        this.raca = pet.getRaca();
        this.especie = pet.getEspecie();
        this.nomeDono = pet.getNomeDono();
        this.telefoneDono = pet.getTelefoneDono();
        this.dono = pet.getDono();
    }

    public static List<PetDto> convert(List<Pet> pet){
        return pet.stream().map(PetDto::new).collect(Collectors.toList());
    }
    
}


