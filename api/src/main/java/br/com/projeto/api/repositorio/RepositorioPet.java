package br.com.projeto.api.repositorio;
import org.springframework.data.repository.CrudRepository;

import br.com.projeto.api.modelo.Pet;

public interface RepositorioPet extends CrudRepository <Pet, Long> {
    
}
