package br.com.fiap.techchallenge.domain.port;

import br.com.fiap.techchallenge.domain.model.Produto;

import java.util.List;

public interface ProdutoPort {
    void cadastrarProduto(Produto produto);
    List<Produto> retornarProdutoPorCategoria(String tipo);
    void removerProduto(String nome);
    void atualizarProduto(Produto produto);
}
