package br.edu.unifacisa.amg_automoveis_backend.controllers;

import br.edu.unifacisa.amg_automoveis_backend.entities.Carro;
import br.edu.unifacisa.amg_automoveis_backend.repositories.CarroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping("/carros")
public class CarroController {
    @Autowired
    private CarroRepository repository;

    @GetMapping
    public List<Carro> listarTodosOsCarros() {
        return repository.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity <Carro> getCarroPorId(@PathVariable Long id) {
        try {
            return new ResponseEntity<>(repository.findById(id).get(), HttpStatus.OK) ;
        } catch (NoSuchElementException ex) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping
    public Carro adicionarCarro(@RequestBody Carro novo) {
        return repository.save(novo);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity <Void> removerPorId (@PathVariable Long id) {
        try {
            repository.deleteById(id);
            return new ResponseEntity<>(HttpStatus.OK);
        } catch (NoSuchElementException ex) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PutMapping("/{id}")
    public ResponseEntity<Carro> alterarCarroPorId(@PathVariable Long id, @RequestBody Carro novosDados) {
        try {
            Carro carroAntigo = repository.findById(id).get();

            carroAntigo.setMarca(novosDados.getMarca());
            carroAntigo.setModel(novosDados.getModel());

            return new ResponseEntity<>(repository.save(carroAntigo), HttpStatus.OK);
        } catch (NoSuchElementException ex) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
