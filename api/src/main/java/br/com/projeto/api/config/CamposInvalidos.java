package br.com.projeto.api.config;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CamposInvalidos {
    
    private String campo;
    private String erro;
}
