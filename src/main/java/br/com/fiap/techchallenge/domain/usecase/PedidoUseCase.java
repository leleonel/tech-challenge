package br.com.fiap.techchallenge.domain.usecase;

import br.com.fiap.techchallenge.domain.enums.StatusPedidoEnum;
import br.com.fiap.techchallenge.domain.model.Pedido;
import br.com.fiap.techchallenge.domain.model.Produto;

import java.util.List;

public interface PedidoUseCase {

    void criarPedido(List<Produto> pedido);

    void atualizarPedido(Long id, StatusPedidoEnum status);

    List<Pedido> listarPedidos();


}
