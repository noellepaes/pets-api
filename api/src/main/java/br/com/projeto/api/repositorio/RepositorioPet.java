package br.com.projeto.api.repositorio;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.data.domain.Pageable;




import br.com.projeto.api.modelo.Pet;

public interface RepositorioPet extends JpaRepository <Pet, Long> {
    
    Page<Pet> findByNomeContaining(String nome, Pageable pageable);
}
