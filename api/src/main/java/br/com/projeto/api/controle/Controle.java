package br.com.projeto.api.controle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import br.com.projeto.api.dto.PetDto;
import br.com.projeto.api.modelo.Pet;
import br.com.projeto.api.repositorio.RepositorioPet;
import jakarta.validation.Valid;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/pet")
public class Controle {

    @Autowired
    private RepositorioPet repositorioPet;


    @GetMapping
    public List<PetDto> listaPets(){
    Iterable<Pet> petsIterable = repositorioPet.findAll();
    List<Pet> petsList = new ArrayList<>();
    petsIterable.forEach(petsList::add);
    return PetDto.convert(petsList);
    }

    @GetMapping("/{petId}")
    public ResponseEntity<PetDto> buscarPorId(@PathVariable Long petId){
    Optional<Pet> pet = repositorioPet.findById(petId);
        if (pet.isPresent()){
            return ResponseEntity.ok(new PetDto(pet.get()));
        }
        return ResponseEntity.notFound().build();
    }

   

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Pet add(@Valid @RequestBody Pet pet){
        return repositorioPet.save(pet);
    }
    
    @PutMapping("/{petId}")
    public ResponseEntity<Pet> update(@PathVariable Long petId, @RequestBody Pet pet){

      

        if(!repositorioPet.existsById(petId)){
            return ResponseEntity.notFound().build();
        }
    
        Pet existingPet = repositorioPet.findById(petId).get();
        existingPet.setNome(pet.getNome()); 
        existingPet.setApelido(pet.getApelido());
        existingPet.setRaca(pet.getRaca());
        existingPet.setEspecie(pet.getEspecie());
        existingPet.setNomeDono(pet.getNomeDono());
        existingPet.setTelefoneDono(pet.getTelefoneDono());
        
        
        Pet updatedPet = repositorioPet.save(existingPet);
        return ResponseEntity.ok(updatedPet);
    }


    @DeleteMapping("/{petId}")
    public ResponseEntity<Void> delete(@PathVariable Long petId){

        if(!repositorioPet.existsById(petId)){
            return ResponseEntity.notFound().build();
        }

        repositorioPet.deleteById(petId);
        return ResponseEntity.noContent().build();
    }

}
