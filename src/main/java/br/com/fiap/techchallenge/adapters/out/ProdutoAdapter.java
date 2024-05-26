package br.com.fiap.techchallenge.adapters.out;

import br.com.fiap.techchallenge.adapters.out.repository.ProdutoRepository;
import br.com.fiap.techchallenge.domain.enums.CategoriaProdutoEnum;
import br.com.fiap.techchallenge.domain.model.Produto;
import br.com.fiap.techchallenge.domain.port.ProdutoPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ProdutoAdapter implements ProdutoPort {

    @Autowired
    ProdutoRepository repository;

    @Override
    public void cadastrarProduto(Produto produto) {

        try {
            if (repository.existsByNome(produto.getNome())) {
                throw new RuntimeException(String.format("Produto %s já existe na base de produtos cadastrados.", produto.getNome()));
            }
            repository.save(produto);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }


    @Override
    public Produto retornarProdutoPorCategoria(String categoria) {
        return repository.findByCategoria(CategoriaProdutoEnum.valueOf(categoria.toUpperCase()));
    }

    @Override
    public void removerProduto(String nome) {
        Produto produto = repository.findByNome(nome);
        repository.delete(produto);
    }

    @Override
    public void atualizarProduto(Produto produto) {
        Produto produtoAtualizado = repository.findByNome(produto.getNome());
        produtoAtualizado.setNome(produto.getNome());
        produtoAtualizado.setCategoria(produto.getCategoria());
        produtoAtualizado.setDescricao(produto.getDescricao());
        produtoAtualizado.setPreco(produto.getPreco());

        repository.save(produtoAtualizado);
        repository.delete(produto);


    }
}
