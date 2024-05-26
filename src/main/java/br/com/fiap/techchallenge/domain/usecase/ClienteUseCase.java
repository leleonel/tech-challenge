package br.com.fiap.techchallenge.domain.usecase;

import br.com.fiap.techchallenge.domain.model.Cliente;

public interface ClienteUseCase {

    void cadastrarCliente(Cliente cliente);

    Cliente retornarCliente(String cpf);
}
