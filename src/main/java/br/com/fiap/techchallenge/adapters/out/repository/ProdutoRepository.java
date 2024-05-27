package br.com.fiap.techchallenge.adapters.out.repository;

import br.com.fiap.techchallenge.domain.enums.CategoriaProdutoEnum;
import br.com.fiap.techchallenge.domain.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long> {

    List<Produto> findAllByCategoria(CategoriaProdutoEnum categoria);
    Produto findByNome(String nome);
    boolean existsByNome(String nome);

}
