package br.com.fiap.techchallenge.domain.service;

import br.com.fiap.techchallenge.domain.enums.StatusPedidoEnum;
import br.com.fiap.techchallenge.domain.model.Pedido;
import br.com.fiap.techchallenge.domain.model.Produto;
import br.com.fiap.techchallenge.domain.port.PedidoPort;
import br.com.fiap.techchallenge.domain.usecase.PedidoUseCase;
import lombok.AllArgsConstructor;

import java.util.List;


@AllArgsConstructor
public class PedidoService implements PedidoUseCase {


    PedidoPort port;

    @Override
    public void criarPedido(List<Produto> produtos) {
        port.criarPedido(produtos);
    }

    @Override
    public void atualizarPedido(Long id, StatusPedidoEnum status)  {
        port.atualizarPedido(id, status);
    }

    @Override
    public List<Pedido> listarPedidos() {
        return port.retornarPedidos();
    }

}
