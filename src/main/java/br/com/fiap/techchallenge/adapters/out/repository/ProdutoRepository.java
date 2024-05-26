package br.com.fiap.techchallenge.adapters.out.repository;

import br.com.fiap.techchallenge.domain.enums.CategoriaProdutoEnum;
import br.com.fiap.techchallenge.domain.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long> {

    Produto findByCategoria(CategoriaProdutoEnum categoria);
    Produto findByNome(String nome);
    boolean existsByNome(String nome);

}
