package br.com.fiap.techchallenge.domain.service;

import br.com.fiap.techchallenge.domain.enums.CategoriaProdutoEnum;
import br.com.fiap.techchallenge.domain.model.Produto;
import br.com.fiap.techchallenge.domain.port.ProdutoPort;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class ProdutoServiceTest {

    @Mock
    private ProdutoPort port;

    @InjectMocks
    private ProdutoService produtoService;

    private Produto produto;

    @BeforeEach
    void setUp() {
        produto = new Produto();
        produto.setNome("Produto Teste");
        produto.setCategoria(CategoriaProdutoEnum.LANCHE);
        produto.setDescricao("Descrição do Produto Teste");
        produto.setPreco(new BigDecimal("100.00"));
    }

    @Test
    void testCadastrarProduto() {
        produtoService.cadastrarProduto(produto);

        verify(port, times(1)).cadastrarProduto(produto);
    }

    @Test
    void testRetornarProdutoPorCategoria() {
        when(port.retornarProdutoPorCategoria("CATEGORIA_TESTE")).thenReturn(produto);

        Produto result = produtoService.retornarProdutoPorCategoria("CATEGORIA_TESTE");

        assertEquals(produto, result);
        verify(port, times(1)).retornarProdutoPorCategoria("CATEGORIA_TESTE");
    }

    @Test
    void testRemoverProduto() {
        produtoService.removerProduto("Produto Teste");

        verify(port, times(1)).removerProduto("Produto Teste");
    }

    @Test
    void testAtualizarProduto() {
        produtoService.atualizarProduto(produto);

        verify(port, times(1)).atualizarProduto(produto);
    }
}
