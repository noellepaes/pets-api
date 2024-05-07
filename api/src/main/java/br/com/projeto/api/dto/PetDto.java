package br.com.projeto.api.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import br.com.projeto.api.modelo.Pet;
import java.util.List;
import java.util.stream.Collectors;


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
    
    public PetDto(Pet pet) {
        this.codigo = pet.getCodigo();
        this.nome = pet.getNome();
        this.apelido = pet.getApelido();
        this.raca = pet.getRaca();
        this.especie = pet.getEspecie();
        this.nomeDono = pet.getNomeDono();
        this.telefoneDono = pet.getTelefoneDono();
    }

    public static List<PetDto> convert(List<Pet> pet){
        return pet.stream().map(PetDto::new).collect(Collectors.toList());
    }
    
}
