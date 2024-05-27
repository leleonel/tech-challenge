package br.com.fiap.techchallenge.domain.service;

import br.com.fiap.techchallenge.domain.model.Produto;
import br.com.fiap.techchallenge.domain.port.ProdutoPort;
import br.com.fiap.techchallenge.domain.usecase.ProdutoUseCase;
import lombok.AllArgsConstructor;

import java.util.List;

@AllArgsConstructor
public class ProdutoService implements ProdutoUseCase {

    ProdutoPort port;

    @Override
    public void cadastrarProduto(Produto produto) {
        port.cadastrarProduto(produto);

    }

    @Override
    public List<Produto> retornarProdutoPorCategoria(String categoria) {
        return port.retornarProdutoPorCategoria(categoria);
    }


    @Override
    public void removerProduto(String nome) {
        port.removerProduto(nome);
    }

    @Override
    public void atualizarProduto(Produto produto) {
        port.atualizarProduto(produto);
    }

}
