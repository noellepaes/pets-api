package br.com.projeto.api.controle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import br.com.projeto.api.modelo.Pet;
import br.com.projeto.api.repositorio.RepositorioPet;

import java.util.List;

@RestController
public class Controle {
    
    // @PostMapping("/pet")
    // public Pet pet(@RequestBody Pet p){
    //     return p;
    // }

    @Autowired
    private RepositorioPet repositorioPet;

    @GetMapping("/pet")
    public List<Pet> listaPets(){
        return (List<Pet>) repositorioPet.findAll();
    }

    @PostMapping("/pet")
    @ResponseStatus(HttpStatus.CREATED)
    public Pet add(@RequestBody Pet pet){
        return repositorioPet.save(pet);
    }
    
}
