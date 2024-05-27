package br.com.fiap.techchallenge.domain.usecase;

import br.com.fiap.techchallenge.domain.model.Produto;

import java.util.List;

public interface ProdutoUseCase {

    void cadastrarProduto(Produto produto);
    List<Produto> retornarProdutoPorCategoria(String categoria);
    void removerProduto(String nome);
    void atualizarProduto(Produto produto);
}
