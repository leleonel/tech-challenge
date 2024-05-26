package br.com.fiap.techchallenge.domain.service;

import br.com.fiap.techchallenge.domain.model.Cliente;
import br.com.fiap.techchallenge.domain.port.ClientePort;
import br.com.fiap.techchallenge.domain.usecase.ClienteUseCase;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class ClienteService implements ClienteUseCase {

    ClientePort port;


    @Override
    public void cadastrarCliente(Cliente cliente) {

        port.cadastrarCliente(cliente);
    }

    @Override
    public Cliente retornarCliente(String cpf) {
        return port.retornarCliente(cpf);
    }


}
