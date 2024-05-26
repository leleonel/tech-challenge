package br.com.fiap.techchallenge.domain.port;

import br.com.fiap.techchallenge.domain.model.Cliente;


public interface ClientePort {

    void cadastrarCliente(Cliente cliente);

    Cliente retornarCliente(String cpf);
}
