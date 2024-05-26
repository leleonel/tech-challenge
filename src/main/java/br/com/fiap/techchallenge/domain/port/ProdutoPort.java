package br.com.fiap.techchallenge.domain.port;

import br.com.fiap.techchallenge.domain.model.Produto;

public interface ProdutoPort {
    void cadastrarProduto(Produto produto);
    Produto retornarProdutoPorCategoria(String tipo);
    void removerProduto(String nome);
    void atualizarProduto(Produto produto);
}
