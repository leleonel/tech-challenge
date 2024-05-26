package br.com.fiap.techchallenge.adapters.out;

import br.com.fiap.techchallenge.adapters.out.repository.PedidoRepository;
import br.com.fiap.techchallenge.domain.enums.StatusPedidoEnum;
import br.com.fiap.techchallenge.domain.model.Pedido;
import br.com.fiap.techchallenge.domain.model.Produto;
import br.com.fiap.techchallenge.domain.port.PedidoPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class PedidoAdapter implements PedidoPort {

    @Autowired
    PedidoRepository repository;

    @Override
    public void criarPedido(List<Produto> produtos) {

        Pedido pedido = new Pedido();
        pedido.setProdutos(produtos);
        pedido.setStatus(StatusPedidoEnum.RECEBIDO);

        repository.save(pedido);
    }

    @Override
    public void atualizarPedido(Long id, StatusPedidoEnum status) {

        try {

            Pedido pedido = repository.findByIdWithProdutos(id);
            pedido.setStatus(status);
            repository.save(pedido);

        }catch (Exception e){
            throw new RuntimeException("Não foi possível atualizar pedido" + e);
        }
    }

    @Override
    public List<Pedido> retornarPedidos() {

        try{
            List<Pedido> pedidos = repository.findAll();
            return pedidos.stream()
                    .distinct()
                    .collect(Collectors.toList());

        }catch (Exception e){
            throw new RuntimeException("Não foi possível retornar lista de pedidos." + e);
        }
    }
}
