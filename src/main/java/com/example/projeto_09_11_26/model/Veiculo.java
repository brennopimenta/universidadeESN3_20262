package com.example.projeto_09_11_26.model;

import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class Veiculo {

    private Long id;

    @Size(min = 2, max = 50, message = "O nome deve ter entre 2 e 50 caracteres")
    private String marca;
    private String modelo;
}
