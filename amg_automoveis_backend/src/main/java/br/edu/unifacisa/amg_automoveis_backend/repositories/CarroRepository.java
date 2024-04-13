package br.edu.unifacisa.amg_automoveis_backend.repositories;

import br.edu.unifacisa.amg_automoveis_backend.entities.Carro;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarroRepository extends JpaRepository<Carro, Long> {
}
