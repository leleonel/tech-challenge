package br.com.fiap.techchallenge.domain.model;

import br.com.fiap.techchallenge.domain.enums.StatusPedidoEnum;
import jakarta.persistence.*;
import lombok.NonNull;

import java.util.List;

@Entity
public class Pedido {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NonNull
    @OneToMany(mappedBy = "pedido", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.EAGER)
    private List<Produto> produtos;
    private StatusPedidoEnum status;

    public Pedido(Long id, @NonNull List<Produto> produtos, StatusPedidoEnum status) {
        this.id = id;
        this.produtos = produtos;
        this.status = status;
    }

    public Pedido(){}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public @NonNull List<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(@NonNull List<Produto> pedido) {
        this.produtos = pedido;
        for (Produto produto : pedido){
            produto.setPedido(this);
        }
    }

    public StatusPedidoEnum getStatus() {
        return status;
    }

    public void setStatus(StatusPedidoEnum status) {
        this.status = status;
    }
}
