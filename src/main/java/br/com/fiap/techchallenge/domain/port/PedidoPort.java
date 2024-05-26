package br.com.fiap.techchallenge.domain.port;

import br.com.fiap.techchallenge.domain.enums.StatusPedidoEnum;
import br.com.fiap.techchallenge.domain.model.Pedido;
import br.com.fiap.techchallenge.domain.model.Produto;

import java.util.List;

public interface PedidoPort {

    void criarPedido(List<Produto> pedido);
    void atualizarPedido(Long id, StatusPedidoEnum status);
    List<Pedido> retornarPedidos();

}
