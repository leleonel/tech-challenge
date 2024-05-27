package br.com.fiap.techchallenge.adapters.out.repository;

import br.com.fiap.techchallenge.domain.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long> {

    Cliente findByCpf(String cpf);
    boolean existsByCpf(String cpf);
}
