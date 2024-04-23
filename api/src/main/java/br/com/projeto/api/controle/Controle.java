package br.com.projeto.api.controle;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.projeto.api.modelo.Pet;

@RestController
public class Controle {
    
    @PostMapping("/pet")
    public Pet pet(@RequestBody Pet p){
        return p;
    }
}
