package com.example.projeto_09_11_26.controller;

import com.example.projeto_09_11_26.model.Veiculo;
import com.example.projeto_09_11_26.service.VeiculoService;
import jakarta.validation.Valid;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/veiculo")
@Slf4j
public class VeiculoController {

    @Autowired
    VeiculoService veiculoService;

    @GetMapping(path = "/busca")
    public ResponseEntity<List<Veiculo>> buscaTodosVeiculos() {
        List<Veiculo> response = veiculoService.buscarTodosVeiculos();
        return ResponseEntity.ok(response);
    }

    @PostMapping
    public ResponseEntity<Veiculo> salvarVeiculo(@Valid @RequestBody Veiculo veiculo){
        log.info("salvarVeiculo() - veiculo:{}", veiculo );
        return ResponseEntity.created(null).body(veiculo);
    }

    @PutMapping()
    public ResponseEntity<?> update(@RequestBody Veiculo veiculo){
        veiculo.setId(10L);
        return ResponseEntity.ok(veiculo);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable Long id) {
//        Veiculo response = alunoService.buscarPorId(id);
//        if (response == null) {
//            return ResponseEntity.notFound().build();
//        }
//        alunoService.excluir(id);
        return ResponseEntity.ok(null);
    }





}
