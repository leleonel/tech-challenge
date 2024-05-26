package br.com.fiap.techchallenge.domain.service;

import br.com.fiap.techchallenge.domain.model.Cliente;
import br.com.fiap.techchallenge.domain.port.ClientePort;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class ClienteServiceTest {

    @Mock
    private ClientePort port;

    @InjectMocks
    private ClienteService clienteService;

    private Cliente cliente;

    @BeforeEach
    void setUp() {
        cliente = new Cliente();
        cliente.setNome("Maria");
        cliente.setCpf("12345678900");
        cliente.setEmail("maria@email.com");
    }

    @Test
    void testCadastrarCliente() {
        clienteService.cadastrarCliente(cliente);

        verify(port, times(1)).cadastrarCliente(cliente);
    }

    @Test
    void testRetornarCliente() {
        when(port.retornarCliente("12345678900")).thenReturn(cliente);

        Cliente foundCliente = clienteService.retornarCliente("12345678900");

        assertEquals(cliente, foundCliente);
        verify(port, times(1)).retornarCliente("12345678900");
    }
}
