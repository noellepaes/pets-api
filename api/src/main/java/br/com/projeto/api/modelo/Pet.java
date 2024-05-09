package br.com.projeto.api.modelo;

import org.hibernate.validator.constraints.Length;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Entity
@Data
@Getter
@Setter
@Table(name = "pets")
public class Pet {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codigo;

    
    @Column @NotNull @NotEmpty @Length(max = 25)
    private String nome;
    
    @Column
    private String apelido;
    
    @Column
    private String raca;
    
    @Column
    private String especie;
    
    @Column @NotNull @NotEmpty @Length(max = 255)
    private String nomeDono;
    
    @NotNull
    private Long telefoneDono;
      
    @ManyToOne
    private Dono dono;
   
}