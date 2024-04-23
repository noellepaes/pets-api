package br.com.projeto.api.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "pets")
public class Pet {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long cogigo;

    private String nome;
    private String apelido;
    private String raca;
    private String especie;
    private String nomeDono;
    private Number telefoneDono;

    
    
    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    
    public String getApelido() {
        return apelido;
    }
    
    public void setApelido(String apelido) {
        this.apelido = apelido;
    }
    
    
    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    
    public String getEspecie() {
        return especie;
    }
    
    public void setEspecie(String especie) {
        this.especie = especie;
    }
    
    
    public String getNomeDono() {
        return nomeDono;
    }
    
    public void setNomeDono(String nomeDono) {
        this.nomeDono = nomeDono;
    }
    
    
    public Number getTelefoneDono() {
        return telefoneDono;
    }

    public void setTelefoneDono(Number telefoneDono) {
        this.telefoneDono = telefoneDono;
    }
    
}