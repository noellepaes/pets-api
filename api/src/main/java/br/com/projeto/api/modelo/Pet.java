package br.com.projeto.api.modelo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
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

    
    @Column
    private String nome;
    
    @Column
    private String apelido;
    
    @Column
    private String raca;
    
    @Column
    private String especie;
    
    @Column
    private String nomeDono;
    
    @Column
    private Number telefoneDono;
      
    
   
}