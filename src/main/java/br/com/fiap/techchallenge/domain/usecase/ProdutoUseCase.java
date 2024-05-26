package br.com.fiap.techchallenge.domain.usecase;

import br.com.fiap.techchallenge.domain.model.Produto;

public interface ProdutoUseCase {

    void cadastrarProduto(Produto produto);
    Produto retornarProdutoPorCategoria(String categoria);
    void removerProduto(String nome);
    void atualizarProduto(Produto produto);
}
