package com.example.projeto_09_11_26.controller;

import com.example.projeto_09_11_26.model.Veiculo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/veiculo")
@Slf4j
public class VeiculoController {

    @GetMapping
    public ResponseEntity<String> hello() {
        return ResponseEntity.ok("Hello, World!");
    }

    @GetMapping(path = "/busca")
    public ResponseEntity<Veiculo> buscaVeiculo() {
        Veiculo v1 = new Veiculo();
        v1.setId(1L);
        v1.setMarca("Fiat");
        v1.setModelo("Uno");
        return ResponseEntity.ok(v1);
    }

}
