package com.example.projeto_09_11_26.service;

import com.example.projeto_09_11_26.model.Veiculo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VeiculoService {

    public List<Veiculo> buscarTodosVeiculos() {
        Veiculo v1 = new Veiculo();
        v1.setId(1L);
        v1.setMarca("Fiat");
        v1.setModelo("Uno");
        return List.of(v1);
    }

}
